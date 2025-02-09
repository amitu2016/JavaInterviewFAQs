package java_coding_questions;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class IterateHashMap {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		
		map.put("Amit", 32);
		map.put("Sumit", 23);
		map.put("Ram", 44);
		map.put("Shyam", 36);
		map.put("Gita", 25);
		map.put("Sita", 28);
		
		//Iterate Using Enhanced for loop
		for(Map.Entry<String, Integer> entry : map.entrySet()) {
			System.out.println("Name : "+entry.getKey()+", Age : "+entry.getValue());
		}
				
		//Iterate using Iterator and While loop
		Iterator<Map.Entry<String, Integer>> iterator = map.entrySet().iterator();
		
		while(iterator.hasNext()) {
			Map.Entry<String, Integer> entry = iterator.next();
			System.out.println("Name : "+entry.getKey()+", Age : "+entry.getValue());
		}
	}

}
