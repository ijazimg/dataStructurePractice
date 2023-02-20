package dataStructurePractice.stack.rough;

public class QueueImplementoinWithStack {
	
	class Queue{
		int[] array;
		int front;
		int rear;
		int capicity;
		int count;
		
		
		Queue(int size){
			array = new int[size];
			capicity = size;
			front = 0;
			rear = -1;
			count = 0;
		}
		
		
		public void enQueue(int element) {
			if(front == 0 && count == capicity) {
				System.out.println("full is the queyu");
				return;
			}
			
			rear = (rear + 1) % capicity;
			
			array[rear] = element;
			count++;
		}
		
		public int deQueu() {
			if(front == 0 && count == 0) {
				System.out.println("empty is teh queu");
				return -1;
			}
			int x = array[front];
			front = (front + 1) % capicity;
			count--;
			return x;
		}
		
		public boolean ifFull() {
			if(count == capicity) {
				System.out.println("full");
				return true;
			}
			return false;
		}
		public boolean isEmpty() {
			if(count==0) {
				System.out.println("empty");
				return true;
			}
			return false;
		}
		
		public void printElement() {
			for(int i = front; i<=rear && count>0; i++) {
				System.out.print(array[i]+ ", ");
				
			}
		}
		
	}
	
	
	public static void main(String[] args) {
		
		QueueImplementoinWithStack queueImpl = new QueueImplementoinWithStack();
		QueueImplementoinWithStack.Queue myQ = queueImpl.new Queue(5);
		
		myQ.enQueue(1);
		myQ.enQueue(2);
		myQ.enQueue(4);
		myQ.enQueue(3);
		myQ.enQueue(5);
		myQ.enQueue(5);
		myQ.printElement();
		System.out.println();
		System.out.println(myQ.deQueu());
		System.out.println("+");
		myQ.printElement();
		System.out.println("==");
		myQ.printElement();
		myQ.printElement();
		System.out.println(myQ.deQueu());
		System.out.println(myQ.deQueu());
		System.out.println(myQ.deQueu());
		System.out.println(myQ.deQueu());
		System.out.println(myQ.deQueu());
		System.out.println("..");
		myQ.enQueue(3);
		myQ.enQueue(5);
		myQ.enQueue(5);
		myQ.printElement();
		
	}

}
