package singly;

import Node.Node;

public class SinglyLinkedList {
	Node head;
	public static int size = 0;
//	public void insert(int data) {
//		Node newNode = new Node(data);
//		if(head ==  null) {
//			head= newNode;
//			++size;
//		}
//		else {
//			Node trav = head;
//			Node prev = trav;
//
//			if(head.data > newNode.data) {
//				newNode.next = head;
//				head = newNode;
//			}
//			else {
//				trav = head.next;
//				while(trav != null) {
//					if(prev.data < newNode.data) {
//						newNode.next = trav;
//						prev.next = newNode;
//					}
//					prev = trav;
//					trav = trav.next;
//				}
//			}
//
//		}
//		size++;
//	}

//TODO add node to linked in sorted order
	public void sortedInsert(int data){
		Node newNode = new Node(data);
		if(head  ==  null) {
			head = newNode;
			size++;
			//adding new node to empty liked list
		}
		else{
			Node trav;
			Node prev;
			trav = prev = head;
			if(head.data > newNode.data){
				newNode.next = head;
				head = newNode;
			}
			else {
				while (trav.data < newNode.data && trav.next != null){
					prev=trav;
					trav = trav.next;
				}
				if(trav.next == null) {
					trav.next = newNode;
					size++;
					return;
				}
				newNode.next = trav;
				prev.next = newNode;
			}
		}
		size++;
	}
	public void  display() {
		Node current = head;
		while (current != null) {
			System.out.print(current.data +"->");
			current = current.next;
		}
		System.out.println("null");
	}
	public void removeAll( int data) {
		Node prev = null;
		Node trav = head;
		if(head==null)
			System.out.println("list is empty");
		while (trav != null) {
			if (head.data == data) {
				head = head.next;
				trav = head;
			} else if (trav.data == data) {
				prev.next = trav.next;
				trav = trav.next;
			}
			else {
				prev = trav;
				trav = trav.next;
			}
		}
	}
	public void printReverse(Node head) {
		
		if(head != null) {
			printReverse(head.next);
			System.out.print(head.data+"->");
		}
	}
	public void reverse() {
		printReverse(head);
		System.out.print("head");
		System.out.println();
	}
	
	public int listSize() {
		return size-1;
	}

}
