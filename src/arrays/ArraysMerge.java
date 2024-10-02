package arrays;

public class ArraysMerge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub'
		String [] drinks = {"chai","coffe"};
		
		String []coolDrinks = {"milk","water","coke"};
		
		int c = drinks.length+coolDrinks.length;
		
		String [] drinkLIST = new String[c];
		int i =0;
		for(String s :drinks) {
	
			drinkLIST[i]=s;
			i++;
		}
		
		for(String cD :coolDrinks) {
			
			drinkLIST[i]=cD;
			i++;
		}
//
		
		for(String dLIst: drinkLIST) {
			System.out.println(dLIst);
		}
	}

}
