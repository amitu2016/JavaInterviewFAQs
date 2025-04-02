package java_coding_questions;

import java.util.HashMap;
import java.util.Map;

public class FindDuplicateCharacters {
	
	public static void findDuplicateCharacters(String str){
		
		char[] charArray = str.toCharArray();
		
		Map<Character, Integer> map = new HashMap<>();
		
		for(int i = 0; i < charArray.length; i++) {
			map.put(charArray[i], map.getOrDefault(charArray[i], 0) + 1);
		}
		
		for(Map.Entry<Character, Integer> entry : map.entrySet()) {
			if(entry.getKey()!= ' ' && entry.getValue() > 1) {
				System.out.println(entry.getKey() +" -> "+entry.getValue()+" times");
			}
		}
		
	}
	
	public static void main(String[] args) {
		String str = "my name is amit kumar upadhyay";
		findDuplicateCharacters(str);
	}

}
