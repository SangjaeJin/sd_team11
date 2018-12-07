import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

import javax.swing.text.DateFormatter;
import javax.xml.bind.DataBindingException;

enum MainFunction{ SEAT,REVIEW,EVENT,PAY,SIGNUP,LOGIN,LOGOUT,SEARCH}



public class Window {

	private static HashMap<String, PCroom> pcroomList;
	
	public static PCroom searchPCroom(String pcrName) {
		if(pcroomList.get(pcrName) ==null)
			return null;
		else
			return pcroomList.get(pcrName);
	}
	
	public static void enrollPCroom(String pcrName,PCroom pcr) {
		pcroomList.put(pcrName,pcr);
	}
	
	public static boolean deletePCroom(String pcrName) {
		if(pcroomList.get(pcrName)== null)
			return false;
		else {
			pcroomList.remove(pcrName);
			return true;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String search=null;
		Scanner sc =new Scanner(System.in);
		pcroomList = new HashMap<>();
		String currUser=null;
		PCroom currentPCroom;
		int choice;
		String masterID = "super";
		String masterPwd= "suepr";
		
		System.out.println("관리자 모드로 실행하길 원하면 y 아니면 n");
		String str= sc.nextLine();
		if(str.equalsIgnoreCase("y")) {
			System.out.println("아이디:"); String id= sc.nextLine();
		    System.out.println("비밀번호:");String pwd=sc.nextLine();
			
			if( ! (id.equals(masterID) && pwd.equals(masterPwd)) )
				System.out.println("아이디 혹은 비밀번호가 잘못되었습니다");
			else {
				System.out.println("관리자 계정으로 로그인 되었습니다");
				
				while(true) {
					System.out.println("1.PC방 등록 2.PC방 삭제");
					int select=  sc.nextInt();
					sc.nextLine();
					
					if(select ==1) {
						System.out.println("owner id:"); String ownerid= sc.nextLine();
						System.out.println("owner pwd:"); String ownerpwd= sc.nextLine();
						System.out.println("pcroom name:"); String pcrName =sc.nextLine();
						System.out.println("pcroom location:"); String location =sc.nextLine();
						System.out.println("row:"); int row =sc.nextInt(); sc.nextLine();
						System.out.println("col:"); int col=sc.nextInt(); sc.nextLine();
						System.out.println("computer num:"); int comNum =sc.nextInt(); sc.nextLine();
						
						enrollPCroom(pcrName, new PCroom(new Owner(ownerid, ownerpwd),pcrName,location,row,col,comNum));
						System.out.println("pc방이 등록되었습니다");
					}
					
					else if(select ==2) {
						System.out.println("삭제하려는 pc방의 이름을 입력하세요"); 
						String pcrName= sc.nextLine();
						if(deletePCroom(pcrName)==true)
							System.out.println("해당 pc방이 삭제되었습니다");
						else
							System.out.println("해당 이름의 pc방이 없습니다");
					}
					
					else
						break;
				}
			}
		}
		
		else {
			while(true) {
				System.out.println("pc방을 검색하세요(프로그램을 종료하려면 exit입력):");
				search = sc.nextLine();
				
				if(search.equalsIgnoreCase("exit")) {
					System.out.println("bye");
					break;
				}
				
				else if( searchPCroom(search)==null ) {  
					System.out.println("해당 pc방이 없습니다\n");
					continue;
				}
				
				else {
					currentPCroom =pcroomList.get(search);
					
						while(true) {
							System.out.println(search+":"+pcroomList.get(search).getLocation());
							System.out.println("1.자리조회or자리예약 2.후기작성 3.이벤트 조회 4.결제 5.회원가입 6.로그인 7.로그아웃 8.다른 pc방 검색");
							
							choice= sc.nextInt();
							sc.nextLine();
							
							if(choice -1 == MainFunction.SEAT.ordinal()) {
								System.out.println("자리상태:");
								currentPCroom.showSeatState();
								
								System.out.println("자리를 예약하시겠습니까? (y/n)");
								String ans= sc.nextLine();
								
								if(ans.equalsIgnoreCase("y")) {
									if(currentPCroom.isLogin()==false) {
										System.out.println("로그인 먼저 하세요");
										String id =sc.nextLine();
										String pwd =sc.nextLine();
										
										if(currentPCroom.login(id, pwd) ==false) {
											System.out.println("아이디 혹은 비밀번호가 일치하지 않습니다.");
											continue;
										}	
									}
						
									System.out.println("예약하고 싶은 자리의 번호를 입력하세요");
									int pcNum= sc.nextInt();
									sc.nextLine();
									
									if(  !(1 <=pcNum && pcNum<=currentPCroom.getComNum())  ) {
										System.out.println("없는 자리입니다.");
										continue;
									}
									
									if(currentPCroom.getOnePc(pcNum).isEmpty()==true) {
										// 결제기능 추가해야 됨  
										
										
										System.out.println("자리가 예약 되엇습니다");
										continue;
									}
								}
							}
							
							else if(choice -1 ==MainFunction.REVIEW.ordinal()) {
								System.out.println("1.리뷰 보기 2.리뷰 작성");
								int select = sc.nextInt();
								sc.nextLine();
								
								if(select ==1 ) 
									currentPCroom.getReviews().show();
								
								else {
									if(currentPCroom.isLogin() ==false)
										System.out.println("로그인 먼저 하세요");
									else {
										System.out.println("리뷰를 작성하세요:");
										String re= sc.nextLine();
										currentPCroom.getReviews().write(re);
									}						
								}
							}
							
							else if(choice -1 ==MainFunction.EVENT.ordinal()) {
								
								//이벤트 등록은 owner만 가능 
								System.out.println("1.이벤트 조회");
								if(currentPCroom.isOwnerLogin()==true)
									System.out.println("2.이벤트 등록");
								
								int select =sc.nextInt();
								sc.nextLine();
								
								if(select ==1)
									currentPCroom.getEvents().show();
								else if(select ==2 && currentPCroom.isOwnerLogin()==true) {
									System.out.println("등록할 이벤트를 적으세요:");
									String event= sc.nextLine();
									currentPCroom.getEvents().write(event);
								}
							}
							
							else if(choice -1 ==MainFunction.PAY.ordinal()) {
								if(currentPCroom.isLogin() ==true) {
									System.out.println("1.계좌이체 2.체크카드");
									int select  = sc.nextInt();
									sc.nextLine();
									System.out.println("얼마를 결제하시겠습니까?");
									int money;
									
									while(true) {
										money =sc.nextInt();
										sc.nextLine();
										if(money<=0) {
											System.out.println("양수만 가능합니다");
											continue;
										}
										else
											break;
									}
									
									if( select ==1) {
										System.out.println("계좌번호 입력하세요");
										Customer account= currentPCroom.getCustomer(currUser);
										Transfer tr= new Transfer(currUser, money, LocalDateTime.now(), );
									}
									
									else {
										
									}
								}
							}
							
							else if(choice -1==MainFunction.SIGNUP.ordinal()) {
								currentPCroom.signUp();
							}
							
							else if(choice -1==MainFunction.LOGIN.ordinal()) {
								System.out.println("id:"); String id =sc.nextLine();
								System.out.println("pwd:"); String pwd= sc.nextLine();
								
								if( currentPCroom.login(id, pwd) ==false) 
									System.out.println("아이디 혹은 비밀번호가 일치하지 않습니다.");
								else {
									System.out.println("로그인 되었습니다.");
									currUser=id;
								}
							}
							
							else if(choice-1 ==MainFunction.LOGOUT.ordinal()) {
								currentPCroom.logout();
								currUser=null;
								System.out.println("로그아웃 되었습니다.");
							}
							
							else if(choice -1==MainFunction.SEARCH.ordinal()) {
								break;
							}
					}
				}	
			}
		}
		sc.close();
	}
}
