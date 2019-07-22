package mutablePolynomial;

import static org.junit.Assert.*;

import org.junit.Test;


public class MutablePolynomialTest {

	@Test(expected = AssertionError.class)
    public void polyTest1() {
        new MutablePolynomial(null);
    }
    
    /**
     * Test case when input polynomial is empty
     */
	@Test(expected = AssertionError.class)
    public void polyTest2() {
        new MutablePolynomial(new int[][]{});        
    }
    
    /**
     * Test case for evaluate(float x) when x is too large
     */
	@Test(expected = AssertionError.class)
    public void evaluateTest1() {
    	MutablePolynomial polynomial = new MutablePolynomial(new int[][]{{2, 200}, {3, 1}, {2, 0}});
        polynomial.evaluate(200f);
    }
    
    /**
     * A positive Test case for evaluate(float x) 
     */
	@Test
    public void evaluateTest2() {
    	MutablePolynomial polynomial = new MutablePolynomial(new int[][]{{2, 2}, {3, 1}, {2, 0}, {4, 1}});
        double result = polynomial.evaluate(2f);
        assertEquals(24, result, 0.001);
    }
    
    /**
     * Test case for degree()
     */
	@Test
    public void degreeTest() {
        
    	MutablePolynomial polynomial = new MutablePolynomial(new int[][]{{2, 2}, {3, 1}, {2, 0}});
        int result = polynomial.degree();
        assertEquals(2, result);
    }
    
    /**
     * Test case for addPoly(Poly p1, Poly p2)
     */
	@Test
    public void addPolyTest() {
        
    	MutablePolynomial polynomial1 = new MutablePolynomial(new int[][]{{2, 2}, {3, 1}, {2, 0}});
    	MutablePolynomial polynomial2 = new MutablePolynomial(new int[][]{{4, 3}, {3, 1}});
        
    	MutablePolynomial result = MutablePolynomial.addPoly(polynomial1, polynomial2);
        assertArrayEquals(new int[][]{{2, 0}, {6, 1}, {2, 2}, {4, 3}}, result.getPolynomial());
        
        MutablePolynomial polynomial3 = new MutablePolynomial(new int[][]{{2, 2}});
        MutablePolynomial polynomial4 = new MutablePolynomial(new int[][]{{4, 3}, {3, 1}});
        
        result = MutablePolynomial.addPoly(polynomial3, polynomial4);
        assertArrayEquals(new int[][]{{3, 1}, {2, 2}, {4, 3}}, result.getPolynomial());
    }
    
    /**
     * Test case for multiplyPoly(Poly p1, Poly p2)
     */
	@Test
    public void multiplyPolyTest() {
        
    	MutablePolynomial polynomial1 = new MutablePolynomial(new int[][]{{2, 2}, {3, 1}, {2, 0}});
    	MutablePolynomial polynomial2 = new MutablePolynomial(new int[][]{{4, 3}, {3, 1}});
        
    	MutablePolynomial result = MutablePolynomial.multiplyPoly(polynomial1, polynomial2);
        assertArrayEquals(new int[][]{{8, 5}, {14, 3}, {12, 4}, {9, 2}, {6, 1}}, result.getPolynomial());
    }
    
    /**
     * Test case to add a term to the polynomial when power already exists
     */
	@Test
    public void addTermTest1() {
        
    	MutablePolynomial polynomial = new MutablePolynomial(new int[][]{{2, 2}, {3, 1}, {2, 0}});
        polynomial.addTerm(4, 2);
        assertArrayEquals(new int[][]{{6, 2}, {3, 1}, {2, 0}}, polynomial.getPolynomial());
    }
    
    /**
     * Test case to add a term to the polynomial when power does'nt already exist
     */
	@Test
    public void addTermTest2() {
        
    	MutablePolynomial polynomial = new MutablePolynomial(new int[][]{{2, 2}, {3, 1}, {2, 0}});
        polynomial.addTerm(4, 3);
        assertArrayEquals(new int[][]{{2, 2}, {3, 1}, {2, 0}, {4, 3}}, polynomial.getPolynomial());
    }
    
    /**
     * Test case to remove a term from the polynomial when term exists
     */
	@Test
    public void removeTermTest1() {
        
    	MutablePolynomial polynomial = new MutablePolynomial(new int[][]{{2, 2}, {3, 1}, {2, 0}});
        polynomial.removeTerm(2);
        assertArrayEquals(new int[][]{{3, 1}, {2, 0}}, polynomial.getPolynomial());
    }
    
    /**
     * Test case to remove a term from the polynomial when term does not exist
     */
	@Test(expected = AssertionError.class)
    public void removeTermTest2() {
        
    	MutablePolynomial polynomial = new MutablePolynomial(new int[][]{{2, 2}, {3, 1}, {2, 0}});
        polynomial.removeTerm(4);
    }
}