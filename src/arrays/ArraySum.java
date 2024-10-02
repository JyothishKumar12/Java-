package arrays;

public class ArraySum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int[] no = {2,5,1,9,6};
		
		int sum =0;
		for(int i : no) {
			sum = sum+i;
			System.out.println(i);
		}
		System.out.println(sum);
	}

}
