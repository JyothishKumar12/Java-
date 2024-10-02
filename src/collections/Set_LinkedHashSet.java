package collections;

import java.util.LinkedHashSet;

public class Set_LinkedHashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedHashSet<Integer> LH = new LinkedHashSet<Integer>();
		LH.add(23);
		LH.add(34);
		LH.add(2);
		LH.add(7);
		System.out.println(LH);
		System.out.println(LH.isEmpty());
		System.out.println(LH.contains(2));

	}

}
