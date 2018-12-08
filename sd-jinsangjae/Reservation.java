import java.time.LocalDateTime;



public class Reservation {
	private LocalDateTime startTime,endTime;
	private String customerId ;
	
	public Reservation(LocalDateTime startTime,LocalDateTime endTime,String id) {
		this.startTime=startTime;
		this.endTime=endTime;
		this.customerId=id;
	}
	
	public LocalDateTime getStartTime() {
		return startTime;
	}
	
	public LocalDateTime getEndTime() {
		return endTime;
	}
}
