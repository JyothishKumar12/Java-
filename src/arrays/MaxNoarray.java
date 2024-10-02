package arrays;

public class MaxNoarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] numbers = {4,5,62,3,7,1300};
		int max =numbers[0],index=0;
		
		for(int i=1;i<numbers.length;i++) {
			
			if(max<numbers[i])
			{
				max = numbers[i];
				index =i;
			}
		}

		System.out.println(max +" Index is :"+index);
	}

}
