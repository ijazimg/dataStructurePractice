package dataStructurePractice.stack;

import java.util.ArrayList;
import java.util.Iterator;

public class GenericStackImplemention {
	
	class Stack<T>{
		private ArrayList<T> array;
		private int stackSize;
		private int top;
		
		
		Stack(int size){
			array = new ArrayList<T>();
			stackSize = size;
			top = -1;
		}
		
		public void push(T element) {
			if(top == stackSize -1) return;
			else {
				top++;
				if(array.size() > top) {
					array.add(top, element);
					
				}else
					array.add(element);
			}
			
		}
		
		public void pop() {
			if(top == -1) return;
			top--;
		}
		
		public void printStackElment() {
			for(int i = 0 ; i <= top ; i++) {
				System.out.print(array.get(i)+ ", ");
			}
		}
		
	}
	
	public static void main(String[] args) {
		GenericStackImplemention gs = new GenericStackImplemention();
		GenericStackImplemention.Stack<String> stack = gs.new Stack<>(5);
		
		stack.push("ijaz");
		stack.push("arham");
		stack.printStackElment();
		stack.pop();
		System.out.println();
		stack.printStackElment();
	}

}
