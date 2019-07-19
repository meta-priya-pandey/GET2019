import static org.junit.Assert.*;

import org.junit.Test;

/*
 * Test cases for LCM and HCF methods.
 */
public class MathProblemTest {
	MathProblem obj = new MathProblem();
	
	/*
	 * Test cases for LCM.
	 */
	@Test
	public void hcfTest() {
		assertEquals(3,obj.hcf(3,9));
		assertEquals(36,obj.hcf(144,180));
	}
	
	/*
	 * Test cases for HCF.
	 */
	@Test
	public void lcmTest() {
		assertEquals(9,obj.lcm(3,9));
		assertEquals(120,obj.lcm(24,60));
	}

}
