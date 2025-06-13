package org.generation;

import com.zoo.Animal;
import com.zoo.Cat;

public class AnimalTest {

	public static void main(String[] args) {
		
		Animal myPet = new Cat("Shuri", 4, true);
		
		System.out.println(myPet);
		System.out.println(myPet.noise());
		
	}

}
