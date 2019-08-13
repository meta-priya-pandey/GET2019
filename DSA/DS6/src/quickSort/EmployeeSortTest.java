package quickSort;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * @author Priya Pandey 
 * This class is for testing LinkedQuickSort class
 *
 */
public class EmployeeSortTest
{
	/**
	 * Positive test case 
	 */
	@Test
	public void positiveTestOfClass()
	{
		ListDsa list = new ListDsa();
		Employee e1 = new Employee("Priya1", 4010, 23);
		Employee e2 = new Employee("Priya2", 4009, 23);
		Employee e3 = new Employee("Priya3", 4008, 23);
		Employee e4 = new Employee("Priya4", 4007, 23);
		Employee e5 = new Employee("Priya5", 4006, 23);
		Employee e6 = new Employee("Priya6", 4005, 23);

		list.insert(list, e1);
		list.insert(list, e2);
		list.insert(list, e3);
		list.insert(list, e4);
		list.insert(list, e5);
		list.insert(list, e6);

		ListDsa ExpectedList = new ListDsa();
		Employee e7 = new Employee("Priya", 4005, 23);
		Employee e8 = new Employee("Krishan", 4006, 24);
		Employee e9 = new Employee("Jyoti", 4007, 25);
		Employee e10 = new Employee("Murtaza", 4008, 26);
		Employee e11 = new Employee("Sneha", 4009, 27);
		Employee e12 = new Employee("Navi", 4010, 28);
		ExpectedList.insert(ExpectedList, e7);
		ExpectedList.insert(ExpectedList, e8);
		ExpectedList.insert(ExpectedList, e9);
		ExpectedList.insert(ExpectedList, e10);
		ExpectedList.insert(ExpectedList, e11);
		ExpectedList.insert(ExpectedList, e12);
		ExpectedList.display(ExpectedList);

		EmployeeSort ob = new EmployeeSort();
		ListDsa.Node n = list.head;
		while (n.next != null)
		{
			n = n.next;
		}

		ob.sort(list, list.head, n);
		assertEquals(ExpectedList.head.emp.salary, list.head.emp.salary);

	}

	/**
	 * Positive test case 
	 */
	@Test
	public void positive2TestOfClass()
	{
		ListDsa list = new ListDsa();
		Employee e1 = new Employee("priya1", 4009, 23);
		Employee e2 = new Employee("p2", 4006, 24);
		Employee e3 = new Employee("p3", 4008, 25);
		Employee e4 = new Employee("p4", 4007, 26);
		Employee e5 = new Employee("p5", 4010, 27);
		Employee e6 = new Employee("p6", 4005, 28);

		list.insert(list, e1);
		list.insert(list, e2);
		list.insert(list, e3);
		list.insert(list, e4);
		list.insert(list, e5);
		list.insert(list, e6);

		ListDsa ExpectedList = new ListDsa();
		Employee e7 = new Employee("p5", 4005, 23);
		Employee e8 = new Employee("p6", 4006, 24);
		Employee e9 = new Employee("p7", 4007, 25);
		Employee e10 = new Employee("p8", 4008, 26);
		Employee e11 = new Employee("p9", 4009, 27);
		Employee e12 = new Employee("p10", 4010, 28);
		ExpectedList.insert(ExpectedList, e7);
		ExpectedList.insert(ExpectedList, e8);
		ExpectedList.insert(ExpectedList, e9);
		ExpectedList.insert(ExpectedList, e10);
		ExpectedList.insert(ExpectedList, e11);
		ExpectedList.insert(ExpectedList, e12);
		ExpectedList.display(ExpectedList);

		EmployeeSort ob = new EmployeeSort();
		ListDsa.Node n = list.head;
		while (n.next != null)
		{
			n = n.next;
		}

		ob.sort(list, list.head, n);
		assertEquals(ExpectedList.head.emp.salary, list.head.emp.salary);

	}
}
