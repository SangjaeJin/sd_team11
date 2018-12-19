import java.time.LocalDateTime;


public class Transfer extends Payment {

	private String account;
	public Transfer(String id, int bills, LocalDateTime date,String account) {
		super(id, bills, date);
		this.account=account;
		// TODO Auto-generated constructor stub
	}
	

	public String getAcc() {
		return account;
	}
	
}
