package collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _11Position {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		List<Integer> li = new ArrayList<>();
	
		li.add(1);
		li.add(8);
		li.add(0);
		li.add(5);
		li.add(1);
		li.add(6);
		System.out.println(li.indexOf(0));
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a no");
		int number=sc.nextInt();
		
		for(int i=0;i<li.size();i++) {
			
			if(number==li.get(i)) {
			System.out.println(i);
			
			}
		}
	}

}
