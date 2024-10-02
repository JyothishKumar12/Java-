package collections;

import java.util.Arrays;
import java.util.List;
import java.util.Vector;

public class VectorExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vector v1 = new Vector();
		v1.add("tree");
		v1.add("tea");
		System.out.println(v1);
		v1.add(1,"train");
		System.out.println(v1.size());
		System.out.println(v1.capacity());
		
		Vector v2 = new Vector();
		v2.add("cup");
		v2.add("coffe");
		
		v1.addAll(v2);
		System.out.println(v1);
		
		Vector v3 = new Vector();
		v3.add("milk");
		v3.add("diary");
		
		for(int i=0;i<v3.size();i++) {
			v1.add(v3.get(i));
		}
		System.out.println("The v1" + v1);
		
		Vector v4 = new Vector();
		v4.add("Sorry");
		v4.add("Thriller");
		
		Object ar[]= new Object [] {1,45};
	List<Object>li=	Arrays.asList(ar);		
	
	System.out.println(v4);
		
	v4.set(0,"What do you mean");
	System.out.println(v4 );
	}

}
