package collections;

import java.util.ArrayList;

public class ArrayListExamples {
	
public static void main(String[] args) {
	ArrayList<Integer> all = new ArrayList<>();
	all.add(5);
	all.add(4);
	all.add(45);
	all.add(2);
	System.out.println(all);
	System.out.println(all.size());
	
	ArrayList<Integer> al2 = new ArrayList<>();
	al2.add(111);
	al2.add(222);
	
	all.addAll(al2);
	
//	System.out.println("Extended "+ all);
//   System.out.println(all.remove(2));
//   System.out.println(all.removeAll(al2));
//   System.out.println(all);
//   all.set(1,36);
//   System.out.println(all);
   al2.clear();
   System.out.println(al2);
}
}
