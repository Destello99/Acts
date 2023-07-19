package tester;

import singly.SinglyLinkedList;

public class Tester {

	public static void main(String[] args) {
		SinglyLinkedList list = new SinglyLinkedList();


		list.insert(10);
		list.insert(9);
		list.insert(7);
		list.insert(8);
		list.display();
		int size = list.listSize();
		System.out.println(size);
		list.reverse();
		list.removeAll();
		list.display();
	}

	
	
}
