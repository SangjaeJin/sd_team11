import static org.junit.Assert.*;

import java.time.LocalDateTime;

import org.junit.Test;

public class ReservationTest {

	@Test
	public void resTest() 
	{
		Reservation res = new Reservation(LocalDateTime.of(2018, 12, 7, 12, 30),LocalDateTime.of(2018, 12, 7, 13, 30),"test");
		assertEquals("startTime","2018-12-07T12:30",res.getStartTime().toString());
		assertEquals("endTime","2018-12-07T13:30",res.getEndTime().toString());
	}

}
