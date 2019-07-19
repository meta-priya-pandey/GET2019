/**
 * @author Priya Pandey Class MathProblem is designed to implement HCF and LCM of x and y positive integers. 
 * L.C.M. of two numbers x and y. Receive x and y as method parameters and return computed value. 
 * H.C.F of two numbers x and y using Euclid’s algorithm. Receive x and y as method parameters and return computed value.
 */
public class MathProblem {
	/**
	 * find the HCF of two positive integers.
	 * @param x
	 * @param y
	 * @return Highest Common Factor number of x and y.
	 */
	public int hcf(int x, int y) {
		if (y == 0)
			return x;
		return hcf(y, x % y);
	}

	/**
	 * find the LCM of two positive integers. 
	 * @param x
	 * @param y
	 * @return Lowest Common Divisor number of x and y.
	 */
	public int lcm(int x, int y) {
		return (x * y) / hcf(x, y);
	}
}


