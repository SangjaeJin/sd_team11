import static org.junit.Assert.*;

import org.junit.Test;

public class OwnerTest {

//	@Test
//	public void test() {
//		fail("Not yet implemented");
//	}

	@Test
	public void ownerIdTest() {
		Owner ow= new Owner("hhh111", "123");
		assertEquals("Owner id test:","hhh111",ow.getId());
		
		
	}
	
	@Test
	public void ownerPwTest() {
		Owner ow =new Owner("aa123123", "3344");
		assertEquals("owner pwd test:", "3344",ow.getPwd());
	}
}
