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
		assertEquals("test res id","test",res.getId());
		
		res = new Reservation(LocalDateTime.of(2018, 12,13,2,30),LocalDateTime.of(2018, 12,13,3,30),"test2");
		assertEquals("startTime","2018-12-13T02:30",res.getStartTime().toString());
		assertEquals("endTime","2018-12-13T03:30",res.getEndTime().toString());
		assertEquals("test res id","test2",res.getId());
		
		res = new Reservation(LocalDateTime.of(2018, 11,29,3,30),LocalDateTime.of(2018, 11,29,5,30),"test3");
		assertEquals("startTime","2018-11-29T03:30",res.getStartTime().toString());
		assertEquals("endTime","2018-11-29T05:30",res.getEndTime().toString());
		assertEquals("test res id","test3",res.getId());
	}

}