package org.generation;

import java.util.HashMap;
import java.util.TreeMap;
import java.util.TreeMap;


public class HashMapConceptos {

	public static void main(String[] args) {
		/*
		 * Una colección Map, es una relación clave(key): valor (value) que forma una
		 * tabla de datos.
		 * 
		 * - Nos funciona mejor para encontrar elementos
		 * 
		 * Sintaxis: HashMap< key, value > varName = new HashMap<>();
		 */

		// Instanciar la clase HashMap
		HashMap<Integer, String> legos = new HashMap<>();

		// Agregar valores a la coleccion, put()

		legos.put(10360, "Shuttle Carrier Aircraft");
		// Agregar 3 elementos
		legos.put(75384, "Destructor Estelar Imperial");
		legos.put(75407, "Logotipo de Star Wars™ para Construir");
		legos.put(75379, "R2-D2™");
		legos.put(75375, "Halcón Milenario");
		legos.put(11203, "La casa Familiar de Bluey");
		legos.put(75331, "The Razor Crest");
		System.out.println(legos);

		// Reemplazar un elemento
		legos.put(75375, "Star Wars - Halcón Milenario");
		System.out.println(legos);

		// Obtener un elemento, get (key)
		System.out.println("Me gusta: " + legos.get(11203));

		// Eliminar un elemento, remove (key);
		System.out.println("Se elimina: " + legos.remove(75379));

		// iterar la coleccion usando las keys
		for (int model : legos.keySet()) {
			System.out.println("Lego model: " + model + " - " + legos.get(model));
		}

		// Iterar la colección con sus valores
		for (String legoName : legos.values()) {
			System.out.println("Nombre del lego: " + legoName);
		}

		// Ordenar los key, usando la clase treemap
		TreeMap<Integer, String> sortedLegos = new TreeMap<>(legos);
		for (int model : sortedLegos.keySet()) {
			System.out.println("Lego model: " + model + " - " + sortedLegos.get(model));
		}

		/*
		 * Aplicaciones del HasMap:
		 *  - Directorios Telefónicos
		 *  - Contador de votos de una encuesta
		 *  		key 		- value
		 *  		OpcionA - 1
		 *  		OpcionB - 12
		 *  		OpcionC - 1
		 *  - Lista de productos
		 *  		key 		- value
		 *  		SKU 		- Objeto del medicamento
		 *  - Calificaciones de Estudiantes
		 *  		key 		- value
		 *  Calificacion - Estudiantes
		 *  		100 		- {José, Ana, María}
		 *  		90		- {Sergio, Manuel}
		 *  		80 		- {Tatiana, Diana}
		 *  		70		- {Samuel}
		 * HashMap< Integer, List<String> > calificaciones;
		 *  
		 */
		
		
		
		
		
		
		
		
	}

}
