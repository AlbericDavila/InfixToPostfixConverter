//	By Alberic A. Davila Cadilla
//	ElementNotFoundException.java
//
//	Exception called upon when an element that does not exists, is called.

package datastructure;


@SuppressWarnings("serial")
public class ElementNotFoundException extends RuntimeException {
	
	// Creates a new exception with the given message.
	public ElementNotFoundException(String message) {
		super(message);
	}
	
	// Creates a new exception with the default message.
	public ElementNotFoundException() {
		super("element was not found");
	}

}