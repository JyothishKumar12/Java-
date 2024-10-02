package collections;

import java.util.ArrayList;

import org.bouncycastle.oer.its.IValue;

public class _2ArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> ar = new ArrayList<>();
		ar.add("baby");
		ar.add("ball");
		ar.add("soap");
		ar.add("baby");
		ar.add("shampoo");
		ar.add("chalk");
		ar.add("soap");
		ar.add("makeup");
		ar.add("baby");
		ar.add("lotion");
		
		System.out.println(ar);
		
		System.out.println("--------------------------");
//		int length = ar.size();
		ArrayList<Integer> ivalue = new ArrayList<>();
		String duplicate ="";
		for(int i =0;i<ar.size();i++)
		{
			for(int j=1;j<ar.size();j++) {
				
				if(ar.get(i).equals(ar.get(j))&& i!=j){
					duplicate=ar.get(i);
					ivalue.add(j);
									}	
			}ivalue.add(i);
			if(duplicate!="")
			{
			System.out.println(duplicate);
			System.out.println(ivalue.size());
			}
			for(int k =0;k<ivalue.size();k++) {
				if(ar.contains(duplicate)) {
				ar.remove(duplicate);
			}
			}

			ivalue.clear();
			duplicate="";
		
		}
	}

	}

	
