package _12DataStructure;

import java.util.Arrays;

public class _5SelectionMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {11,8,3,6};
		
_5SelectionSort.sort(arr);
System.out.println(Arrays.toString(arr));
_5SelectionSort.descendingSort(arr);
System.out.println(Arrays.toString(arr));
	}

}
