package _12DataStructure;

import java.util.Arrays;

public class _7InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]= {1023,5,3,2,10,4};
		_7InsertionSort.InsertionSort(arr);
		System.out.println("Arrays are :"+ Arrays.toString(arr));
	}
	
	
	public static void InsertionSort(int arr[]) {
		
		for(int i=1;i<arr.length;i++) {

			for(int j=i;j>0;j--) {
	
				if(arr[j]<arr[j-1]) {
				
					int temp = arr[j];
					arr[j] = arr[j-1];
					arr[j-1] = temp;
				}
				else {
					break;
				}
			}
		}
	}

}
