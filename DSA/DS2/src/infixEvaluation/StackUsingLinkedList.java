package infixEvaluation;

/**
 * @author Priya Pandey
 * @param <T>
 */
public class StackUsingLinkedList<T> implements IStack<T> {
    Node<T> top;
    
    public StackUsingLinkedList() {
        top=null;
    }

    @Override
    public boolean push(T element) {
        Node node=new Node(element);
        node.setNext(top);
        top=node;
        return true;
    }

    @Override
    public T pop() {
        boolean isStackEmpty=isEmpty();
        if(isStackEmpty)
        {
            throw new AssertionError("Stack is empty");
        }
        Node node=top;
        top=node.getNext();
        return (T)node.getData();
    }

    @Override
    public boolean isEmpty() {
        if(top==null)
        {
            return true;
        }
        return false;
    }

	@Override
	public T peek() {
		boolean isStackEmpty=isEmpty();
        if(isStackEmpty)
        {
            throw new AssertionError("Stack is empty");
        }
        return (T)top.getData();
	}
}