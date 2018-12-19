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
		
		Events ev2= new Events();
		ev2.write("1시간 500원");
		assertEquals("event2 check:","1시간 500원",ev2.show().get(0) );
		
		ev2.write("2시간 900원");
		assertEquals("event2 check:","2시간 900원", ev2.show().get(1));
	}
	
	
}
