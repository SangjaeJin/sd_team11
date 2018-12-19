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
		
		own = new Owner("testOwn2","testOwn2");
		pc = new PCroom(own,"testPC2","seoul",5,5,25);
		assertEquals("name test","testPC2",pc.getName());
		assertEquals("location tets","seoul",pc.getLocation());
		assertEquals("computer num test",25,pc.getComNum());
		assertEquals("owner id test","testOwn2",pc.getOwner().getId());
		assertEquals("owner passwd test","testOwn2",pc.getOwner().getPwd());
		
		own = new Owner("testOwn3","testOwn3");
		pc = new PCroom(own,"testPC3","ulsan",5,6,30);
		assertEquals("name test","testPC3",pc.getName());
		assertEquals("location tets","ulsan",pc.getLocation());
		assertEquals("computer num test",30,pc.getComNum());
		assertEquals("owner id test","testOwn3",pc.getOwner().getId());
		assertEquals("owner passwd test","testOwn3",pc.getOwner().getPwd());
	}

}
