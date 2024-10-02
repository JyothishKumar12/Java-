package collections;

import java.util.LinkedList;

public class LinkedListExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<String> li = new LinkedList<>();
		
		li.add("Take");
		li.add("Time");
		li.add("Tour");
		li.add("Talks");
		
		System.out.println(li);
		
//		for(String s: li) {
//			System.out.println(s);
//		}
		
		System.out.println("Second"+li.get(2));
		System.out.println(li.remove("Take"));
		System.out.println("--------------");
		System.out.println(li);
		
		System.out.println(li.contains("Time"));
		
		LinkedList<String> li1 =new LinkedList<>();
		li1.add("Brown");
		li1.add("Blue");
		
	System.out.println(li.addAll(li1));
	System.out.println(li);
	System.out.println("-------------");
	System.out.println(li.removeAll(li1));
	System.out.println(li);
	}

}
