package collections;

import java.util.ArrayList;
import java.util.List;

public class _10ListToArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> li2 = new ArrayList<>();
		li2.add(4);
		li2.add(9);
		li2.add(8);
		li2.add(5); 
		li2.add(0);
		li2.add(10);
		Object ar = li2.toArray();
		System.out.println(ar.toString());
		System.out.println(ar);
		
	}

}
