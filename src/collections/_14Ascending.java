package collections;

import java.util.ArrayList;

public class _14Ascending {

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
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>");
		
		for(int i = 0; i<ar.size();i++) {
			for(int j =i+1;j<ar.size();j++) {
				if(ar.get(i)>ar.get(j)) {
					int temp = ar.get(i);
					ar.set(i,ar.get(j));
					ar.set(j,temp);
					System.out.println(ar);
					System.out.println("------------");
				}
			}
			System.out.println("completed "+ i + "iteration");
		
		}
		
		
		
		

	}

}
