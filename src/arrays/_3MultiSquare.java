package arrays;

public class _3MultiSquare {

	public static void main(String[] args) {
		
		int ar [][] = new int[][] {
			{2,3,5},
			{0,1,3},
			{1,2,4}	
		};
		int length = ar.length;
		int [][] sqOutput = new int [length][length];
				
		for(int i=0;i<length;i++) {		
			for(int j=0;j<length;j++) {
				sqOutput[i][j] = ar[i][j]*ar[i][j];
			}
		}
		
		
		for(int i =0;i<length;i++) {
			for(int j=0;j<length;j++) {
				System.out.print("["+ ""+sqOutput[i][j] +" "+"]");
			}
			System.out.println();
		}
		
	}

}
