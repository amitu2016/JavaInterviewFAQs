package java_coding_questions;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class CountNumberOfWordsInString {
	
	public static Map<String, Integer> wordCount(String str){
		int n = str.length();
		
		Map<String, Integer> wordMap = new HashMap<>();
		
		String[] words = str.split("\\s+");
		
		for(String word : words) {
			wordMap.put(word, wordMap.getOrDefault(word, 0) + 1);
		}
		
		return wordMap;
	}

	public static void main(String[] args) { 
		
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		
		Map<String, Integer> map = wordCount(input);
		
		Iterator<Map.Entry<String, Integer>> iterator = map.entrySet().iterator();
		
		while(iterator.hasNext()) {
			Map.Entry<String, Integer> entry = iterator.next();
			System.out.println("Word: "+entry.getKey()+", Count: "+entry.getValue());
		}
		
		sc.close();
	}
	/*
	 * Explanation: This solution splits the input string into words using a space delimiter, then
	uses a HashMap to count the occurrences of each word. The getOrDefault method is used to
	simplify the counting logic.
	 */

}
