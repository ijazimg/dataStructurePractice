package dataStructurePractice.linklist;

public class LinkListImplWithAllOperations {

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

		public void insertAtStart(int data, LinkList list) {
			System.out.println("insertAtStart");
			Node newNode = new Node(data);

			if (list.head == null) {
				list.head = newNode;
				return;
			} else {
				Node headNode = list.head;
				list.head = newNode;
				newNode.next = headNode;
			}
		}

		public void insertAtEnd(int data, LinkList list) {
			System.out.println("insertAtEnd");
			Node newNode = new Node(data);
			if (list.head == null) {
				list.head = newNode;
				return;
			}
			Node headNode = list.head;
			while (headNode.next != null) {
				headNode = headNode.next;
			}
			headNode.next = newNode;
		}

		public void insertAtIndex(int index, int data, LinkList list) {
			System.out.println("insertAtIndex");
			Node newNode = new Node(data);
			Node cNode = list.head, prev;
			if (list.head == null) {
				list.head = newNode;
				return;
			}
			if (list.head != null && index == 0) {
				list.head = newNode;
				newNode.next = cNode;
				return;
			}
			int counter = 1;
			while (cNode.next != null) {

				if (counter == index) {
					prev = cNode.next;
					cNode.next = newNode;
					newNode.next = prev;
					break;
				} else {
					cNode = cNode.next;
					counter++;
				}
			}
		}

		public void insertAtIndexForLoop(int index, int data, LinkList list) {
			Node newNode = new Node(data);
			if (list.head == null) {
				list.head = newNode;
			} else if (list.head != null && index == 0) {
				Node headNode = list.head;
				list.head = newNode;
				newNode.next = headNode;
			} else {
				Node currentNode = list.head, prev;
				for (int i = 1; i < index; i++) {
					currentNode = currentNode.next;
				}

				if (currentNode != null && currentNode.next != null) {
					prev = currentNode.next;
					currentNode.next = newNode;
					newNode.next = prev;
				} else {
					System.out.println("...");
				}

			}
		}

		public void deleteFromStart(LinkList list) {
			if (list.head == null) {
				System.out.println("empty alreadh");
				return;
			}

			if (list.head != null && list.head.next == null) {
				list.head = null;
			}

			else {
				Node headNode = list.head;
				list.head = headNode.next;
			}

		}
		
		public void deleteFromEnd(LinkList list) {
			if(list.head == null) {
				System.out.println("already empty");
				return;
			}
			
			Node currentNode = list.head;
			while(currentNode.next.next != null) {
					currentNode = currentNode.next;
			}
			currentNode.next = null;
			
		}
		
		public void deleteAtIndex(int index, LinkList list) {
			if(list.head == null) {
				System.out.println("empty no index to delete");
				return;
			}
			if(list.head != null && index == 0) {
				if(list.head.next != null) {
					list.head = list.head.next;
				}
				else list.head = null;
			}
			else {
				int counter = 0;
				Node currentNode = list.head, prev = null;
				while(currentNode != null) {
					if(counter == index) {
						prev.next = currentNode.next;
						return;
					}
					else {
						prev = currentNode;
						currentNode = currentNode.next;
						counter++;
					}
				}
				if(currentNode == null) {
					System.out.println("invalid index");
					return;
				}
			}
		}
		
		public void deleteAtIndexForloop(int index, LinkList list) {
			if(list.head == null) {
				System.out.println("emtyp");
				return;
			}
			if(list.head != null && index == 0) {
				if(list.head.next != null) {
					list.head = list.head.next;
				}
				else {
					list.head = null;
				}
			}
			else {
				Node currentNode = list.head;
				for(int i = 1; currentNode != null && i<index; i++) {
					currentNode = currentNode.next;
				}
				
				if(currentNode == null || currentNode.next == null) {
					System.out.println("index doses'nt exist");
					return;
				}
				
				Node next = currentNode.next.next;
				currentNode.next = next;
				
			}
			
		}

		// 66, 9, 2, 3, 1, 10, 88, 100,
		public void printList(LinkList list) {
			Node cNode = list.head;
			while (cNode != null) {
				System.out.print(cNode.data + ", ");
				cNode = cNode.next;
			}
			System.out.println();
		}

		public static void main(String[] args) {
			LinkListImplWithAllOperations imp = new LinkListImplWithAllOperations();
			LinkListImplWithAllOperations.LinkList list = imp.new LinkList();
			list.deleteFromEnd(list);
			list.insertAtIndexForLoop(0, 10, list);
			list.insertAtIndexForLoop(0, 9, list);
			list.insertAtIndexForLoop(1, 1, list);
			list.insertAtIndex(1, 2, list);
			list.printList(list);
			list.insertAtIndexForLoop(2, 3, list);
			list.printList(list);
			list.insertAtEnd(88, list);
			list.insertAtStart(20, list);
			list.insertAtEnd(100, list);
			list.insertAtIndex(0, 66, list);
			list.printList(list);
			list.deleteFromStart(list);
			list.insertAtIndex(0, 66, list);
			list.insertAtStart(100, list);
			list.printList(list);
			list.deleteFromStart(list);
			list.printList(list);
			list.deleteFromEnd(list);
			list.deleteFromEnd(list);
			list.insertAtEnd(100, list);
			list.deleteAtIndex(0, list);
			list.printList(list);
			list.deleteAtIndex(7, list);
			list.deleteAtIndexForloop(5, list);
//			list.contanis(99, list);
//			list.contanis(20, list);
			list.printList(list);

		}
	}

}
