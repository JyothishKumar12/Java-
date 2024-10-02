package Loops;

import java.util.Scanner;

public class EvenOddSum {

	public static void main(String[] args) {
		
			Scanner sc = new Scanner(System.in);
			int oddSum = 0,evenSum=0;
			int num;
		int choice = 1;
		
		

			while(choice!=0){ 
				System.out.println("Enter a no");
				num = sc.nextInt();
				
				if(num %2 == 0) {

					evenSum = evenSum+num;
				}
				else {
					oddSum=oddSum+num;
				}
				System.out.println("Click 1 add more no ");
				choice=sc.nextInt();
			} 
			System.out.println("Even sum is : "+evenSum);
			System.out.println("Odd sum is : "+ oddSum);
		} 

	}

