//	Author: Alberic A. Davila Cadilla
//	convertToPostfix.java
//
//	Class that converts infix expression to postfix 

package datastructure;


public class convertToPostfix {

	private String infix;		// Holds the infix expression 
	private StringBuffer postfix = new StringBuffer("");	// Where the postfix expression will be stored
	private char token;			// Holds the char that will be the operand or operator
	private int type;			// determines the oder of operations 
	private int count = 0; 		//counts the length of string 
	private Stack<Character> stk = new LinkedStack<Character>();	//Stack that will hold the operators

	public convertToPostfix(String infix) {
		this.infix = infix.replaceAll("\\s","");		// Eliminates the spaces in the string
	}

	public StringBuffer toPostfix () {
		while (count < infix.length()) {
			token = infix.charAt(count);				// gets char from string and stores it in token 
			type = precedence(token);		

			// determines if the token is an operand
			if (type == 0 && token != '(' && token != ')') {
				postfix.append(token);					// Puts token in postfix String

				// Keeps 2 or more digit numbers together 
				if ((count+1) < infix.length() && precedence(infix.charAt(count+1)) != 0)
					postfix.append(" ");
			}

			else if (token == '(') {
				stk.push(token);
			}

			else if (token == ')') {
				postfix.append(" ");					// put a space in postfix String
				while (stk.peek() != '(') { 			// possible error
					postfix.append(stk.pop() + " ");	// put operator from stack in postfix String and leave a space 
				}
				stk.pop();								// Eliminates '(' from the stack
			}

			else if (precedence(token) > 0) {
				// compares operator from the stack in next operator from infix string, 
				// the operator with the highest precedences goes in the postfix string
				while (!stk.isEmpty() && stk.peek() != '(' && precedence(token) <= precedence(stk.peek()) ) {
					postfix.append(stk.pop() + " ");
				}
				stk.push(token);	// first operator to go in the stack
			}
			count++;				// increment counter 
		} 

		postfix.append(" ");		// puts a space in the postfix string
		
		// put the rest of the operators in the stack in the postfix string
		while (!stk.isEmpty()) {
			postfix.append(stk.pop() + " ");
		}
		
		return postfix;		// return the final postfix expression 
	}

	// determines the order of operations 
	private int precedence(char operator) { 
		switch (operator) {
		case ')':
		case '(':
			return 3;
		case '*':
		case '/':
			return 2;
		case '+':
		case '-':
			return 1;
		default:
			return 0;
		}
	}
} // of class




