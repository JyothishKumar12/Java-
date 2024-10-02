package Loops;

import java.util.Scanner;

public class FibanocciSeries {

	public static void main(String[] args) {

		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the limit ");
		int number = sc.nextInt();
		System.out.print(0 +" ," +1 +", ");
		int a=0,b=1,c;		
		for(int i =0;i<number-2;i++) {


			c =a+b;
			System.out.print(c +", ");
			a=b;
			b=c;
		}
	}

}
