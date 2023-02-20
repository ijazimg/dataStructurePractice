package dataStructurePractice.Queue;

public class QueueImplementoinWithStack {
	
	class Queue{
		int[] array;
		int capicity;
		int front;
		int rear;
		int count;
		
		Queue(int size){
			array = new int[size];
			this.capicity = size;
			front = 0;
			rear = -1;
			count = 0;
		}
		
		public void enQueue(int data) {
			
			if(count == capicity) {
				System.out.println("Full is the Queu");
				return;
			}
			rear = (rear + 1) % capicity;
			array[rear] = data; 
			count++;
			
		}
		
		public int deQueu() {
			if(count == 0) {
				System.out.println("empty is the Queu");
				return -1;
			}
			int x = array[front];
			front = (front + 1) % capicity;
			count --;
			
			return x;
		}
		
		public void printElement() {
			
			for(int i = front; i<=rear; i++) {
				System.out.print(array[i]+", ");
			}
			System.out.println();
			
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
