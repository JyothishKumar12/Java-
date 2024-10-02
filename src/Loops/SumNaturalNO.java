package Loops;

public class SumNaturalNO {

	public static void main(String[] args) {
		//Write a program to calculate the sum of first 10 natural number.
		
		int sum =0;
		
		for(int i=1;i<=10;i++) {
			sum = sum+i;
		}
		System.out.println("For Loop : " +sum);
		
		System.out.println("--------------------------------------------");
		
		
		int i=1,SUM=0;
		
		while(i<=10) {
			SUM = SUM+i;
			i++;
		}
		System.out.println("While Loop : "+ SUM);
		System.out.println("//////////////////////////////////////////////");
		
		int j=1;
		int Sum =0;
		do{
			Sum =Sum+j;
			j++;
		}while(j<=10);
		
		System.out.println("Do while : "+ Sum);
		
		
		
		
		
		
		
		
	}

}
