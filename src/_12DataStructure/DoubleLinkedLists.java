package _12DataStructure;

public class DoubleLinkedLists {

	Node head;
	Node tail;
	Node tempHead=null;
	class Node {
		int data;
		Node next;
		Node prev;

		Node(int data){
			this.data = data;
			next = null;
			prev = null;
		}
	}


	public void insertAtBegining(int value) {
		Node newNode = new Node(value);
		if(head == null) {
			head=newNode;
			tail = newNode;

		}else {
			newNode.next=head;
			head.prev=newNode;			
			head = newNode;

		}
	}

	public void display() {
		Node temp = head;
		System.out.print("[ ");
		while(temp!=null) {
			System.out.print(temp.data +",");
			temp =temp.next;
		}
		System.out.print(" ]");
	}

	public void displayReverse() {
		Node temp = tail;
		System.out.print("[ ");
		while(temp!=null) {
			System.out.print(temp.data +",");
			temp =temp.prev;
		}
		System.out.print(" ]");
	}

	public void insert(int value) {
		Node newNode = new Node(value);

		if(head == null) {
			head = newNode;
			tail = newNode;
			tempHead =head;
		}
		else {

			newNode.prev=tail;
			tempHead.next= newNode;
			tempHead =newNode;
			tail = newNode;
		}
	}

	public void insertAtPosition(int pos ,int value) {
		
		if(pos == 0) {
			insertAtBegining(value);
			return;
		}
		Node newNode = new Node(value);
		Node temp = head;
		for(int i=1;i<pos;i++) {
//			System.out.println(i);
//			System.out.println(temp.data);
			temp = temp.next;
		}
//		System.out.println("------");
//		System.out.println(temp.data);
	
		newNode.next=temp.next;
		newNode.prev=temp;
		
		if(temp==tail) {
			temp.next = newNode;
			newNode.prev =temp;
		}
		
		temp.next.prev=newNode;
		temp.next = newNode;
	}
	
	
	public void deleteAtPosition(int pos) {
		if(head == null) {
			throw new IllegalArgumentException("Empty List");
		}
		
		if(pos == 0) {
			head = head.next;
			if(head == null) {
				tail = null;
			}else {
				head.prev = null;
				return;
			}
		}
			Node temp = head;
			Node prev = null;
			for(int i=1;i<=pos;i++) {
				prev = temp;
				temp = temp.next;
				
				if(temp == null) {
					throw new IllegalArgumentException("Invalid position");
				}
			}
			
			prev.next =temp.next;
			if(temp.next==null) {
				tail = prev;
			}else {
			temp.next.prev = prev;
			}
			
		}
		
	
	
	
	public void deleteAtBegining(int pos) {
		if(head == null) {
			throw new IllegalArgumentException("Empty List");
		}
		
		if(pos == 0) {
			head = head.next;
			if(head == null) {
				tail = null;
			}else {
				head.prev = null;
				return;
			}
			
		}
	}
}
