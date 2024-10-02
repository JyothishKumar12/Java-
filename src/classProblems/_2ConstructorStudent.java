package classProblems;

public class _2ConstructorStudent {

	private int id;
	private int rollNo;
	private String name;

	public _2ConstructorStudent(int id,int rollNo,String name) {
		this.id = id;
		this.rollNo = rollNo;
		this.name = name;
	}

	public _2ConstructorStudent() {
		
	}
	
	public String getName() {;
	return name;
	}
	public int getId() {;
	return id;
	}

	public int getRollNo() {;
	return rollNo;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		_2ConstructorStudent s1 = new _2ConstructorStudent(2,12,"sten");
		System.out.println(s1.getId());
		System.out.println(s1.rollNo);
		System.out.println(s1.getName());
		
		_2ConstructorStudent s2 = new _2ConstructorStudent();
		s2.id=1;
		s2.name="vgs";
		s2.rollNo=12;
		System.out.println(s2.getName());
	}

}
