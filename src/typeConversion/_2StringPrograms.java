package typeConversion;

public class _2StringPrograms {

	public static void main(String[] args) {
//		length of string
//		String s1 ="java is super";
//		System.out.println(s1.length());
//		
//		
////		No of words
//		
//		String[] s= s1.split(" ");
//		int a =s.length;
//		System.out.println(a);
//		System.out.println(s[2]);
		
//		Occurance of a character
		
//		String wd = "Hello world";
//		System.out.println(wd.contains("h"));
//		System.out.println(wd.charAt(0));
////	
//		int len = wd.length();
//		int count =0; 
//		for(int i=0;i<len;i++) {
//			char a = wd.charAt(i);
//			System.out.println(a +"-" + i );
//			if((a == 'l' )){
//				count++;
//				
//			}
//			
//		}
//		System.out.println("count is :"+count);
		
		
//	String reverse	
		
//String wrd ="java is super";	
//String rev ="";
//System.out.println(rev);
//int length = wrd.length();
//System.out.println(length);
//
//for(int i=length-1;i>=0;i--) {
//	rev= rev+wrd.charAt(i);
////	System.out.println("rev is "+rev);
//}
//System.out.println("output is :"+rev);

		
		
//		Remove white space
		
//		String word ="   Hello world  ";
//		String nwwrd = word.trim();
//		System.out.println(nwwrd);
		
//		Reverse Eachword
		
//		String w ="java is super";
//		String ar[]= w.split(" ");
//		String realrev="";
//		int arrayLength = ar.length;
//		
//		for(int i =0; i<arrayLength;i++) {
//			System.out.println(ar[i]);
//			String rev = ar[i];
//			int len = rev.length();
//			System.out.println(len);
//			for(int j =len-1;j>=0;j--) {
//				realrev = realrev+rev.charAt(j);
//			}
//			realrev=realrev+" ";
//		}
//		
//		System.out.println(realrev);
		
//UpperCase to lower
		
		String st ="This is the test string";
	String sts[]=st.split(" ");
	
	int len = sts.length;
	int i=0;
	String t="";
	while(i<len) {
		t=sts[i];
//		System.out.println("value is :"+ t);
		int length = t.length();
		if(length%2==0) {
			System.out.println(t.toUpperCase());
		}else {
			System.out.println(t.toLowerCase());
		}
		i++;
	}
		
		
		
		}
	}
	

