package sorting;

/**
 * @author Priya Pandey
 * Represents Linked list Of Employees 
 */
import java.util.*;
public class ListOfEmployee {
	Employee head = new Employee();
	Employee sort = new Employee();

	/**
	 * Adds Employee to List
	 * @param name of employee
	 * @param salary of employee
	 * @param age of Employee
	 */
	public void addEmployee(String name, int salary, int age) {
		Employee employee = new Employee(name, salary, age);
		employee.next = head;
		head = employee;
	}

	/**
	 * Sorts the list of Employees
	 */
	public void sort() {
		sort = null;
		Employee current = head;
		while (current != null) {
			Employee next = current.next;
			addToList(current);
			current = next;

			head = sort;
		}
	}

	/**
	 * Adds Employee to sorted List
	 * @param node
	 */
	private void addToList(Employee node) {
		if (sort == null || compare(sort, node)) {
			node.next = sort;
			sort = node;
		} else {
			Employee current = sort;
			while (current.next != null && current.next.salary > node.salary) {
				current = current.next;
			}

			node.next = current.next;
			current.next = node;
		}
	}

	/**
	 * Displays the list of Employee
	 * @return sorted List
	 */
	public List<String> display() {
		List<String> list = new ArrayList<String>();
		Employee n = head;
		while (n.next != null) {
			list.add(n.name);
			n = n.next;
		}
		return list;
	}

	/**
	 * Compares two employee
	 * @param node1 is first employee
	 * @param node2 is the second employee
	 * @return true or false accordingly
	 */
	private boolean compare(Employee node1, Employee node2) {
		if (node1.salary < node2.salary
				|| (node1.salary == node2.salary && node1.age > node2.age)) {
			return true;
		} else {
			return false;
		}
	}
}