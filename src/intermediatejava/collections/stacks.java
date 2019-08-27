package intermediatejava.collections;

import java.util.*;

public class stacks {
	public static void main(String[] args) {
		
		Stack<String> stack= new Stack<String>();
		stack.push("texas");
		printStack(stack);
		
		stack.push("florida ");
		printStack(stack);

		stack.push("california");
		printStack(stack);

		stack.pop();
		printStack(stack);
		
		stack.pop();
		printStack(stack);
		
		stack.pop();
		printStack(stack);


		
	}

	public static void printStack(Stack s) {
		if(s.isEmpty()) {
			
			System.out.println("there is nothing in the stack");
				}
		else
			System.out.println(s);
		
	}
}
