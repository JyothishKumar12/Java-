package Loops;

import java.util.Scanner;

public class MutiplicationTable {

	public static void main(String[] args) {
		
//		Write a program that prompts the user to input a positive integer.
//		It should then print the multiplication table of that number.

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		
//		for(int i =1; i<=10; i++) {
//			
//			System.out.println(num +"*"+ i + "=" + num*i);
//		}
//		int i=1;
//		while(i<=10) {
//			System.out.println(num +"*"+ i + "=" + num*i);
//			i++;
//		}
		int j =1;
		do {
			System.out.println(num +"*"+ j + "=" + num*j);
			j++;
		}while(j<=10);
	}

}
