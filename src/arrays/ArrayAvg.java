package arrays;

public class ArrayAvg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int no[] = {2,5,3,9,6};
		
		int sum=0,avg =0;
		int length = no.length;
		for (int i : no) {
			sum = sum+i;
			avg =sum/length;
		}
		System.out.println(avg);
	}

}
