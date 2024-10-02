package arrays;

public class _5MultiCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [][] arr1 = new int [][] {
			{1,2,1},{9,7,2},{7,6,4}
		};

		int [][] arr2 = new int [][] {
			{1,6,1},{0,7,3},{1,6,4}
		};
		
		int length = arr1.length;
		
		int[][] output = new int[length][length];
		
		for(int i=0;i<length;i++) {
			for(int j =0;j<length;j++) {
				if(arr1[i][j]==arr2[i][j]) {
					output[i][j] = 1;
				}else {
					output[i][j] =0;
				}
			}
		}
		
		
		
		
		for(int i=0;i<length;i++) {
			for(int j =0;j<length;j++) {
				System.out.print("["+" "+output[i][j] +" "+"]");
			}
			System.out.println();
		}
	}

}
