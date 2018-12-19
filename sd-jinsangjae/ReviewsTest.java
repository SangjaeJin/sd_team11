import static org.junit.Assert.*;

import org.junit.Test;

public class ReviewsTest {
	
	@Test
	public void reviewTest() {
		Reviews re =new Reviews();
		re.write("깨끗해요");
		assertEquals("reviews test:", re.show().get(0),"깨끗해요");
		
		re.write("넓어요");
		assertEquals("reviews test:", re.show().get(1),"넓어요");
		
		
		re= new Reviews();
		re.write("컴퓨터가 빨라요");
		assertEquals("reviews test:", re.show().get(0),"컴퓨터가 빨라요");
	}
}
