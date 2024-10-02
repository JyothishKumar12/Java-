package Loops;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
//		Write a program to find the factorial value of any number entered through the keyboard.
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a no");
		int num = sc.nextInt();
		int factorial = 1;
//		for(int i =1; i<=num; i++) {
//			factorial = factorial*i;
//		}
//		System.out.println(factorial);

		System.out.println(",,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,");
		int j =1;
		while(j<=num) {
			factorial = factorial*j;
			j++;
		}
		System.out.println(factorial);
		
		
		
		
		
		
		
		
	}

}
