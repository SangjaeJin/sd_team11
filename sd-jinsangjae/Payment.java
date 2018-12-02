import java.time.format.DateTimeFormatter;

public class Payment {
	private String customerId;
	private int bills;
	private DateTimeFormatter date;
	
	public Payment(String id,int bills,DateTimeFormatter date) {
		this.customerId=id;
		this.bills=bills;
		this.date=date;
	}
	
	
}
