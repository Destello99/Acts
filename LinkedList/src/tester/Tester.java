package tester;

import singly.SinglyLinkedList;

public class Tester {

	public static void main(String[] args) {
		SinglyLinkedList list = new SinglyLinkedList();
		list.sortedInsert(10);
		list.sortedInsert(10);
		list.sortedInsert(11);
		list.sortedInsert(1);
		list.sortedInsert(50);
		list.sortedInsert(2);
		list.sortedInsert(100);
		list.display();
		int size = list.listSize();
		System.out.println("node in linked list: "+size);
		list.reverse();
		list.removeAll(1);
		list.display();

	}

	
	
}
