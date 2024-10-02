package arrays;

public class MinlengthWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String [] drinks = {"coffe","water","chai","diet cocke"};
		int minimum=0,index=0;
		int temp;
		String word="null";
		
				minimum =drinks[0].length();
		for(int i =1;i<drinks.length;i++) {
			
			if(drinks[i].length()<minimum) {
				minimum  = drinks[i].length();
				word = drinks[i];
				index =i;
			}
		}
		System.out.println(word);
		System.out.println(minimum +"index is "+index);
		
		
		
		
		
		
		
	}

}
