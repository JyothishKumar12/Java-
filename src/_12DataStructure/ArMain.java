package _12DataStructure;

public class ArMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayLST<Integer>ar = new ArrayLST<>();

		ar.add(15);
		ar.add(0);
		ar.add(51);
		ar.add(56);


		ar.display();
//		System.out.println(ar.size+"before");
		System.out.println("----------");
		ar.insertAt(0, 60);
//		System.out.println(ar.size+"size");
		ar.display();
		ar.deleteAtPosition(0);
		System.out.println("-------");
		ar.display();
//		System.out.println(ar.size);



	}

}
