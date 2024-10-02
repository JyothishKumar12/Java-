package Loops;



public class ArmStrongNo {

	public static void main(String[] args) {

		//		int num = 1,sum=0;
		//		int temp =num;
		//		int remainder = 0;
		//		do{
		//			
		//			int quo = temp/10;
		//			remainder = temp%10;
		//			sum =sum+(remainder*remainder*remainder);
		//			temp = quo;
		//		}while(remainder!=0);
		//		System.out.println("sum after loop"+sum);
		//		System.out.println("Number after loop"+num);
		//		if(sum==num) {
		//			System.out.println("Armstrong no");
		//		}else {
		//			System.out.println("Not armstrong");
		//		}
		int remainder,temp;
		int check =0;
		int quo;
		for(int i=1;i<=500;i++) {
			temp=check=i;
			int sum =0;
			do{
				quo=temp/10;
				remainder = temp%10;
				sum=sum+(remainder*remainder*remainder);
		         temp = quo;
			}while(remainder!=0);
			if(sum==check) {
				System.out.println("This is armstring no "+ sum);
			}
		}

		
	}
}
