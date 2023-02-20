package dataStructurePractice.linklist;

public class LinkListImplementation {

	class LinkList {

		Node head;

		static class Node {
			int data;
			Node next;

			Node(int data) {
				this.data = data;
				this.next = null;
			}
		}

		public void insertAtEnd( int data,LinkList list) {
			Node newNode = new Node(data);

			if (list.head == null) {
				list.head = newNode;
				return;
			} else {
				Node currentNode = list.head;

				while (currentNode.next != null) {
					currentNode = currentNode.next;
				}

				currentNode.next = newNode;
			}
		}
		
		public void insertAtStart(int data, LinkList list) {
			Node newNode = new Node(data);

			if(list.head == null) {
				list.head = newNode;
			}
			else {
				Node firstNode = list.head;
				list.head = newNode;
				newNode.next = firstNode;
			}
		}

		public void deletByKey(LinkList list, int key) {

			Node cNode = list.head, prev;

			if (cNode != null && cNode.data == key)
				list.head = cNode.next;
			else {
				
				while(cNode!= null && cNode.data != key) {
					cNode = cNode.next;
				}
				
				if(cNode != null) {
					prev = cNode;
					prev.next = cNode.next;
				}
				else {
					System.out.println("Not found");
				}
			}
		}
		
		public void deletByIndex(LinkList list, int index) {
			Node cNode = list.head, prev = null;
			
			if(cNode != null && index == 0) {
				list.head = cNode.next;
			}
			else {
				int counter = 0;
				
				while(cNode != null) {
					
					if(counter == index) {
						prev.next = cNode.next;
						break;
					}
					else {
						prev = cNode;
						cNode = cNode.next;
						counter++;
					}
				}
			}
		}
		
		public void printList(LinkList list) {
			Node cNode = list.head;
			while(cNode != null) {
				System.out.print(cNode.data +",");
				cNode = cNode.next;
			}
			
			System.out.println("");
			
		}

	}

	public static void main(String[] args) {

		LinkListImplementation imp = new LinkListImplementation();
		LinkListImplementation.LinkList list = imp.new LinkList();
		list.insertAtStart(0,list);
		list.insertAtEnd(1, list);
		list.insertAtEnd(2, list);
		list.insertAtEnd(3, list);
		list.insertAtEnd(4, list);
		list.printList(list);
		list.deletByKey(list, 4);
		list.printList(list);
		list.insertAtEnd(4, list);
		list.printList(list);
		list.deletByKey(list, 4);
		list.deletByKey(list, 3);
		list.deletByKey(list, 1);
		list.deletByKey(list, 9);
		list.insertAtEnd(9, list);
		list.printList(list);
		list.insertAtStart(7,list);
		list.printList(list);
		list.deletByIndex(list, 0);
		list.printList(list);
		list.deletByIndex(list, 6);
		list.printList(list);

	}
}
