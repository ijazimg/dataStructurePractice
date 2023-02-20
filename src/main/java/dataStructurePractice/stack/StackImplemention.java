package dataStructurePractice.stack;

import java.util.Arrays;

public class StackImplemention {


	class Stack{
		
		String [] array;
		int capicity;
		int top;
		
		Stack(int size){
			this.capicity = size;
			array = new String[size];
			top = -1;
		}
		
		
		public void push(String element) {
			
			if(top == capicity -1) {
				System.out.println("full is the stack");
				return;
			}
			
			top++;
			array[top] = element;
		}
		
		public void pop() {
			
			if(top == -1) {
				System.out.println("empty is the stack");
				return;
			}
			String x = array[top];
			top--;
		}
		
		public void printStackElement() {
			for(int i = 0; i<=top; i++) {
				System.out.print(array[i]+", ");
			}
			System.out.println();
		
	}
	
	
		
		public static void main(String[] args) {
			StackImplemention stackImp = new StackImplemention();
			StackImplemention.Stack myStack = stackImp.new Stack(5);
			
			myStack.push("ijaz");
			myStack.push("arham");
			myStack.push("abc");
			myStack.push("abc");
			myStack.push("abc");
			myStack.push("abc");
			myStack.printStackElement();
			myStack.pop();
			myStack.printStackElement();
			System.out.println();
			myStack.push("ss");
			myStack.printStackElement();
			myStack.pop();
			myStack.pop();
			myStack.pop();
			myStack.pop();
			myStack.printStackElement();
			myStack.pop();
			myStack.pop();
			
			myStack.push("ijaz");
			myStack.push("arham");
			myStack.printStackElement();
		}
		
		
		
	}
	
		
		
}
