package _12DataStructure;

public class CircularListMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CircularLinkedList li = new CircularLinkedList();
		li.insertAtBegining(12);
		li.insertAtBegining(23);
		li.insertAtBegining(21);
		
		li.display();
//		li.insertAtEnd(3456);
//		li.display();
//		li.deleteFromBegining();
		li.deleteAtEnd();
		System.out.println("_________");
		li.display();
	}

}
