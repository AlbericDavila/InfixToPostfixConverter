//	By Alberic A. Davila Cadilla
//	PostfixConverterMain.java
//
//	Main application for the program.
//	Ask the user for an infix expression and the
//	program will convert it into a postfix expression
//	using the convertToPostfix.java class, 
//	which uses a stack that is implemented using a linked list.

package Tests;

import java.util.Scanner;
import datastructure.convertToPostfix;

public class PostfixConverterMain {

	// Serves as the entry point for this application.
	public static void main(String[] args) {
		
		Scanner kb = new Scanner(System.in); 
		String infixExp;
		
		System.out.print("Enter the infix expression: ");
		infixExp = kb.nextLine();
		convertToPostfix postfix = new convertToPostfix(infixExp);
		System.out.println("This is the post fix expression: " + postfix.toPostfix());
		
	}
}