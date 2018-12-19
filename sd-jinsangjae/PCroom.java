import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class PCroom {
	private String name;
	private String location;
	private List<Seat> seats;
	private int computerNum;
	private HashMap<String, Customer> idAndCusts;
	private int row,col;
	private boolean loginState ;
	private boolean ownerLoginState;
	private Events events;
	private Reviews reviews;
	private Owner owner;
	private List<Payment> payments;
	
	public PCroom(Owner owner,String name,String location,int row ,int col,int computerNum) {
		this.name=name;
		this.location=location;
		this.seats=new ArrayList<>();
		this.computerNum= computerNum;
		this.idAndCusts=new HashMap<>();
		this.row=row;
		this.col=col;
		this.loginState=this.ownerLoginState=false;
		this.events= new Events();
		this.reviews= new Reviews();
		this.payments= new ArrayList<>();
		this.owner=owner;
		int a=0;
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++)
				seats.add(new Seat(a++));
		}
	}
	
	public int getComNum() {
		return computerNum;
	}
	
	public String getName() {
		return name;
	}
	
	public String getLocation() {
		return location;
	}
	
	public Seat getOnePc(int num) {
		return seats.get(num-1);
	}
	
	public Reviews getReviews() {
		return reviews;
	}
	
	public Events getEvents() {
		return events;
	}
	
	public boolean login(String id,String pwd) {
		if(id.equals(owner.getId()) && pwd.equals(owner.getPwd())){
			ownerLoginState=true;
			System.out.println("관리자 로그인 되었습니다");
			return true;
		}
		
		else if( idAndCusts.get(id) ==null || idAndCusts.get(id).getPwd().equals(pwd)==false )
			return false;
		
		else if( idAndCusts.get(id).getPwd().equals(pwd) ) {
			loginState=true;
			return true;
		}
		
		return false;
	}
	
	public boolean isLogin() {
		return loginState;
	}
	
	public boolean isOwnerLogin() {
		return ownerLoginState;
	}
	
	
	public void signUp() {
		Scanner sc =new Scanner(System.in);
		
		System.out.println("이름:");  String name= sc.nextLine();
		String id=null;
		
		while(true) {
			System.out.println("아이디:"); id =sc.nextLine();
			if(idAndCusts.get(name)!=null) 
				System.out.println("아이디가 중복됩니다. 다른 아이디를 입력하세요");
			else 
				break;
		}
		
		System.out.println("비밀번호:"); String pwd= sc.nextLine();
		System.out.println("휴대폰번호:"); String phone= sc.nextLine();
		
		
		//sc.close();
		idAndCusts.put(name, new Customer(name,id,pwd,phone));
		System.out.println("회원가입이 완료되었습니다");
	}
	
	public void logout() {
		this.loginState=this.ownerLoginState=false;
	}
	
	public void showSeatState() {
		int a=0;
		
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++)
				System.out.print(++a +"\t");
			System.out.println();
			for(int j=0;j<col;j++) {
				if(seats.get(a-1).isEmpty() ==true)
					System.out.print("◻\t︎");
				else
					System.out.print("☒\t");
			}
			System.out.println();
		}
	}
	
	public Customer getCustomer(String id) {
		return idAndCusts.get(id);
	}
	
	public void addPayment(Payment pay) {
		payments.add(pay);
		this.owner.addPayment(pay);
	}
	
	
}