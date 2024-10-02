package collections;

import java.util.HashSet;

public class Set_HashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet hs = new HashSet();
		hs.add(1);
		hs.add(60);
		hs.add(34);
		hs.add(45);
		hs.add(89);
		
		System.out.println(hs);
		hs.remove(60);
		hs.remove(2);
		System.out.println(hs);
		System.out.println(hs.contains(45));

	}

}
