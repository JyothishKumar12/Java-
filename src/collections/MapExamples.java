package collections;

import java.util.Collection;
import java.util.Hashtable;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<Integer,String> m = new Hashtable<>();
		m.put(686508,"kappadu");
		m.put(686506,"Kanjirappally");
		m.put(686504,"Chirakkadavu");
		m.put(686502,"Thidanadu");
		
		System.out.println(m);
//		Get key values
		Set<Integer>keys =m.keySet();
		System.out.println(keys);
//	get values 
	Collection <String >c =	m.values();
	System.out.println(c);
	
//	 Getting values based on keys
	
	System.out.println(m.get(686508));
	
	System.out.println(m.containsKey(686506));
	System.out.println(m.containsValue("Kappadu"));
	
	
	System.out.println("---------------");
//	Update
	m.put(686502,"kalaketty");
	m.putIfAbsent(656669,"Anakkall");
	System.out.println(m.size());
	
	Set<Entry<Integer, String>> entries =m.entrySet();
	
	System.out.println(entries);
	for (Entry<Integer, String> entry : entries) {
		
		int key = entry.getKey();
	String value =entry.getValue();
	System.out.println(key + ":" + value);
	}

	}

}
