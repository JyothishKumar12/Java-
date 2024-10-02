package Loops;

public class Nnumbers {

	public static void main(String[] args) {
		//Write a program to print numbers from 1 to 10.
		
		for(int i=1;i<=10;i++) {
			System.out.println("using for loop :"+i);
		}
System.out.println("..................................");
		int i =1;
		while(i<=10){
			System.out.println("Using while loop :" + i);
			i++;
		}
		
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		int j=1;
		do {
			System.out.println("using do while :"+j);
			j++;
		}while(j<=10);
	}

}
