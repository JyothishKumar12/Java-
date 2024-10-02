package collections;

import java.util.ArrayList;

public class _14Desecending {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> ar = new ArrayList<>();
		ar.add(4);
		ar.add(1);
		ar.add(9);
		ar.add(4);
		ar.add(8);
		ar.add(0);
		ar.add(5);
		ar.add(8);
		ar.add(1);
		ar.add(8);
		ar.add(6);
		
		System.out.println(ar);
		System.out.println("-------------");
		int temp;
		for(int i =1; i<ar.size();i++) {
			for(int j =0;j<i;j++) {
				
				if((ar.get(i))<(ar.get(j))) {
//					System.out.println("first---------" +ar.get(i) + " " +ar.get(j));
					ar.set(i,ar.get(i));
					ar.set(j,ar.get(j));
//					System.out.println(ar +"--");
				}
				else {
					temp = ar.get(i);
					ar.set(i,ar.get(j));
					ar.set(j,temp);
//					System.out.println(ar);
				}
			}
		}

		System.out.println(ar);
	}

}
