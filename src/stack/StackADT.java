package stack;
/**
 * 
 * Defines interface for a stack collection.
 * 
 * @author Zach Alaniz ( ref. Java Software Structures 4th edition)
 *
 */

public interface StackADT<T> {
	
	/**
	 * Adds an element to the top of the stack.
	 * 
	 * @param element element to be pushed onto the stack.
	 */
	public void push( T element );
	
	/**
	 * Removes and returns top element off the stack.
	 * 
	 * @return element removed from top of stack. 
	 */
	public T pop();
	
	/**
	 * Returns top element of stack without removing.
	 * 
	 * @return element on top of stack.
	 */
	public T peek();
	
	/**
	 * Returns true if stack is empty.
	 * 
	 * @return true if stack is empty, false otherwise.
	 */
	public boolean isEmpty();
	
	/**
	 * Returns number of elements currently in stack.
	 * 
	 * @return number of elements in stack.
	 */
	public int size();
	
	/**
	 * Returns string representation of current stack.
	 * 
	 * @return string representation of stack.
	 */
	public String toString();

}
