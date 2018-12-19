import java.util.ArrayList;
import java.util.List;

public class Seat {
	private int seatNumber;
	//private Reservation reservation;
	private boolean fillState ;
	private List<Reservation> resList;
	
	public Seat(int seatNumber) {
		this.seatNumber=seatNumber;
		//this.reservation=res;
		this.fillState=false;
		resList=new ArrayList<>();
	}
	
	public boolean isEmpty() {
		if(fillState==false)
			return true;
		else
			return false;
			
	}
	
	public int getSeatNum()
	{
		return seatNumber;
	}
	
	public boolean getFillState()
	{
		return fillState;
	}
	
	public void fill() {
		fillState=true;
	}
	
	public void clear() {
		fillState=false;
	}
	
	public boolean setReservation(Reservation res) {
		int i=0;
		resList.sort( (a,b)->a.getStartTime().compareTo(b.getStartTime()));
		
		System.out.println("현재 예약:");
		for(i =0;i<resList.size();i++) 
			System.out.println("시작:"+resList.get(i).getStartTime()+" 종료:"+resList.get(i).getEndTime());;
		
		for(i=0;i<resList.size();i++) {
			if(resList.get(i).getEndTime().isAfter(res.getStartTime()))
				break;
		}
		
		if (i==resList.size()) {
			resList.add(res);
			System.out.println("예약 되었습니다");
			return true;
		}
		else {
			System.out.println("이미 예약 되어있습니다.");
			return false;
		}
		
	}
}