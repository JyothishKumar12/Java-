package collections;

import java.util.ArrayList;
import java.util.List;

public class _4HighestDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> li = new ArrayList<>();
		li.add(4);
		li.add(1);
		li.add(9);
		li.add(4);
		li.add(8);
		li.add(0);
		li.add(5);
		li.add(8);
		li.add(1);
		li.add(8);
		li.add(6);
//		List<Integer> li2 = new ArrayList<>();
		System.out.println("Array List : "+li);
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");

		int count =0;
		int duplicate=-1;
		for(int i =0;i<li.size();i++) {
			count=1;
			for(int j=0;j<li.size();j++) {
				
				if(li.get(i)==li.get(j)&& i!= j) {
					
					duplicate =li.get(i);
					count++;	
				}	
			}
			
			if(duplicate!=-1) {
				System.out.println("Duplicate value "+duplicate + "count is :"+ count);
//				System.out.println(count);
				System.out.println("--------------");
				}
			
			for(int k=0;k<count;k++) {
				if(li.contains(duplicate)) {
					int index = li.indexOf(duplicate);
					System.out.println("duplicate value"+duplicate);
					li.remove(index);
					System.out.println("Ar is "+li);
					
				}
			}
		
		}
		System.out.println("final "+li);
	}

}
