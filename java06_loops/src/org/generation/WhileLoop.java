package org.generation;

import java.util.Scanner;

public class WhileLoop {

	public static void main(String[] args) {
		/**
<<<<<<< HEAD
         * Bucle While
         * Mientras la condición sea verdadera, se realiza un nuevo ciclo.
         * 
         * Sintaxis:
         *     
         *     while( condicion ) instruccion;
         *     
         *     while( condicion ) {
         *        instrucciones;
         *     }
         * 
         * Es útil cuando no sabes cuántas iteraciones se necesitarán.
         * 
         */
		
		/* 
		 * Mostrar en la consola un mensaje de bienvenida
		 * 
		 * Posteriormente preguntar al usuario si desea seguir activo,
		 * si la respuesta es "Y" volver a mostrar el mensaje de 
		 * bienvenida, en caso contrario despedirse  y terminar el programa
		 */
		
		Scanner sc = new Scanner(System.in);
        String respuesta;
		
		do {
			System.out.println("Welccome to TRON! ");
			
			System.out.println("Do want to keep active? Y / N");
			respuesta = sc.nextLine().trim().toLowerCase();
			
		} while 
			(respuesta.equalsIgnoreCase("Y") ||
			(respuesta.equalsIgnoreCase("y")) ||
			(respuesta.equalsIgnoreCase("Yes")) ||
			(respuesta.equalsIgnoreCase("yes")) ||
			(respuesta.equalsIgnoreCase("si")) ||
			(respuesta.equalsIgnoreCase("sí")) ||
			(respuesta.equalsIgnoreCase("Sí")));
			
		
		System.out.println("Program terminated. Long Live CLU");
		
		sc.close();
=======
		 * Bucle While
		 * Mientras la condición sea verdadera, se realiza un nuevo ciclo.
		 * 
		 * Sintaxis:
		 *     
		 *     while( condicion ) instruccion;
		 *     
		 *     while( condicion ) {
		 *        instrucciones;
		 *     }
		 * 
		 * Es útil cuando no sabes cuántas iteraciones se necesitarán.
		 * 
		 */
		
		/*
		* Mostrar en la consola un mensaje de bienvenida
		* 
		* Posteriormente preguntar al usuario si desea
		* seguir activo, si la respuesta es "y"("s") volver a mostrar
		* el mensaje de bienvenida, en caso contrario despedirse
		* y terminar el programa
		*/
		Scanner sc = new Scanner(System.in);
        boolean continuar = true;
        
        while (continuar) {
            System.out.println("¡Bienvenido al sistema de lloración!"); 
            
            System.out.print("¿Deseas seguir llorando? (s/n): ");
            char respuesta = sc.nextLine().toLowerCase().charAt(0);
            
            if (respuesta != 's') { // Si la respuesta es "n", termina el programa
                System.out.println("Adios, se feliz :) ");
                continuar = false;
            }
        }
        sc.close();
>>>>>>> upstream/main

	}

}
