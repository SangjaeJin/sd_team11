import static org.junit.Assert.*;

import java.time.LocalDateTime;

import org.junit.Test;

public class CardTest {

//	@Test
//	public void test() {
//		fail("Not yet implemented");
//	}

	
	@Test
	public void cardTest() {
		Card card =new Card("hong123", 2000, LocalDateTime.of(2018, 3, 22, 4, 33), "333-333-222222");
		
		assertEquals("id :", "hong123",card.getCusId());
		assertEquals("bills :", 2000,card.getBills());
		assertEquals("dateAndTime :","2018-03-22T04:33",card.getDate().toString() );
		assertEquals("card serial:","333-333-222222",card.getCard());
	}
	
}
