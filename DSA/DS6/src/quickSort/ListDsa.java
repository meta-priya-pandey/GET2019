package quickSort;

/**
 * @author Priya Pandey
 * This class will create Linked List with data as object of Employee type.
 * ListDsa has methods to rotate LinkedList clockwise as well as method to display and insert data to linked list.
 */
public class ListDsa {
	Node head;

	/**
	 * Node class is a nested class that will create a node for a linked list.
	 * Node class has constructors to add data as well as another node to a Node.  
	 *
	 */
	static class Node {
		Node next;
		Employee emp;

		/**
		 * @param data2 data is an object that is to be added to the linked list
		 */
		public Node(Employee emp) {
			if (emp == null) {
				throw new NullPointerException("list can't be null");
			}
			this.emp = emp;
			this.next = null;
		}
	}

	/**
	 * @param list is the Linked List 
	 * @param data is data to insert in the linked list
	 * @return a linked list with inserted data
	 * method insert will insert the data as object to the linked list 
	 */
	public ListDsa insert(ListDsa list, Employee data) {
		if (list == null) {
			throw new AssertionError("List cannot be null");
		}
		if (data == null) {
			throw new AssertionError("Employee cannot be null");
		}
		Node newNode = new Node(data);
		if (list.head == null) {
			list.head = newNode;
		} else {
			Node last = head;
			while (last.next != null) {
				last = last.next;
			}
			last.next = newNode;
		}
		return list;
	}

	/**
	 * @param list is the Linked list to be displayed on screen
	 * display method will display the Linked list
	 */
	public void display(ListDsa list) {
		if (list == null) {
			throw new AssertionError("list cant be empty");
		}
		Node node;
		node = list.head;
		while (node.next != null) {
			System.out.print(" " + node.emp.salary + " ");
			node = node.next;
		}
		System.out.print(" " + node.emp.salary + " ");
	}
}