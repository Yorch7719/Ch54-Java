package org.generation;

public class UnaryOperator {

	public static void main(String[] args) {
		/*
		 Los operadores unarios requieren un solo operando.
		  
		  +		Unary plus operator; indicates positive value (numbers are positive without this, however)
		  -		Unary minus operator; negates an expression
		  ++	Increment operator; increments a value by 1
		  --	Decrement operator; decrements a value by 1
		  !		Logical complement operator; inverts the value of a boolean
		 
		 */

		int valueA = -10; // El valor es negativo
		int valueB = +20; // Por default los valores son positivos
		
		int valorInicial = 10;
		System.out.println("Preincremento: " + ++valorInicial); // 11
		System.out.println("Preincremento: " + valorInicial++); // 11
		System.out.println("Preincremento: " + valorInicial); // 12
		
		int valorInicial2 = 50;
		System.out.println("Preincremento: " + --valorInicial2); // 49
		System.out.println("Preincremento: " + valorInicial2--); // 49
		System.out.println("Valor Final: " + valorInicial2); // 48
		
		
	}

}
