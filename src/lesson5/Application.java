package lesson5;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Application {

	public static void main(String[] args) {
		TreeMap<String,String> dictionary =new TreeMap<String,String>();
		dictionary.put("Brave","rady to face");
		dictionary.put("Joy","rady to face hgf ");
		dictionary.put("Brilliant","rady to face  ujh jd");
		dictionary.put("Confidence","rady to face yyd jhj hkhf ");
		
//		for(String w : dictionary.values()) {
//			System.out.println(dictionary.get(w));
//		}
		
		for (Map.Entry<String, String> entry: dictionary.entrySet()) {
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
		}
	} 
}
