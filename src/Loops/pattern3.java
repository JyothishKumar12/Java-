package Loops;

public class pattern3 {

	public static void main(String[] args) {
		
		for(int i=0;i<5;i++) {
			int star=5-i;
			for(int j=1;j<=5;j++ ) {
				
				if(j<star) {
				System.out.print("-");
				}else {
					System.out.print("*");
				}
			}
			System.out.println();
		}

	}

}
