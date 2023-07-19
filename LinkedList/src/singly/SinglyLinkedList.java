package singly;

import Node.Node;

public class SinglyLinkedList {
	Node head;
	public static int size = 0;
	public void insert(int data) {
		Node newNode = new Node(data);
		if(head ==  null) {
			head= newNode;
			++size;
		}
		else {
			Node trav = head;
			Node prev = trav;
			
			if(head.data > newNode.data) {
				newNode.next = head;
				head = newNode;
			}
			else {
				trav = head.next;
				while(trav != null) {
					System.out.println("insode loop");
					if(prev.data < newNode.data) {
						newNode.next = trav;
						prev.next = newNode;
					}
					prev = trav;
					trav = trav.next;
				}
			}
			
		}
		size++;
	}
	
	public void  display() {
		
		if(head == null) {
			System.out.println("List is empty");
		}
		else {
			Node trav = head;
			System.out.println("head data="+head.data);
			
			 while(trav != null) {
				 System.out.print(trav.data+"->"); 
				 trav =trav.next;
				 
			 }
			System.out.println("null");
		}
	}
	public void removeAll() {
		if(head==null)
			System.out.println("liest is empty");
		else {
			head = null;
		}
		System.out.println("every node is removed");
	}
	public void printReverse(Node head) {
		
		if(head != null) {
			printReverse(head.next);
			System.out.print(head.data+"->");
		}
	}
	public void reverse() {
		printReverse(head);
	}
	
	public int listSize() {
		return size-1;
	}

}
