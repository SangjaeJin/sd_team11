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
		
		card = new Card("kang33", 6000, LocalDateTime.of(2018, 2, 12, 17, 52), "111-222-333333");
		assertEquals("id :", "kang33",card.getCusId());
		assertEquals("bills :", 6000,card.getBills());
		assertEquals("dateAndTime :","2018-02-12T17:52",card.getDate().toString() );
		assertEquals("card serial:","111-222-333333",card.getCard());
		
		card = new Card("kim88", 1000, LocalDateTime.of(2017, 12, 5, 14, 11), "222-222-888888");
		assertEquals("id :", "kim88",card.getCusId());
		assertEquals("bills :", 1000,card.getBills());
		assertEquals("dateAndTime :","2017-12-05T14:11",card.getDate().toString() );
		assertEquals("card serial:","222-222-888888",card.getCard());
	}
}
