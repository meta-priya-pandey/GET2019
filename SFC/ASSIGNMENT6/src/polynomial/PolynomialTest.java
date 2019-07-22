package polynomial;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author Priya Pandey
 *
 */
public class PolynomialTest {

	/**
     * Test case when input polynomial is null
     */
    @Test(expected = AssertionError.class)
    public void polyTest1() {
        new Polynomial(null);
    }
    
    /**
     * Test case when input polynomial is empty
     */
    @Test(expected = AssertionError.class)
    public void polyTest2() {
        new Polynomial(new int[][]{});        
    }
    
    /**
     * Test case for evaluate(float x) when x is too large
     */
    @Test(expected = AssertionError.class)
    public void evaluateTest1() {
    	Polynomial polynomial = new Polynomial(new int[][]{{2, 200}, {3, 1}, {2, 0}});
        polynomial.evaluate(200f);
    }
    
    /**
     * A positive Test case for evaluate(float x) 
     */
    @Test
    public void evaluateTest2() {
    	Polynomial polynomial = new Polynomial(new int[][]{{2, 2}, {3, 1}, {2, 0}, {4, 1}});
        double result = polynomial.evaluate(2f);
        assertEquals(24, result, 0.001);
    }
    
    /**
     * Test case for degree()
     */
    @Test
    public void degreeTest() {
        
    	Polynomial polynomial = new Polynomial(new int[][]{{2, 2}, {3, 1}, {2, 0}});
        int result = polynomial.degree();
        assertEquals(2, result);
    }
    
    /**
     * Test case for addPoly(Poly p1, Poly p2)
     */
    @Test
    public void addPolyTest() {
        
    	Polynomial polynomial1 = new Polynomial(new int[][]{{2, 2}, {3, 1}, {2, 0}});
    	Polynomial polynomial2 = new Polynomial(new int[][]{{4, 3}, {3, 1}});
        
    	Polynomial result = Polynomial.addPoly(polynomial1, polynomial2);
        assertArrayEquals(new int[][]{{2, 0}, {6, 1}, {2, 2}, {4, 3}}, result.getPolynomial());
        
        Polynomial polynomial3 = new Polynomial(new int[][]{{2, 2}});
        Polynomial polynomial4 = new Polynomial(new int[][]{{4, 3}, {3, 1}});
        
        result = Polynomial.addPoly(polynomial3, polynomial4);
        assertArrayEquals(new int[][]{{3, 1}, {2, 2}, {4, 3}}, result.getPolynomial());
    }
    
    /**
     * Test case for multiplyPoly(Poly p1, Poly p2)
     */
    @Test
    public void multiplyPolyTest() {
        
    	Polynomial polynomial1 = new Polynomial(new int[][]{{2, 2}, {3, 1}, {2, 0}});
    	Polynomial polynomial2 = new Polynomial(new int[][]{{4, 3}, {3, 1}});
        
    	Polynomial result = Polynomial.multiplyPoly(polynomial1, polynomial2);
        assertArrayEquals(new int[][]{{8, 5}, {14, 3}, {12, 4}, {9, 2}, {6, 1}}, result.getPolynomial());
    }
}