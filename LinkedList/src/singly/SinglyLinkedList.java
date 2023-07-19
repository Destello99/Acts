package singly;

import Node.Node;

public class SinglyLinkedList {
	Node head;
	public static int size = 0;
<<<<<<< HEAD

	//Add node to it's appropriate position
	public void sortedInsert(int data){
		Node newNode = new Node(data);
		if(head  ==  null) {
			head = newNode;
			//adding new node to empty liked list
		}
		else{
			Node trav;
			Node prev;
			trav = prev = head;
			if(head.data > newNode.data){
=======
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
>>>>>>> origin/main
				newNode.next = head;
				head = newNode;
			}
			else {
<<<<<<< HEAD
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

	//Remove all occurrence of given data
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

	//Print reverse using recursion
=======
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
>>>>>>> origin/main
	public void printReverse(Node head) {
		
		if(head != null) {
			printReverse(head.next);
			System.out.print(head.data+"->");
		}
	}
<<<<<<< HEAD

	// Wrapper method for reverse
	public void reverse() {
		printReverse(head);
		System.out.print("head");
		System.out.println();
	}
	
	public int listSize() {
		return size;
=======
	public void reverse() {
		printReverse(head);
	}
	
	public int listSize() {
		return size-1;
>>>>>>> origin/main
	}

}
