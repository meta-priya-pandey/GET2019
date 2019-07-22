package intset;
import static org.junit.Assert.*;

import org.junit.Test;

public class IntSetTest {

	/**
     * Test case for isMember(int x) when x is a member
     */
    @Test 
    public void isMemberTest1() {
        
        IntSet set = new IntSet(new int[]{1, 2, 0, 2, 2000, 5});
        boolean member = set.isMember(2);
        assertTrue(member);
    }
  
    /**
     * Test case for isMember(int x) when x is not a member
     */
    @Test
    public void isMemberTest2() {
        
        IntSet set = new IntSet(new int[]{1, 2, 0, 2, 2000, 5});
    
        boolean member = set.isMember(100);
        assertFalse(member);
        
        member = set.isMember(0);
        assertFalse(member);
    }
    
    /**
     * Test case for size() 
     */
    @Test
    public void sizeTest1() {
        
        IntSet set = new IntSet(new int[]{4, 1, 9, 2000, 5});
        int size = set.size();
        assertEquals(4, size);
    }
    
    /**
     * Test case for size() when input is null
     */
    @Test(expected = AssertionError.class)
    public void sizeTest2() {
        
        IntSet set = new IntSet(null);
        int size = set.size();
        assertEquals(4, size);
    }
    
    /**
     * Test case for size() when set is empty
     */
    @Test
    public void sizeTest3() {
        
        IntSet set = new IntSet(new int[]{});
        int size = set.size();
        assertEquals(0, size);
    }
    
    /**
     * Test case for isSubSet(IntSet s) when s is the subset of set
     */
    @Test
    public void isSubSetTest1() {
        
        IntSet set1 = new IntSet(new int[]{4, 1, 9, 2000, 5});
        IntSet set2 = new IntSet(new int[]{9, 1});
        boolean isSubSet = set1.isSubSet(set2);
        assertTrue(isSubSet);
    }
    
    /**
     * Test case for isSubSet(IntSet s) when s is not the subset of set
     */
    @Test
    public void isSubSetTest2() {
        
        IntSet set1 = new IntSet(new int[]{4, 1, 9, 2000, 5});
        IntSet set2 = new IntSet(new int[]{9, 1, 7});
        boolean isSubSet = set1.isSubSet(set2);
        assertFalse(isSubSet);
    }
    
    /**
     * Test case for isSubSet(IntSet s) when s is the empty set
     */
    @Test
    public void isSubSetTest3() {
        
        IntSet set1 = new IntSet(new int[]{4, 1, 9, 2000, 5});
        IntSet set2 = new IntSet(new int[]{});
        boolean isSubSet = set1.isSubSet(set2);
        assertTrue(isSubSet);
    }    
    
    /**
     * Test case for getComplement()
     */
    @Test
    public void getComplementTest() {
        
        IntSet set = new IntSet(new int[]{4, 1, 9, 2000, 5});
        IntSet complement = set.getComplement();
        assertEquals(996, complement.size());
    }
    
    /**
     * Test case for union(IntSet s1, IntSet s2)
     */
    @Test
    public void unionTest() {
        IntSet set1 = new IntSet(new int[]{4, 1, 9, 2000, 5});
        IntSet set2 = new IntSet(new int[]{1, 8, 9});
        IntSet union = IntSet.union(set1, set2);
        assertArrayEquals(new int[]{1, 4, 5, 8, 9}, union.getSet());
    } 
}