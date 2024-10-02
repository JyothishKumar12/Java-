package arrays;

public class ArrayReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String [] arr = new String[] {"true","false","false","true","false","true"};
		
		int len =arr.length;
		String rev[] = new String[len]; 
		int j=0;
		for(int i=len-1;i>=0;i--) {
			
//			System.out.println(arr[i]);
			rev[j]=arr[i]+",";
			
			j++;
		}
		for(String s: rev) {
			System.out.println(s);
		}
	}

}
