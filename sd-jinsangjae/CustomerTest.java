import static org.junit.Assert.*;

import org.junit.Test;

public class CustomerTest {

//	@Test
//	public void test() {
//		fail("Not yet implemented");
//	}

	@Test
	public void testCus() {
		Customer cus = new Customer("홍길동","hong123","123","010-1234-1234");
	
		cus.setCard("1234-1234-1234-1234");
		assertEquals("card check:","1234-1234-1234-1234",cus.getCard());
		assertEquals("name check:","홍길동", cus.getName());
		assertEquals("id check:","hong123", cus.getId());
		assertEquals("pwd check", "123",cus.getPwd());
		assertEquals("phone check:","010-1234-1234",cus.getPhone());
	

		cus= new Customer("김영희","hee12","555","010-3213-3213","222-222-333333","5555-5555-5555-5555");
		assertEquals("account check:", "222-222-333333",cus.getAccount());
		assertEquals("card check:","5555-5555-5555-5555",cus.getCard());
		assertEquals("name check:","김영희", cus.getName());
		assertEquals("id check:","hee12", cus.getId());
		assertEquals("pwd check", "555",cus.getPwd());
		assertEquals("phone check:","010-3213-3213",cus.getPhone());
		
	}
}
