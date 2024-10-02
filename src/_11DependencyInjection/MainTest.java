package _11DependencyInjection;

public class MainTest {

	private static Food food;
	
	public MainTest(Food food){
		this.food = food;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MainTest T1 = new MainTest(new Burger());
			food.preaparing();	
				
	}

}
