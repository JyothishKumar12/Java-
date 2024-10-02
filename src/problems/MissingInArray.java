package problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class MissingInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int ar[] ={1,2,3,5,2,3,6,7,8};
		System.out.println(Arrays.toString(ar));
//		int []same;
		int range =8;
		TreeSet<Integer> same = new TreeSet<Integer>();
		
		for(int i =0;i<ar.length;i++) {
			for(int j =0;j<range;j++) {
				if(ar[i]==j) {
					same.add(j);
				}
			}
		}
//		System.out.println(same);
		
		ArrayList<Integer> ar1 = new ArrayList<>(same);
		System.out.println(ar1);
		for(int i=0;i<ar1.size();i++) {
			for(int j =i+1;j<=i+1;j++) {
				if(ar1.get(i)!=j) {
					System.out.println(ar1.get(i)+ "array value " + j +" j value");
				}
			}
		}
				
	}
	}

