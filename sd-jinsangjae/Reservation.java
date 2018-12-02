import java.time.format.DateTimeFormatter;


public class Reservation {
	private DateTimeFormatter startTime,endTime;
	private String customerId ;
	
	public Reservation(DateTimeFormatter startTime,DateTimeFormatter endTime,String id) {
		this.startTime=startTime;
		this.endTime=endTime;
		this.customerId=id;
	}
}
