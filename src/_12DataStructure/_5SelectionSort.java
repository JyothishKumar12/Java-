package _12DataStructure;

import java.util.Arrays;

public class _5SelectionSort {


	public static void sort(int arr[]) {

		for(int i=0;i<arr.length;i++) {
			int minum=i;
			for(int j =i+1;j<arr.length;j++) {

				if(arr[j]<arr[minum]) {
					minum=j;
				}
			}
			int temp = arr[i];
			arr[i]=arr[minum];
			arr[minum]=temp;
		}

	}
	
	
	public static void descendingSort(int arr[]) {
		
		for(int i=0;i<arr.length;i++) {
			int max=i;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[max]<arr[j]) {
					max = j;
				}
			}
			int temp = arr[i];
			arr[i] = arr[max];
			arr[max] = temp;
		}
	}
}

