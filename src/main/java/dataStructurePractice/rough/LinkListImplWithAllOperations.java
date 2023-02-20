package dataStructurePractice.rough;

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

		public void insertAtIndex(int index, int data, LinkList list) {
			Node newNode = new Node(data);
			Node currentNode = list.head, prev;

			if (list.head == null) {
				list.head = newNode;
			}

			else if (list.head != null && index == 0) {
				list.head = newNode;
				newNode.next = currentNode;
				return;
			} else {
				int counter = 1;
				while (currentNode.next != null) {
					if (counter == index) {
						prev = currentNode.next;
						currentNode.next = newNode;
						newNode.next = prev;
						break;
					} else {
						currentNode = currentNode.next;
						counter++;
					}
				}
			}
		}

		public void insertAtEnd(int data, LinkList list) {
			Node newNode = new Node(data);
			Node currentNode = list.head;

			if (currentNode == null) {
				head = newNode;
				return;
			} else {
				while (currentNode.next != null) {
					currentNode = currentNode.next;
				}
				currentNode.next = newNode;
			}
		}

		public void insertAtStart(int data, LinkList list) {
			Node newNode = new Node(data);
			if (list.head == null) {
				list.head = newNode;
				return;
			}

			Node currentNode = list.head;
			list.head = newNode;
			newNode.next = currentNode;
		}

		public void contanis(int data, LinkList list) {
			if (list.head == null) {
				System.out.println("empty");
				return;
			}
			int counter = 0;
			Node currentNode = list.head;
			while (currentNode != null && currentNode.data != data) {
				currentNode = currentNode.next;
				counter++;
			}
			if (currentNode != null)
				System.out.println("found at" + counter);
			else {
				System.out.println("not found");
			}

		}

		public void print(LinkList list) {
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

			list.insertAtIndex(0, 10, list);
			list.insertAtIndex(0, 9, list);
			list.insertAtIndex(1, 1, list);
			list.insertAtIndex(1, 2, list);
			list.insertAtIndex(2, 3, list);
			list.insertAtEnd(2, list);
			list.insertAtStart(20, list);
			list.insertAtEnd(2, list);
			list.insertAtIndex(0, 66, list);
			list.contanis(99, list);
			list.contanis(20, list);
			list.print(list);

		}

	}

}
