package collections;

import java.util.ArrayList;
import java.util.List;

public class _3ArrayListCommon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer>li = new ArrayList<>();
		List<Integer>li2 = new ArrayList<>();
		List<Integer>dup = new ArrayList<>();
		li.add(4);
		li.add(9);
		li.add(8);
		li.add(5);
		
		li2.add(1);
		li2.add(8);
		li2.add(0);
		li2.add(5);
		li2.add(1);
		li2.add(6);
		
		for(Integer no :li2) {
			if(li.contains(no)) {
				dup.add(no);
			}
		}
		System.out.println(dup);
	}

}
