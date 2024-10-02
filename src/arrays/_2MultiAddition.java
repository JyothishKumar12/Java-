package arrays;

public class _2MultiAddition {

	public static void main(String[] args) {
		
		int ar1 [][] = new int[][] {
			{1,2,1},
			{9,7,2},
			{7,6,4}
		};
		
		int ar2 [][] = new int [][] {
			{2,6,8},
			{0,1,3},
			{1,2,4}
		};
		
		int output[][]=new int[3][3];
//		int sum =0;
		int length =ar1.length;
//		System.out.println(length);
		
		for(int i =0;i<length;i++) {
			for(int j =0;j<length;j++) {
				
				output [i][j] = ar1[i][j]+ar2[i][j];
			}
			
		}
		
		for(int i =0;i<length;i++) {
			for(int j =0;j<length;j++) {
				
				System.out.print("[" +" "+output[i][j] +" "+"]");
			}
			System.out.println();
		}
		
		
	}


	}


