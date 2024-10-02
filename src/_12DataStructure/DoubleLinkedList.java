package _12DataStructure;

public class DoubleLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DoubleLinkedLists dl = new DoubleLinkedLists();
//		dl.insetAtBegining(0);
//		dl.insetAtBegining(15);
//		dl.insetAtBegining(34);
		dl.insert(23);
		dl.insert(2);
		dl.insert(45);
		dl.insert(67);
		dl.insertAtPosition(3,120);
		System.out.println("--------------");
//		dl.insertAtPosition(0,390);
		
		dl.display();
		dl.deleteAtPosition(4);
		dl.display();
		dl.displayReverse();
	}

}
