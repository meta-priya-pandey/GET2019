package quickSort;

/**
 * @author Priya Pandey
 * This class sort a LinkedList of Employee using salary
 *
 */
public class EmployeeSort {
	/**
	 * @param list
	 * @param low
	 * @param high
	 * @return a partitioned list according to the pivot element
	 */
	public ListDsa.Node partition(ListDsa list, ListDsa.Node low,
			ListDsa.Node high) {
		ListDsa.Node i = null;
		int pivot = high.emp.salary;
		i = low;
		ListDsa.Node j = low;

		while (j != high) {
			if (j.emp.salary <= pivot) {
				// swap i and j
				int temp = j.emp.salary;
				j.emp.salary = i.emp.salary;
				i.emp.salary = temp;
				i = i.next;

			}
			j = j.next;
		}
		// swap j and i
		int temp = j.emp.salary;
		j.emp.salary = i.emp.salary;
		i.emp.salary = temp;

		return i;
	}

	/**
	 * @param list
	 * @param low
	 * @param high
	 * sort is a recursive method for using divide and conquer algorithm
	 */
	public void sort(ListDsa list, ListDsa.Node low, ListDsa.Node high) {
		if (list == null) {
			throw new AssertionError("List cannot be null");
		}
		if (low != high.next) {

			ListDsa.Node pi = partition(list, low, high);
			if (pi.next != high) {
				sort(list, pi.next, high);
			}

			ListDsa.Node n = low;

			while (n.next != pi && n.next != null) {

				n = n.next;
			}

			if (n.next != null) {
				sort(list, low, n);
			}

		}
	}
}