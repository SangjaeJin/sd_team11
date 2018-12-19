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
	}
}
