package Loops;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
//		Write a program that prompts the user to input an integer and
//		then outputs the number with the digits reversed. 
//		For example, if the input is 12345, the output should be 54321.
//		
		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter a no");
//		float no = sc.nextInt();
		int no = 21;

		int quot,remainder = 0,temp,rev = 0;
		
		while(no>0) {
		quot = no/10;
		
		remainder = no%10;
		
		System.out.println("remainder "+remainder);
		rev = rev+remainder;
		System.out.println("rev value"+rev);
		no =quot;
		temp = 10*rev;
		if(quot>0) {
		rev = temp;
		}
		System.out.println("rev value after swap"+rev);
		}
		System.out.println(rev);
		
		
		
	}
	}



