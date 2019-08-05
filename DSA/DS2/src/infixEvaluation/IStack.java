package infixEvaluation;

/**
* This interface declares various functions of stack.
* @param <T> is generic type.
*/
public interface IStack<T> {
   
   /**
    * Add an element into stack.
    * @param element
    * @return returns true if element is added otherwise false.
    */
   public boolean push(T element);
   
   /**
    * Remove an element from stack.
    * @return returns element that is removed from stack.
    */
   public T pop();
   
   /**
    * Checks whether stack is empty or not.
    * @return return true if stack is empty otherwise false.
    */
   public boolean isEmpty();

   public T peek();
}