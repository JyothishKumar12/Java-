package arrays;

public class _1MultiDimentional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int mut [][] = new int[][] {
			{1,8,4},
			{9,7,2},
			{7,6,4}
		};
		int sum =0;
		int length =mut.length;
//		System.out.println(length);
		
		for(int i =0;i<length;i++) {
			for(int j =0;j<length;j++) {
				System.out.print("[" + " "+ mut[i][j]+" "+ "]");
				sum = sum+mut[i][j];
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("sum of Array is :"+ sum);
	}

}
