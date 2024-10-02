package _12DataStructure;

import java.util.Arrays;

public class _3LinearMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		int ar[]= new int []{1,2,37,4,9};
		//		int result = _3LinearSearch.searchElement(ar, 37);
		//		System.out.println(result);
		int result = _3LinearSearch.getIndex(ar,37);
		System.out.println(result);

		boolean re2 = _3LinearSearch.contains(ar,3);
		System.out.println(re2);

		String name ="kavitha";
		int re3=	_3LinearSearch.searchElement(name,'k');
		System.out.println(re3);

		
		int ar1[][]=new int[][] {
			{1,2,3},
			{2,3,4},
			{5,6,9}
		};

		int re4 = _3LinearSearch.searchElement(ar1,10);
		System.out.println(re4 +"  array");
		int[] re45 = _3LinearSearch.getIndex(ar1,51);
		System.out.println(Arrays.toString(re45));
	}

}
