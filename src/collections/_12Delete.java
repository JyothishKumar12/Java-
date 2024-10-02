package collections;

import java.util.ArrayList;
import java.util.List;

public class _12Delete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> li = new ArrayList<>();
		
		li.add(4);
		li.add(9);
		li.add(8);
		
		List<Integer> li2 = new ArrayList<>();
		li2.add(4);
		li2.add(1);
		li2.add(9);
		li2.add(4);
		li2.add(8);
		li2.add(0);
		li2.add(5);
		li2.add(1);
		li2.add(8);
		li2.add(6);
		
		for(Integer n : li) {
			while(li2.contains(n)!=false) {
				li2.remove(n);
			}
		}
		System.out.println(li2);
//		for(Integer n : li) {
//			if(li2.contains(n)) {
//				li2.remove(n);
//			}
//		}System.out.println(li2);
		
	}

}
