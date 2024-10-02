package collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class _15Nonrepeating {

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
		System.out.println(">>>>>>>>>>>>>>>>>>>>");
		
		ArrayList<Integer> li = new ArrayList<>();
		int count =0;
		
		for(int i =0;i<ar.size();i++) {
			int duplicate=-1;
			for(int j=0;j<ar.size();j++) {
				
				if((ar.get(i)==ar.get(j))&&i!=j&&!li.contains(ar.get(i))){
					li.add(ar.get(i));
					duplicate = ar.get(i);
//					System.out.println(duplicate);
				}
				}
			
				if(duplicate == -1) {
					System.out.println(ar.get(i));
					break;
				}
			}
			
		}
	}



