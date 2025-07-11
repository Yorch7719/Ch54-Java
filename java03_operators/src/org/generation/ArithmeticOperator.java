package org.generation;

import java.util.ArrayList;

public class ArithmeticOperator {
	
	int counter = 1;
	static String cohorte;
	
	public static void main(String[] args) {

        /* Arithmetic Operators
        
        +   Additive operator (also used for String concatenation)
        -   Subtraction operator
        *   Multiplication operator
        /   Division operator
        %   Remainder operator
     
     Cuando se realizan operaciones entre tipo de datos diferentes
     el resultado es promovido al de mayor jerarquía para evitar
     pérdida de precisión.
     
     Ejemplo:   int * long = long
     
     *  1.- byte (8 bits)
     *  2.- short (16 bits)
     *  3.- int (32 bits)
     *  4.- long (64 bits)
     *  5.- float (32 bits)
     *  6.- double (64 bits)
     
     */

		double value = 5.2;
		int operatorA = (int)value;
		int operatorB = 6;
		int sum = operatorA + operatorB;
		System.out.println("Sumatoria: " + sum); // Sumatoria: 11 
		
		int difference = operatorA - operatorB;
		System.out.println("Resta: " + difference);
		
		double product = operatorA * 1.2; // 6.0
		int product2 = operatorA * (int)1.2; // 5
		int product3 = (int)(operatorA * 1.2); // 6
		var product4 = operatorA * 1.2; // 6.0 
		
		System.out.println("Multiplicación de product: " + product);
		System.out.println("Multiplicación de product2: " + product2);
		System.out.println("Multiplicación de product3: " + product3);
		System.out.println("Multiplicación de product4: " + product4);
		
		/*
		 * Java tiene varios tipos de datos numéricos para 
		 * optimizar el uso de memoria y mejorar el rendimiento, 
		 * ofreciendo flexibilidad para elegir el tipo adecuado 
		 * según el contexto y las necesidades del programa.
		 * 
		 * En ciclos o en bloques de código donde se realizan 
		 * muchas operaciones repetitivas, como iteraciones, 
		 * es recomendable usar tipos como int para evitar 
		 * conversiones innecesarias entre tipos y así 
		 * mejorar el rendimiento.
		 * 
		 */
		
		int interes = 1;
		int resultado;
		for (int i = 0; i < 10; i++);
			resultado = 5 * interes;
		
			/*
			 * Palabra reservada "var"
			 * Se introdujo en la version de Java 10.
			 * 
			 * Se utiliza para inferencia de tipo de variable locales. 
			 * 
			 * Uso principal: simplifica la declaración de variables locales, especialmente cuando 
			 * 				 el tipo de dato es largo.
			 * 
			 * Consideraciones:
			 * 	- Solo para variables locales
			 * 	- La variable debe ser inicializada en la misma declaración.
			 */
			
			// int itemCount = 10;
			var itemCount = 20;
			var firstChar = "L";
			System.out.println(itemCount); // dato de tipo int
			System.out.println(firstChar); // String
			
			
			
			
			
			
			

	}
	public void printMyString() {
		// var userList = new ArrayList<String>();
		ArrayList<String> userList = new ArrayList<>();
	}

}
