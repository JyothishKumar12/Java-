package _12DataStructure;

import _12DataStructure.LinkedLst.Node;

public class LstMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedLst l1 = new LinkedLst();
//		l1.insertAtBegining(4);
//		l1.insertAtBegining(35);
//		l1.insertAtBegining(16);
//		l1.insertAtBegining(96);
		l1.insert(12);
		l1.insert(13);
		l1.insert(3);
		l1.insert(34);
		l1.display();
		l1.insertAtPosition(1,10);
//		l1.deleteAtPosition(4);
//		l1.deleteAtEnd();
//		l1.reverse();
		l1.display();
//		l1.size();
//		l1.display();
	}

}
