package _9Exceptions;

import java.util.Scanner;

public class ExceptionsExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Scanner sc = new Scanner(System.in);
		
		int a = 12;
		int b = 0;
		int div;
		
		try{
			System.out.println(a/b);
		}
		catch(ArithmeticException e){
			System.out.println(e);
		}
		finally{
			System.out.println("completed");
		}

		System.out.println("----------->>>>>>>>>>>>------------");
	}

}
