
public class Seat {
	private int seatNumber;
	private Reservation reservation;
	private boolean fillState ;
	
	public Seat(int seatNumber,Reservation res) {
		this.seatNumber=seatNumber;
		this.reservation=res;
		this.fillState=false;
	}
	
	public boolean isEmpty() {
		if(reservation!=null)
			return true;
		else
			return false;
	}
	
	public void fill() {
		fillState=true;
	}
	
	public void clear() {
		fillState=false;
	}
}
