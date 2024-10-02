package Loops;

import java.util.Scanner;

public class NegAndPositiveCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		Scanner sc = new Scanner(System.in);
		int negCount=0,posCount=0,zeroCount=0;

		int choice = 1; 

		while(choice != 0) {

			System.out.println("Enter no's ");
			int number = sc.nextInt();
			if(number>0) {
				posCount++;
			}
			else if(number<0)
			{
				negCount++;
			}
			else{
				zeroCount++;
			}
			System.out.println("Do you want to add more values PRESS 'Y' or 'y' else Press 'N' or 'n' ");
		
			choice = sc.nextInt();
		
		}
		System.out.println("Negative no's is "+negCount);
		System.out.println("Positive no's is "+posCount);
		System.out.println("Zero no's is "+zeroCount);
	}

}
