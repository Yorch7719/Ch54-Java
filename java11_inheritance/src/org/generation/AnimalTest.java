package org.generation;

import com.zoo.Animal;
import com.zoo.Cat;
<<<<<<< HEAD
=======
import com.zoo.Leopardo;
>>>>>>> upstream/main

public class AnimalTest {

	public static void main(String[] args) {
		
<<<<<<< HEAD
		Animal myPet = new Cat("Shuri", 4, true);
		
		System.out.println(myPet);
		System.out.println(myPet.noise());
		
=======
		// new Animal(); No se puede intanciar por ser una clase abstracta
		// new Feline(); No se puede intanciar por ser una clase abstracta
		Animal myPet  = new Cat("Judi", 0.2, true );
		myPet = new Leopardo ("Raul", "Male", true, 5);
		
		System.out.println( myPet ); // Cat, Catus, 0.2, Judi, true
		System.out.println( myPet.noise() ); // Rauul
		
		if( myPet instanceof Cat ) {
			Cat myCat = (Cat)myPet;
			System.out.println("Es doméstico : " +  myCat.isDomestic());
		} else if( myPet instanceof Leopardo) {
			Leopardo myLeopard = (Leopardo)myPet;
			System.out.println("Es salvaje: " + myLeopard.isWild() );
		}
		else {
			System.out.println("Este animal no conoce ese atributo");
		}
			

>>>>>>> upstream/main
	}

}
