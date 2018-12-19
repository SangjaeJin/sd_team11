import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Payment {
	private String customerId;
	private int bills;
	private LocalDateTime date;
	
	public Payment(String id,int bills, LocalDateTime date) {
		this.customerId=id;
		this.bills=bills;
		this.date=date;
	}
	
	public String getCusId() {
		return customerId;
	}
	
	public int getBills() {
		return bills;
	}
	
	public LocalDateTime getDate() {
		return date;
	}
}
