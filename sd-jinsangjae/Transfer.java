
import java.time.format.DateTimeFormatter;

public class Transfer extends Payment {

	private String account;
	public Transfer(String id, int bills, DateTimeFormatter date,String account) {
		super(id, bills, date);
		this.account=account;
		// TODO Auto-generated constructor stub
	}
	

}
