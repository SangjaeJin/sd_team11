import static org.junit.Assert.*;

import org.junit.Test;

public class OwnerTest {

	@Test
	public void ownerIdTest() {
		Owner ow= new Owner("hhh111", "123");
		assertEquals("Owner id test:","hhh111",ow.getId());
		
		ow = new Owner("asd123", "321");
		assertEquals("owner id test:","asd123",ow.getId());
		
		ow = new Owner("ggg123", "777");
		assertEquals("owner id test:","ggg123",ow.getId());
	}
	
	@Test
	public void ownerPwTest() {
		Owner ow =new Owner("aa123123", "3344");
		assertEquals("owner pwd test:", "3344",ow.getPwd());
		
		ow = new Owner("asd123", "321");
		assertEquals("owner pwd test:","321",ow.getPwd());
		
		ow = new Owner("ggg123", "777");
		assertEquals("owner pwd test:","777",ow.getPwd());
	}
}
