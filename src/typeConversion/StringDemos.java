package typeConversion;

public class StringDemos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String s1 ="hello";
		String s2 ="heLo";
		
		System.out.println(s1.equals(s2));
		System.out.println(s1.equalsIgnoreCase(s2));
		
		char[] a = s2.toCharArray();
			System.out.println(a);

	}

}
