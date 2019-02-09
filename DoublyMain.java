import java.util.Scanner;
class Node {
	public int data;
	public Node next;
	public Node prev;
 
	public void displayNodeData() {
		System.out.println("{ " + data + " } ");
	}
}
 
class DoublyLinkedList {
 
	private Node head;
	private Node tail;
	int size;
 
	public boolean isEmpty() {
		return (head == null);
	}
	public void insertFirst(int data) {
		Node newNode = new Node();
		newNode.data = data;
		newNode.next = head;
		newNode.prev=null;
		if(head!=null)
			head.prev=newNode;
		head = newNode;
		if(tail==null)
			tail=newNode;
		size++;
	}
 
	public void insertLast(int data) {
		Node newNode = new Node();
		newNode.data = data;
		newNode.next = null;
		newNode.prev=tail;
		if(tail!=null)
			tail.next=newNode;
		tail = newNode;
		if(head==null)
			head=newNode;
		size++;
	}
	
	public Node deleteFirst() {
 
		if (size == 0) 
			throw new RuntimeException("Doubly linked list is already empty");
		Node temp = head;
		head = head.next;
		head.prev = null;
		size--;
		return temp;
	}
 
	public Node deleteLast() {
 
		Node temp = tail;
		tail = tail.prev;
		tail.next=null;
		size--;
		return temp;
	}
 

	public void deleteAfter(Node after) {
		Node temp = head;
		while (temp.next != null && temp.data != after.data) {
			temp = temp.next;
		}
		if (temp.next != null)
			temp.next.next.prev=temp;
		temp.next = temp.next.next;
 
	}

	public void printLinkedListForward() {
		System.out.println("Printing Doubly LinkedList (head --> tail) ");
		Node current = head;
		while (current != null) {
			current.displayNodeData();
			current = current.next;
		}
		System.out.println();
	}

	public void printLinkedListBackward() {
		System.out.println("Printing Doubly LinkedList (tail --> head) ");
		Node current = tail;
		while (current != null) {
			current.displayNodeData();
			current = current.prev;
		}
		System.out.println();
	}
}
public class DoublyMain {
 
 public static void main(String args[])
 {
   DoublyLinkedList myLinkedlist = new DoublyLinkedList();
   myLinkedlist.insertFirst(5);
   myLinkedlist.insertFirst(6);
   myLinkedlist.insertFirst(7);
   myLinkedlist.insertFirst(1);
   myLinkedlist.insertLast(2);
   myLinkedlist.printLinkedListForward();
   myLinkedlist.printLinkedListBackward();
   

   Node node=new Node();
   node.data=1;
   myLinkedlist.deleteAfter(node);
   myLinkedlist.printLinkedListForward();
   myLinkedlist.printLinkedListBackward();
 myLinkedlist.deleteFirst();
   myLinkedlist.deleteLast();
   myLinkedlist.printLinkedListForward();
   myLinkedlist.printLinkedListBackward();
 }
}