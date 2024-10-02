package _12DataStructure;

public class LinkedLst<T> {

	Node head = null;
	Node tempHead = null;
	class Node {
		T data;
		Node next;
		
		public Node(T value){
			data = value;
			next =null;
		}
	}
	
	public void insert(T value) {
		Node newNode = new Node(value);
		if(head == null) {
			head = newNode;
			tempHead =head;
		}{
		
		tempHead.next= newNode;
		tempHead=newNode;
		}
		}
	
	
	public void insertAtBegining(T value) {
		Node newNode = new Node(value);
		if(head == null) {
			head = newNode;
		}else {
			newNode.next = head;
			head = newNode;
		}
	}
	
	
	public void display() {
		Node temp =head;
		while(temp!=null) {
			System.out.print(temp.data +" ");
			temp=temp.next;
		}
		
	}
	
	
	public void insertAtPosition(int position,T value) {
		System.out.println("--------------");
		if(position == 0) {
			insertAtBegining(value);
			return;
		}
		Node newNode = new Node(value);
		Node temp = head;
		
		for(int i=1;i<position;i++) {
		temp =temp.next;
		if(temp==null) {
//			System.out.println("Invalid postion");
			throw new IllegalArgumentException("Invalid position");
		}
		}
		
		newNode.next =temp.next;
		temp.next = newNode;
	}
	
	
	public void deleteAtPosition(int pos) {
		
		if(head == null) {
			throw new IndexOutOfBoundsException("List is empty");
		}
		
		if(pos==0) {
			head=head.next;
			return;
		}
		
		int size=size();
		if(pos == size) {
			deleteAtEnd();
			return;
		}
		
		Node temp =head;
		Node previous=null;
		for(int i=1;i<=pos;i++) {
			previous = temp;
			temp=temp.next;
		}
		
		previous.next = temp.next;
		
		
		
	}
	
	
	public void deleteAtBegining() {
		if(head == null) {
			throw new IndexOutOfBoundsException("List is Empty");
		}
	}
	
	public void deleteAtEnd() {
		Node temp = head;
//		Node prev = null;
	int size = size();
		for(int i=1;i<size-1;i++){
			temp = temp.next;
//			System.out.println(temp.data);
		}
		temp.next=null;
//		System.out.println(temp.data+"data");
	}
	
	public int size() {
		Node temp=head;
		int size = 0;
		while(temp!=null) {
			temp = temp.next;
			size++;
		}
//		System.out.println(size);
		return size;
	}
	
	public void reverse() {
		Node currentNode=head;
		Node prevNode = null;
		Node nextNode=head.next;
		
		while(currentNode!= null) {
			nextNode = currentNode.next;
			currentNode.next= prevNode;
			prevNode =currentNode;
			currentNode = nextNode;
		}
		
		head = prevNode;
	}
}
