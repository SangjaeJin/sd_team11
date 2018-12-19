import static org.junit.Assert.*;

import org.junit.Test;

public class ReviewsTest {

//	@Test
//	public void test() {
//		fail("Not yet implemented");
//	}

	@Test
	public void reviewTest() {
		Reviews re =new Reviews();
		re.write("깨끗해요");
		assertEquals("reviews test:", re.show().get(0),"깨끗해요");
	}
}
