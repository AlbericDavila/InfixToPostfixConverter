//	By Alberic A. Davila Cadilla
//	Node.java
//
//	Nodes that compose a linked list. 
//	Type of data structure that has a holds a reference to a value(data)
//	and holds a reference to the next node(next).

package datastructure;

public class Node<T> {

	T data;
	Node<T> next;
	
	//	data - value to be stored
	//	next - pointer to the next node
	public Node(T data, Node<T> next) {
		this.data = data;
		this.next = next;
	}

	//	Return the value in the node
	public T getData() {
		return data;
	}

	// Set a new value to an existing node
	public void setData(T data) {
		this.data = data;
	}

	//	Return the reference(pointer) to the next node
	public Node<T> getNext() {
		return next;
	}

	// Set a new reference(pointer) to an existing node
	public void setNext(Node<T> next) {
		this.next = next;
	}
	
	// Display the value(data) and the next node(next)
	@Override
	public String toString() {
		return data + "-->" + next;
	}

}
