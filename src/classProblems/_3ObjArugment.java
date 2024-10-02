package classProblems;

public class _3ObjArugment {

	private int l;
	private int b;
	private int h;
	
	public _3ObjArugment(int l,int b,int h) {
		this.l =l;
		this.b=b;
		this.h =h;
	}
	
	public void area(_3ObjArugment obj) {
		this.l =obj.l;
		this.b=obj.h;
		this.h =obj.h;
	}
	
	public static void main(String[] args) {
		
		_3ObjArugment a1 = new _3ObjArugment(1,2,3);
		
		System.out.println(a1.l);
	}

}
