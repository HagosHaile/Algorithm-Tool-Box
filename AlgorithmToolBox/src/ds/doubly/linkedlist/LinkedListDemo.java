package ds.doubly.linkedlist;

public class LinkedListDemo {

	public static void main(String[] args) {
		DoublyLinkedList  linkedList = new DoublyLinkedList();
		linkedList.insertLast(6);;
		linkedList.insertLast(9);
		linkedList.insertFirst(5);
		linkedList.insertLast(12);;
		linkedList.deleteFirst();
		linkedList.printLinkedListForward();
		linkedList.printLinkedListBackward();

	}

}
