import static org.junit.Assert.*;

import org.junit.Test;
/*
 * Test cases for Binary Search and Linear Search Algorithm through recursion.
 */
public class SearchTest {
	Search search = new Search();
	
	/*
	 * Test cases for Linear Search.
	 */
	@Test
	public void linearSearchTest() {
		assertEquals(2, search.linearSearch(new int[] {1, 4, 2, 7, 6}, 2, 4));
		assertEquals(5, search.linearSearch(new int[] {10, 50, 9, 15, 36, 45}, 45, 5));
	}
	
	/*
	 * Test cases for Binary Search.
	 */
	@Test
	public void binarySearchTest() {
		assertEquals(1, search.binarySearch(new int[] {1, 4, 5, 7, 10}, 0, 4, 4));
		assertEquals(3, search.binarySearch(new int[] {10, 50, 90, 150, 360, 450}, 0, 5, 150));
	}

}
