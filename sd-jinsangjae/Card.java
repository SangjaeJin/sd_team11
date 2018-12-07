import java.time.LocalDateTime;


public class Card extends Payment {
	
	private String cardSerial;
	
	public Card(String id, int bills, LocalDateTime date,String cardSerial) {
		super(id, bills, date);
		this.cardSerial=cardSerial;
		// TODO Auto-generated constructor stub
		
	}

}
