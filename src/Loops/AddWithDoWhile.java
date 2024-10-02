package Loops;

import java.util.Scanner;

public class AddWithDoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1,num2,sum =0;
		Scanner sc = new Scanner(System.in);
		int choice =1;
		do {
			System.out.println("Enter 2 no's");
			num1=sc.nextInt();
			num2=sc.nextInt();
			
			sum = sum+num1+num2;
			System.out.println("Do you want to add more press 1");
			choice = sc.nextInt();
		}while(choice!=0);

		System.out.println("sum is :"+ sum);
	}

}
