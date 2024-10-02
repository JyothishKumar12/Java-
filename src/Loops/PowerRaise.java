package Loops;

import java.util.Scanner;

public class PowerRaise {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	     System.out.println("Enter base no");
	     int base = sc.nextInt();
	     System.out.println("Enter power");
	     int power = sc.nextInt();
	     int ans =1;
     if(power == 0) {
	    	 System.out.println("Answer is :" +1);
	     }
	     else if(power==1) {
	    	 System.out.println("Answer is :" + 2);
	     }
	     else {
   
	     for(int i =1;i<=power;i++) {
	    	 ans = ans*base;
	     }
System.out.println(ans);
}
}
}
