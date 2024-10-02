package _7Static;


public class StaticEXample {

	int a;
	static int b;
	
	static {
		System.out.println("Hello");
		
	}
	public static void main(String[] args) {
		
		StaticEXample ex = new StaticEXample();
		ex.a=10;
		System.out.println(ex.a);
		StaticEXample ex1 = new StaticEXample();
		ex1.a=12;
		System.out.println(ex1.a);
		
		StaticEXample.b=34;
		System.out.println(ex.b);
		System.out.println(ex1.b);
		
		
		
		
	}
	
}
