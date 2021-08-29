package lesson3;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class Application {

	public static void main(String[] args) {
		
		HashSet<Animal> animals = new HashSet<Animal>();
		
		Animal animal1 = new Animal("DOg",12);
		Animal animal2 = new Animal("Cat",3);
		Animal animal3 = new Animal("Bird",1);
		Animal animal4 = new Animal("DOg",12);
		
		animals.add(animal1);
		animals.add(animal2);
		animals.add(animal3);
		animals.add(animal4);
//		System.out.println(animal1.equals(animal4));
//		
//		System.out.println(animal1.hashCode());
//		System.out.println(animal4.hashCode());
		
		for (Animal v : animals) {
			System.out.println(v);
		}

	}

}
