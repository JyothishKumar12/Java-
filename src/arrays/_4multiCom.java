package arrays;

public class _4multiCom {

	public static void main(String[] args) {
		
		int ar1 [][] = new int [][] {
			{1,2,1},
			{9,7,2},
			{7,6,4}
		};


		
		int ar2 [][] = new int [][] {
			{2,6,8,6},
			{0,1,3,9,7},
			{7,2,0},
			{8,3}
		};

		int ar2length=ar2.length;
//		System.out.println(ar2length);
		int ar1length = ar1.length;
		String no="";
		int k=0,m=0;
		while(k<ar1length) {
		for(int i=0;i<ar2length;i++) {
			for(int j=0;j<ar2[i].length;j++) {
//				System.out.println(ar2[i].length);
//				
				if(ar1[i][m]==ar2[i][j]) {
					no=no+ar2[i][j];
				}
			}
			System.out.println();
		}
		k++;
		m++;
		}
		System.out.println(no);
//		if(no!="") {
//			System.out.println("Common element is :"+no);
//		}
//		else {
//			System.out.println("No common element");
//		}
		
		
		
		
		
		
		
		
		
	}
}
