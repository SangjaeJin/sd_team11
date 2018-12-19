import static org.junit.Assert.*;

import java.time.LocalDateTime;

import org.junit.Test;

public class TransferTest {

//	@Test
//	public void test() {
//		fail("Not yet implemented");
//	}

	
	
	@Test
	public void cardTest() {
		Transfer tr= new Transfer("kang123", 5000, LocalDateTime.of(2018, 2,11,2,12), "1111-1111-1111-1111");
		assertEquals("id :", "kang123",tr.getCusId());
		assertEquals("bills :", 5000,tr.getBills());
		assertEquals("dateAndTime :","2018-02-11T02:12",tr.getDate().toString() );
		assertEquals("card serial:","1111-1111-1111-1111",tr.getAcc());
		
		
		tr= new Transfer("song93", 2000, LocalDateTime.of(2018, 2,9,15,33), "2222-2222-3333-3333");
		assertEquals("id :", "song93",tr.getCusId());
		assertEquals("bills :", 2000,tr.getBills());
		assertEquals("dateAndTime :","2018-02-09T15:33",tr.getDate().toString() );
		assertEquals("card serial:","2222-2222-3333-3333",tr.getAcc());
		
		tr= new Transfer("jung98", 4000, LocalDateTime.of(2017, 1,7,12,43), "2211-2211-2233-2233");
		assertEquals("id :", "jung98",tr.getCusId());
		assertEquals("bills :", 4000,tr.getBills());
		assertEquals("dateAndTime :","2017-01-07T12:43",tr.getDate().toString() );
		assertEquals("card serial:","2211-2211-2233-2233",tr.getAcc());
	}
}
