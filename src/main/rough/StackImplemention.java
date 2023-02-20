package dataStructurePractice.stack.rough;

import java.util.Arrays;

public class StackImplemention {

	class Stack {
		
		String[] array;
		int top;
		int stackSize;
		
		Stack(int size){
			array = new String[size];
			top = -1;
			this.stackSize = size;
		}
		
		public void push(String element) {
			if(top == stackSize -1) {
				System.out.println("full is the stack");
				return;
			}
			
			top++;
			array[top] = element;
		}
		
		public String pop() {
			if(top == -1) {
				System.out.println("empty is the stack");
				return "-1;";
			}
			
			String x = array[top];
			top--;
			return x;
		}
		
		public boolean isStackFull() {
			return top == stackSize + 1;
		}
		
		public boolean isStackEmpty() {
			return top == -1;
		}
		
		public void printStackElement() {
//			Arrays.stream(array).forEach(System.out::print);
			for(int i = 0; i<=top; i++) {
				System.out.print(array[i]+ ", ");
			}
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
			System.out.println();
			myStack.push("ss");
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
