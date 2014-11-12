package datastructures;

public interface Stack<E> {

	void push(E element);
	
	E pop();
	
	E peek();
	
	void clear();
	
	int size();
	
	boolean isEmpty();
	
}
