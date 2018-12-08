import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;

import javax.swing.text.DateFormatter;

public class Customer extends Person {

	private String name,phone,account=null,card=null;
	
	public Customer(String name, String id, String pwd, String phone) {
		super(id, pwd);
		this.name=name;
		this.phone=phone;
		
	}

	public Customer(String name,String id,String pwd,String phone, String account,String card) {
		super(id, pwd);
		this.name=name;
		this.phone=phone;
		this.card=card;
		this.account=  account;
	}
	
	
	
	public  void setAccount(String account) {
		this.account=account;
	}
	
	public void  setCard(String card) {
		this.card=card;
	}
	
	public Payment payBill(Payment pay) {
		return pay;
	}

	public String getAccount() {
		return this.account;
	}
	
	public String getCard() {
		return this.card;
	}
}
