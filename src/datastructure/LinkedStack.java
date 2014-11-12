//	By Alberic A. Davila Cadilla
//	LinkedStack.java
//
//	A stack implemented using a linked list. 
//	The type of data it handles is generic.


package datastructure;

public class LinkedStack<E> implements Stack<E> {
	
	private Node<E> top = null;
	private int size = 0;
	
	// Add an element to the stack
	@Override
	public void push(E element) {
		top = new Node<E>(element, top);
		size++;
	}
	
	// Return a reference to the top element 
	@Override 
	public E peek() {
		if(isEmpty())
			throw new ElementNotFoundException("Stack is empty :  peek is impossible");
		return (top.data);
	}
	
	// Return element to the top element
	// Remove it from the stack 
	@Override
	public E pop() {
		if(isEmpty()) {
			throw new ElementNotFoundException("Stack is empty : pop is impossible");
		}
		E element = top.data;
		top = top.next;
		size--;
		return element;
	}
	
	// Delete all elements in the stack
	@Override
	public void clear() {
		top = null;
		size = 0;
	}
	
	// Check if the stack is empty
	@Override
	public boolean isEmpty() {
		return size == 0;
	}
	
	// Return the size of the stacks (how many elements are in the stack)
	@Override
	public int size() {
		@SuppressWarnings("unused")
		int len = 0;
		if(!isEmpty())
			for(Node<E> current = top; current != null; current = current.next)
				len++;
		return size;
	}
	
	// Display the elements in the stack
	public String toString() {
		String str = "[";
		if(!isEmpty()) {
			str += top.data;
			for (Node<E> current = top.next; current != null; current = current.next )
				str += ", " + current.data;
		}
		return str + "]";
	}

}
