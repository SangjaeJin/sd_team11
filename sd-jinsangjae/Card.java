import java.time.format.DateTimeFormatter;

public class Card extends Payment {
	
	private String cardSerial;
	
	public Card(String id, int bills, DateTimeFormatter date,String cardSerial) {
		super(id, bills, date);
		this.cardSerial=cardSerial;
		// TODO Auto-generated constructor stub
		
	}

}
