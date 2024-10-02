package collections;

import java.util.TreeSet;

public class Set_TreeSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeSet<Integer> ts = new TreeSet<>();
		ts.add(23);
		ts.add(21);
		ts.add(45);
		ts.add(67);
		System.out.println(ts);
		System.out.println(ts.first());
		System.out.println(ts.last());
		System.out.println(ts.subSet(20,60));

	}

}
