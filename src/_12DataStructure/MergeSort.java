package _12DataStructure;

import org.bouncycastle.util.Arrays;

public class MergeSort {

	public static int[] mergeSorting(int[] arr) {
		
		if(arr.length ==1) {
			return arr;
		}
		
		int mid = arr.length/2;
		
		int []left = mergeSorting(Arrays.copyOfRange(arr,0, mid));
		int [] right = mergeSorting(Arrays.copyOfRange(arr, mid,arr.length));
		
				return merge(left,right);
	}
	public static int[] merge(int[]first, int[] second) {
		
		int [] joined = new int [first.length+second.length];
		int i=0,j=0,k=0;
		
		while(i<first.length && j<second.length)
			if(first[i]<second[j]) {
				joined[k++] = first[i++];
			}else {
				joined[k++] = second[j++];
			}
		
		while(i<first.length) {
			joined[k++]=first[i++];
		}
		while(i<second.length) {
			joined[k++] = second[j++];
		}
		return joined;
	}
	public static void main(String ar[]) {
		int []arr = {1,2,3,4};
		MergeSort.mergeSorting(arr);
	}
}
