package circularQueue;

/**
 * @author Priya Pandey 
 * This class implements circular implementation of IQueue interface using array.
 * @param <T> is generic type.
 */
public class CircularQueue<T> implements IQueue<T> {
	private int front;
	private int rear;
	private T[] queue;

	public CircularQueue(int queueSize) {
		front = -1;
		rear = -1;
		queue = (T[]) new Object[queueSize];
	}

	/** 
	 * Adds an element in the queue.
	 */
	@Override
	public boolean enqueue(T element) {
		boolean isEnqueue = false;
		boolean isFull = isFull();
		if (isFull) {
			return isEnqueue;
		}
		if (rear == -1) {
			front = 0;
		}
		if (rear == queue.length - 1) {
			rear = -1;
		}
		rear++;
		queue[rear] = element;
		isEnqueue = true;
		return isEnqueue;
	}

	/** 
	 * Deletes element in the Queue.
	 */
	@Override
	public T dequeue() {
		boolean isEmpty = isEmpty();
		if (isEmpty) {
			throw new AssertionError("Queue is empty");
		}
		T element = queue[front];
		if (front == rear) {
			front = rear = -1;
		} else {
			front++;
			if (front == queue.length) {
				front = 0;
			}
		}
		return element;
	}

	/** 
	 * Checks whether queue is empty or not.
	 */
	@Override
	public boolean isEmpty() {
		if (front == -1) {
			return true;
		}
		return false;
	}

	/**
	 * Checks whether queue is full or not.
	 * @return true if queue is full otherwise false.
	 */
	public boolean isFull() {
		if ((rear == (queue.length - 1) && front == 0) || (rear + 1) == front) {
			return true;
		}
		return false;
	}
}