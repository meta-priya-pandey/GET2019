package ds;
/**
 * Node is class which creates a node for list which contains data and pointer
 * to next node
 * 
 * @author Admin
 *
 */
public class Node {
	Object data;
	Node next;

	Node(Object d) {
		this.data = d;
		this.next = null;
	}

	public Node() {
		// TODO Auto-generated constructor stub
	}
}