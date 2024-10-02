package javaProblems;

public class CircularArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int nums [] = {0,1,0,1,1,0,0};

		int remainder =-1;
		for(int i=0;i<nums.length-1;i++) {

			for(int j=i+1;j<=i+1;j++) {
				System.out.print("i :"+i +","+ " j :"+j);


				System.out.println();
				//				  System.out.println(nums[j]);
				//				  System.out.println("j"+j);
				if(nums[i]!=nums[j]) {

					if(nums[i]!=1) {
						System.out.print("i :"+i +","+ " j :"+j);
						System.out.println();
						remainder++;
						System.out.println("value of r :"+remainder+": ");
						int temp = nums[remainder];
						nums[remainder]=nums[j];
						nums[j]=temp;
						System.out.println("----------------");
						System.out.print("[ ");
						for (int k : nums) {
							System.out.print( k+" ,");
						}
						System.out.println("]");
						System.out.println("----------------");
						//						  remainder =i;


						System.out.println("value of after r :"+remainder+": ");
					}
				}

			} 

		}
	}

}
