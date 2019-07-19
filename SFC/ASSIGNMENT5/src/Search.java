/**
 * @author Priya Pandey
 * Search class contains two methods Linear Search and Binary Search.
 *
 */
public class Search {
	/**
	 * Find the index of the num searched in an array by using Linear Search algorithm through recursion.
	 * @param arrInt
	 * @param num
	 * @param length
	 * @param start
	 * @return index value of the num.
	 */
	public int linearSearch(int arrInt[], int num, int length){
		if(length == 0){
			throw new AssertionError("Array is Empty.");
		}
		
		if(arrInt[length] == num) {
			return length;
		}
		
		return linearSearch(arrInt,num, length - 1);	
	}
	
	/**
	 * Find the index of the num searched in an array by using Binary search algorithm through recursion.
	 * @param intArr
	 * @param start
	 * @param length
	 * @param num
	 * @return index value of the num.
	 */
	public int binarySearch(int[] intArr, int start, int length, int num) {
		if(length == 0){
			throw new AssertionError("Array is Empty.");
		}
        if (start < length) {
            int mid = start + (length - start) / 2;  
            if (num < intArr[mid]) {
                return binarySearch(intArr, start, mid, num);
                 
            } else if (num > intArr[mid]) {
                return binarySearch(intArr, mid+1, length , num);
                 
            } else {
                return mid;   
            }
        }
        return -(start + 1);  
    }
	public static void main(String[] args) {
		Search obj = new Search();
		int arr[] = {1,2,8,6,5};
		int index = obj.linearSearch(arr, 6, arr.length - 1);
		System.out.println(index);
		
		int arr1[] = {2,5,8,19,21};
		int bindex = obj.binarySearch(arr1, 0, arr1.length, 19);
		System.out.println(bindex);
		
	}
}
