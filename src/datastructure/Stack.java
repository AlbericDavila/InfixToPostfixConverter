//	By Alberic A. Davila
//	Stack.java
//
//	The interface for a stack data structure.

package datastructure;


public interface Stack<E> {

	// Add element.
	void push(E element);
	
	// Delete element.
	E pop();
	
	// Display the element at the top of the stack
	E peek();
	
	// Delete the elements in the stack.
	void clear();
	
	// Display how many elements are in a stack
	int size();
	
	// Check if the stack is empty
	boolean isEmpty();
	
}
