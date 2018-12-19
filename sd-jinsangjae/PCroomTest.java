import static org.junit.Assert.*;

import org.junit.Test;

public class PCroomTest {

	@Test
	public void test() {
		Owner own = new Owner("testOwn","testOwn");
		PCroom pc = new PCroom(own,"testPC","daegu",4,6,24);
		assertEquals("name test","testPC",pc.getName());
		assertEquals("location tets","daegu",pc.getLocation());
		assertEquals("computer num test",24,pc.getComNum());
		assertEquals("owner id test","testOwn",pc.getOwner().getId());
		assertEquals("owner passwd test","testOwn",pc.getOwner().getPwd());
	}

}
