package stack;

import java.util.Arrays;

/**
 * Array implementation of a stack.
 * 
 * 
 * 
 * @author Zach Alaniz (ref. Java Software Structures 4th edition)
 *
 */
public class ArrayStack<T> implements StackADT<T>{
	
	private final static int CAPACITY = 100;
	
	private int top;
	private T[] stack;
	
	@SuppressWarnings("unchecked")
	public ArrayStack(int initialCap ) {
		
		top = 0;
		//generic types cannot be instantiated, have to cast it to an object array
		stack = (T[]) new Object[initialCap];
		
	}
	
	public ArrayStack() {
		
		this(CAPACITY);
		
	}
	
	public void push(T element) {
		
		if( size() == stack.length) {
			expandCapacity();
		}
		
		stack[top] = element;
		top++;
		
	}
	

	private void expandCapacity() {
		stack = Arrays.copyOf(stack, stack.length*2);
	}
	
	
	public T pop() throws EmptyCollectionException{
		
		if( isEmpty() ) {
			throw new EmptyCollectionException("stack");
		}
		
		top--;
		T result = stack[top];
		stack[top] = null;
		
		return result;
		
	}
	

	public T peek() throws EmptyCollectionException{
		
		if( isEmpty() ) {
			throw new EmptyCollectionException("stack");
		}
		
		return stack[top-1];
		
	}
	
	public boolean isEmpty() {
		
		return top == 0;
	
	}
	
	public int size() {
		return top;
	}
	
	public String toString() {
		
		String s = "";
		
		for( int i = 0; i<top; i++) {
			s += stack[i];
		}
		
		return s;
			
		
	}
	
	

}
