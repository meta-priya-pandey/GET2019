package circularQueue;

import static org.junit.Assert.*;

import org.junit.Test;

public class CircularQueueTest {
	CircularQueue<Integer> queueObject;
	
	//test cases for enqueue()
    @Test
    public void testEnqueueShouldReturnTrueWhenFirstValueAdded() {
    	queueObject=new CircularQueue<Integer>(10);
        boolean isEnqueue=queueObject.enqueue(5);
        assertEquals(true,isEnqueue);
    }
    
    @Test
    public void testEnqueueShouldReturnTrueWhenQueueNotFullAndRearNotAtEnd() {
    	queueObject=new CircularQueue<Integer>(10);
    	queueObject.enqueue(56);
    	queueObject.enqueue(7);
        boolean isEnqueue=queueObject.enqueue(5);
        assertEquals(true,isEnqueue);
    }
    
    @Test
    public void testEnqueueShouldReturnFalseWhenQueueFullAndRearNotAtEnd() {
    	queueObject=new CircularQueue<Integer>(4);
    	queueObject.enqueue(5);
    	queueObject.enqueue(20);
    	queueObject.enqueue(4);
    	queueObject.dequeue();
    	queueObject.enqueue(2);
    	queueObject.enqueue(9);
        boolean isEnqueue=queueObject.enqueue(34);
        assertEquals(false,isEnqueue);
    }
    
    //test cases for dequeue()
    @Test
    public void testDequeueShouldReturnObjectWhenQueueNotEmptyAndRearNotAtEnd() {
    	queueObject=new CircularQueue<Integer>(10);
    	queueObject.enqueue(5);
    	queueObject.enqueue(47);
    	queueObject.enqueue(20);
        Integer actualOutput=queueObject.dequeue();
        Integer expectedOutput=5;
        assertEquals(expectedOutput,actualOutput);
    }
    
    @Test
    public void testDequeueShouldReturnObjectWhenQueueNotEmptyAndRearAtEnd() {
    	queueObject=new CircularQueue<Integer>(4);
    	queueObject.enqueue(5);
        queueObject.enqueue(47);
        queueObject.dequeue();
        queueObject.enqueue(20);
        queueObject.enqueue(20);
        Integer actualOutput=queueObject.dequeue();
        Integer expectedOutput=47;
        assertEquals(expectedOutput,actualOutput);
    }
    
    @Test(expected=AssertionError.class)
    public void testDequeueShouldThrowExceptionWhenQueueIsEmpty() {
    	queueObject=new CircularQueue<Integer>(10);
    	queueObject.dequeue();
    }
    
    //test cases for isEmpty()
    @Test
    public void testIsEmptyShouldReturnFalseWhenQueueNotEmptyAndRearNotAtEnd() {
    	queueObject=new CircularQueue<Integer>(10);
    	queueObject.enqueue(5);
    	queueObject.enqueue(47);
    	queueObject.enqueue(20);
        boolean actualOutput=queueObject.isEmpty();
        assertEquals(false,actualOutput);
    }
    
    @Test
    public void testIsEmptyShouldReturnFalseWhenQueueNotEmptyAndRearAtEnd() {
    	queueObject=new CircularQueue<Integer>(4);
        queueObject.enqueue(5);
        queueObject.enqueue(47);
        queueObject.dequeue();
        queueObject.enqueue(20);
        queueObject.enqueue(47);
        boolean actualOutput=queueObject.isEmpty();
        assertEquals(false,actualOutput);
    }
    
    @Test
    public void testIsEmptyShouldReturnTrueWhenQueueIsEmpty() {
    	queueObject=new CircularQueue<Integer>(10);
        boolean actualOutput=queueObject.isEmpty();
        assertEquals(true,actualOutput);
    }
    
    //test cases for isFull()
    @Test
    public void testIsFullShouldReturnFalseWhenQueueNotFullAndRearNotAtEnd() {
    	queueObject=new CircularQueue<Integer>(10);
        queueObject.enqueue(5);
        queueObject.enqueue(47);
        queueObject.enqueue(20);
        boolean actualOutput=queueObject.isFull();
        assertEquals(false,actualOutput);
    }
    
    @Test
    public void testIsFullShouldReturnFalseWhenQueueNotFullAndRearAtEnd() {
    	queueObject=new CircularQueue<Integer>(4);
        queueObject.enqueue(5);
        queueObject.enqueue(47);
        queueObject.dequeue();
        queueObject.enqueue(20);
        queueObject.enqueue(47);
        boolean actualOutput=queueObject.isFull();
        assertEquals(false,actualOutput);
    }
    
    @Test
    public void testIsFullShouldReturnTrueWhenQueueIsFullAndRearAtEnd() {
    	queueObject=new CircularQueue<Integer>(2);
        queueObject.enqueue(5);
        queueObject.enqueue(47);
        boolean actualOutput=queueObject.isFull();
        assertEquals(true,actualOutput);
    }
    
    @Test
    public void testIsFullShouldReturnTrueWhenQueueIsFullAndRearNotAtEnd() {
    	queueObject=new CircularQueue<Integer>(4);
        queueObject.enqueue(5);
        queueObject.enqueue(47);
        queueObject.dequeue();
        queueObject.enqueue(4);
        queueObject.enqueue(7);
        queueObject.enqueue(48);
        boolean actualOutput=queueObject.isFull();
        assertEquals(true,actualOutput);
    }
}
