package circularQueue;

public interface IQueue<T> {
	
	/**
     * Adds an element into queue.
     * @param element
     * @return returns true if element is added otherwise false.
     */
	public boolean enqueue(T element);
	
	/**
     * Remove an element from queue.
     * @return returns element that is removed from queue.
     */
	public T dequeue();
	
	/**
     * Checks whether queue is empty or not.
     * @return return true if queue is empty otherwise false.
     */
	public boolean isEmpty();

}
