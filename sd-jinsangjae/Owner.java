import java.util.ArrayList;
import java.util.List;

public class Owner extends Person{

	private List<Payment> payList;
	
	public Owner(String id,String pwd) {
		super( id, pwd);
		
		this.payList =new ArrayList<>();
	}
	
	public String getId() {
		return super.getId();
	}
	
	public String getPwd() {
		return super.getPwd();
	}
	
	public void addPayment(Payment pay) {
		payList.add(pay);
		
	}
}
