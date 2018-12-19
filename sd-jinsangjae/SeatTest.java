import static org.junit.Assert.*;

import org.junit.Test;

public class SeatTest {

	@Test
	public void test() {
		Seat st = new Seat(5);
		assertEquals("test seat",5,st.getSeatNum());
		assertFalse("test fillState",st.getFillState());
		
		st=new Seat(10);
		assertEquals("test seat",10,st.getSeatNum());
		assertFalse("test fillState",st.getFillState());
		
		st=new Seat(25);
		assertEquals("test seat",25,st.getSeatNum());
		assertFalse("test fillState",st.getFillState());
	}

}
