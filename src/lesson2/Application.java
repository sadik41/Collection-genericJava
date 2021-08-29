package lesson2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Application {

	public static void main(String[] args) {
		List<String> animals = new ArrayList<String>();
		animals.add("Lion");
		animals.add("Cat");
		animals.add("Dog");
		animals.add("Bird");
		
//		for (int i = 0; i < animals.size();i++) {
//			System.out.println(animals.get(i));
//		}
//		
//		for(String v : animals) {
//			System.out.println(v);
//		}
		
		List<Vehicle> vehicles = new LinkedList<Vehicle>();
		Vehicle vehicle2 = new Vehicle("Toyata","Camy",1400,false);
		
		vehicles.add(new Vehicle("Honda","acc",10000,false));
		vehicles.add(vehicle2);
		vehicles.add(new Vehicle("Wrea","yy",3200,true));
		
//		for (Vehicle v : vehicles) {
//			System.out.println(v);
//			
//		}
		printElements(vehicles);
		printElements(animals);
	}
	
	public static void printElements(List someList) {
		for(int i =0;i < someList.size();i++) {
			System.out.println(someList.get(i));
		}
	}

}
