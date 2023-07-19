package singly;

import Node.Node;

public class SinglyLinkedList {
	Node head;
	public static int size = 0;

	//Add node to it's appropriate position
	public void sortedInsert(int value) {
		Node newNode = new Node(value);

		if (head == null || head.data >= newNode.data) {
			newNode.next = head;
			head = newNode;
		} else {
			Node current = head;
			while (current.next != null && current.next.data < newNode.data) {
				current = current.next;
			}
			newNode.next = current.next;
			current.next = newNode;
		}
	}
	public void display() {
		Node current = head;
		while (current != null) {
			System.out.print(current.data + "->");
			current = current.next;
		}
		System.out.println("null");
	}

	//Remove all occurrence of given data
	public void removeAll(int data) {
		Node prev = null;
		Node trav = head;
		if (head == null)
			System.out.println("list is empty");
		while (trav != null) {
			if (head.data == data) {
				head = head.next;
				trav = head;
			} else if (trav.data == data) {
				prev.next = trav.next;
				trav = trav.next;
			} else {
				prev = trav;
				trav = trav.next;
			}
		}
	}

	//Print reverse using recursion


	public void removeAll() {
		if (head == null)
			System.out.println("liest is empty");
		else {
			head = null;
		}
		System.out.println("every node is removed");
	}

	public void printReverse(Node head) {

		if (head != null) {
			printReverse(head.next);
			System.out.print(head.data + "->");
		}
	}

	// Wrapper method for reverse
	public void reverse() {
		printReverse(head);
		System.out.print("head");
		System.out.println();
	}

	public int listSize() {
		return size;
	}
}
