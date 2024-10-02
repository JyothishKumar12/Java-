package collections;

import java.util.ArrayList;

public class _1SumArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> ar = new ArrayList<>();
		ar.add(4);
		ar.add(5);
		ar.add(0);
		ar.add(9);
		ar.add(8);
		ar.add(10);
		System.out.println(ar);
		System.out.println(" sum and avg ar >.......");
		int length;
		int sum =0,avg;
		for(Integer no : ar) {
			sum += no;
		}
		length = ar.size();
		avg =sum/length;
		System.out.println(sum);
		System.out.println(avg);
		System.out.println("------------------");
		System.out.println("Sum of Even no is ");
		sum =0;
		for(Integer no : ar) {
			if(no%2==0) {
				sum +=no;
			}
		}
		System.out.println("Sum of Even no is :"+ sum);
		System.out.println("------------------------");
		System.out.println("Split array in to two");
		
		ArrayList<Integer>ar1 = new ArrayList<>();
		ar1.add(4);
		ar1.add(9);
		ar1.add(8);
		ar1.add(5);
		ar1.add(0);
		ar1.add(10);
		System.out.println(ar1);
		 length  = ar1.size();
		ArrayList<Integer>li2 = new ArrayList<>();
		ArrayList<Integer>li1 = new ArrayList<>();
		for(int i =0;i<length;i++) {
			
		if(i<(length/2)) {
			li1.add(ar1.get(i));
		}else {
			li2.add(ar1.get(i));
		}
		}
		System.out.println();
		System.out.println("Array 1 is :"+li1);
		System.out.println("Array 2 is :" +li2);
		
		System.out.println("-------------------------------------");
		System.out.println("Merging 2 arrays");
		
		for(Integer n: li2) {
			
			li1.add(n);
		}
	System.out.println("New array is :"+li1);
	}

}
