package classProblems;

abstract class Area{
	public abstract void area();
	public void display() {
		System.out.println("welcome");
	}
}

class Squares extends Area{

	int l;
	@Override
	public void area() {
		// TODO Auto-generated method stub
		System.out.println(l*l);
	}
	
}


public class _7AbstractClass {
public static void main(String[] args) {

	Area s1 = new Squares();
//	s1.l=12;
//	s1.area();
	s1.display();
}
}
