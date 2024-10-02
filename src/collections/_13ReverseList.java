package collections;

import java.util.ArrayList;
import java.util.List;

public class _13ReverseList {

	public static void main(String[] args) {
		
		List<Integer> li2 = new ArrayList<>();
		li2.add(1);
		li2.add(8);
		li2.add(0);
		li2.add(5); 
		li2.add(1);
		li2.add(6);
		li2.add(7);
//System.out.println(li2.size());
		int length = (li2.size())/2;
		for(int i=0;i<length;i++) {
			int temp = li2.get(li2.size()-(i+1));
			System.out.println("temp" +temp);
			li2.set(li2.size()-(i+1),li2.get(i));
			li2.set(i,temp);
			System.out.println(li2);
		}
	
	}

}
