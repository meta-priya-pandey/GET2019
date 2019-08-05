package infixEvaluation;

/**
 * @author Priya Pandey
 * @param <T>
 */
public class Node<T> {
	private T data;
	private Node<T> next;

	/**
	 * Constructor
	 * @param data
	 */
	public Node(T data) {
		this.data = data;
		next = null;
	}

	public T getData() {
		return data;
	}

	public Node<T> getNext() {
		return this.next;
	}

	public void setNext(Node<T> node) {
		next = node;
	}
}