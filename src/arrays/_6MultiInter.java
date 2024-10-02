package arrays;

public class _6MultiInter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [][] arr1 =new int [][] {
			{1,8,4},{9,7,2},{7,6,4}
		};
		int length = arr1.length;
		int [][] arr2 = new int [length][length];
		
		for(int i =0;i<length;i++) {
			for(int j =0; j<length;j++) {
				
				arr2[j][i]=arr1[i][j];
			}
		}

		

		for(int i =0;i<length;i++) {
			for(int j =0; j<length;j++) {
				
				 System.out.print("[" +" "+arr2[i][j]+" "+"]");
			}
			System.out.println();
		}
		
		
	}

}
