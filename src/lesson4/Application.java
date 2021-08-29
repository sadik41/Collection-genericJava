package lesson4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;

public class Application {
	public static void main(String[] args) {
		
		HashSet<Employee> hashSet = new HashSet<Employee>();
		hashSet.add(new Employee("Sadik",3500,"Tester"));
		hashSet.add(new Employee("hanif",3000,"It"));
		hashSet.add(new Employee("Balal",4500,"Main"));
		hashSet.add(new Employee("Atik",2000,"Main"));
		
		ArrayList<Employee> newList = new ArrayList<Employee>(hashSet);
		
		Collections.sort(newList);
		
		System.out.println(newList);
		
		
		
		
		
	}
}
