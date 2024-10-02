package classProblems;

public class Square {

	int l;
	
	public int area() {
		return l*l;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Square l1 = new Square();
		l1.l =10;
		System.out.println(">>>>"+ l1.l);
		int area = l1.area();
		System.out.println(area);
		Square s2 = new Square();
		s2.l=4;
	System.out.println(s2.area());
	
	}

}
