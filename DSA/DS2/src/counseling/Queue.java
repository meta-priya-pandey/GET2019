package counseling;

public interface Queue {
	/**
     * @param data
     * @return add student in the queue
     */
	
    boolean enQueue(Student data);
    /**
     * Delete student object from the queue
     * @return object of the student
     */
    Object deQueue();
    
    /**
     * Check queue empty or not
     * @return true or false
     */
    boolean isEmpty();
    
    /**
     * Check queue is full or not
     * @return true or false
     */
    boolean isFull();
}