package _12DataStructure;

public class _3LinearSearch {

	public static int searchElement(int []ar,int value){

		for(int i=0;i<ar.length;i++) {
			if(ar[i]==value) {
				return 1;
			}

		}
		return -1;
	}

	
	public static int getIndex(int ar[],int value) {
		
		for(int i=0;i<ar.length;i++) {
			if(ar[i]==value) {
				return i;
			}
		}
		return -1;
	}
	
	
	
	
	public static boolean contains(int ar[],int value) {
		
		for(int i=0;i<ar.length;i++) {
			if(ar[i]==value) {
				return true;
			}

		}
		return false;
	}
	
	public static int searchElement(String text,char value) {
		
		for(int i=0;i<text.length();i++) {
			if(text.charAt(i)==value) {
				return 1;
			}
		}
		return -1;
	}
	
	
	public static int searchElement(int ar [][],int value) {
		
		for(int i=0;i<ar.length;i++) {
			for(int j=0;j<ar[i].length;j++) {
				if(ar[i][j]==value)
					return 1;
			}
		}
		return -1;
	}
	
	
	public static int[] getIndex(int ar [][],int value) {
		
		for(int i=0;i<ar.length;i++) {
			for(int j=0;j<ar[i].length;j++) {
				if(ar[i][j]==value)
					return new int[] {i,j};
			}
		}
		return new int[] {-1,-1};
	}
}
