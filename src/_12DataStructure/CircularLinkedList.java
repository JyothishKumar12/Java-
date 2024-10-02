package _12DataStructure;

public class CircularLinkedList<T> {
	
Node last;
	
	class Node{
		T data;
		Node next;
		
		Node(T data){
			this.data = data;
			next = null;
		}
	}
	
	CircularLinkedList(){
		last = null;
	}
	
	public void insertAtBegining(T data) {
		Node newNode = new Node(data);
		if(last == null) {
			newNode.next = newNode;
			last = newNode;
		}else {
			newNode.next = last.next;
			last.next = newNode;
		}
	
	}
	
	public void insertAtEnd(T data) {
		Node newNode = new Node(data);
		if(last == null) {
			newNode.next = newNode;
			last = newNode;
		}else {
		
			newNode.next=last.next;
			last.next = newNode;
			last = newNode;
		}
		
	}
	
	public void display() {
		Node temp =  last.next;
		do {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}while(temp!=last.next);
	}
	
	public T deleteFromBegining() {
		T data = last.next.data;
		if(last==null) {
			throw new IllegalArgumentException("List is Empty");
		}
		if(last == last.next){
			last = null;
		}else {
		Node temp = last.next;
		last.next=temp.next;
		}
		return data;
	}
	
	public T deleteAtEnd() {
		
		if(last==null) {
			throw new IllegalArgumentException("List is Empty");
		}
		T data = last.data;
		if(last == last.next) {
			last = null;
		}else {
			Node temp = last.next;
			while(temp.next!=last) {
				temp =temp.next;
			}
			temp.next = last.next;
			last = temp;
		}
		return data;
	}
}
