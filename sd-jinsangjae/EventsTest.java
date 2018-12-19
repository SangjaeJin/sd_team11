import static org.junit.Assert.*;

import org.junit.Test;

public class EventsTest {

//	@Test
//	public void test() {
//		fail("Not yet implemented");
//	}

	
	@Test
	public void testEvents() {
		Events ev= new Events();
		
		ev.write("1시간 700원");
		assertEquals("event check:","1시간 700원",ev.show().get(0) );
	}
	
	
}
