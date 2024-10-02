package _12DataStructure;

public class _4BinarySearch {

	public static int searchElement(int arr[],int target) {

		int start=0;
		int end=arr.length-1;
		boolean ascending =true;

		while(start<=end) {
			
			int mid = (start + end)/2;


			if(arr[start]<arr[end]) {
				System.out.println("it ascending");
				
				if(target>arr[mid]) 
				{
					start = mid+1;
				}
				else if(target<arr[mid])
				{
					end = mid-1;
				}else if(target == arr[mid]) 
				{
					return 1;
				}
			}else {
//				System.out.println("it descending");
				
				if(target>arr[mid]) {
					end=mid-1;
				}else if(target<arr[mid]) {
					start = mid+1;
				}else if(target==arr[mid]) {
					return 1;
				}
				
			}
			
		}

		return -1;
	}

}
