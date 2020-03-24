import java.util.*;
class Stack {
	int top = 0;
	int maxSize = 10;
	int[] stack = new int[maxSize];
	Scanner sc = new Scanner(System.in);

	Stack() {
		top = -1;
	}

	void pushElement() {
		if(top == maxSize-1) 
			System.out.println("Stack is overflow!!!!");
		else {
			System.out.print("Enter Element to push onto the stack : ");
			int element = sc.nextInt();
			stack[++top] = element;
			System.out.println(element+" is pushed into the stack");
		}
	}

	void popElement() {
		if(top == -1)
			System.out.println("Stack is underflow!!!!!!!");
		else 
			System.out.println("Popped Element is : "+stack[top--]);
	}

	void displayElements() {
		if(top == -1)
			System.out.println("Stack is underflow!!!!!!!");
		else {
			System.out.print("Stack Elements are : ");
			for(int i=top ; i>=1 ; i--)
				System.out.print(stack[i]+"==>");
		}
		System.out.print(stack[0]);
		System.out.println();
	}
}

public class StackImplementation {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Stack s = new Stack();
		int choice = 0;
		
		do {
			System.out.println("\n\n***********  Stack Menu  **************");
			System.out.println("1.PUSH \t 2.POP \t 3.DISPLAY \t 4.EXIT");
			System.out.print("Enter Your choice : ");
			choice = sc.nextInt();
			switch(choice) {
				case 1 : s.pushElement();
						 break;
				case 2 : s.popElement();
						 break;
				case 3 : s.displayElements();
						 break;
				case 4 : System.out.println("Exiting!!!!!!!!!");
						 System.exit(0);
			}
		} while(choice<=4);
	}
}