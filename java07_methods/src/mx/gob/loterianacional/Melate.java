package mx.gob.loterianacional;

<<<<<<< HEAD
import java.util.*;
import java.text.SimpleDateFormat;

public class Melate {

	/*
	 * Genera un número aleatorio entre 1 y 54 (inclusive).
	 * @return número entero.
	 */
	
	int numeroAleatorio (int min, int max) {
		Random random = new Random ();
		return random.nextInt(min, max +1);
	}
	
	
	int randomNumber(int min, int max) {
		// Generar un número aleatorio entre 0.0 y 1.0 (sin incluir)
		double randomValue = Math.random();
		// Escalar el número aleatorio al rango deseado
		double scaledRandomValue = randomValue * (max - min +1);
		// Convertir el número escalado en un entero redondeado hacia arriba
		int finalNumber = (int) Math.ceil(scaledRandomValue);
		return finalNumber;
	}
	
	/**
	 * Muestra en consola 7 número aleatorios del 1 al 54. 
	 * Los números pueden ser repetidos
	 */
	
	void printListOfRandomNumbers (int number, int min, int max) {
		int [] num =  new int [number];
		for (int i = 0; i < number; i++) {
			num[i] = numeroAleatorio(min, max);
		}
		System.out.println("Tu lista de números es :" + Arrays.toString(num));
	}
	
	
	
	
	
	
	public int generarNumeroAleatorio() {
        return (int)(Math.random() * 54) + 1;
    }
	
	/**
	 * Muestra en consola 7 número aleatorios del 1 al 54. 
	 * Los números pueden ser repetidos
	 */
	
	public void mostrarNumerosRepetidos() {
        System.out.println("Números (pueden repetirse):");
        for (int i = 0; i < 7; i++) {
            System.out.print(generarNumeroAleatorio() + " ");
        }
        System.out.println();
	}// salto de línea
        
	
	/** Muestra en consola 7 números aleatorios del 1 al 54
	 * Los números no pueden repetirse
	 *  Estos números deben de estar ordenados de menor a mayor.
	 *  Para cada número agrega la fecha y la hora en el siguiente formato
	 *  (dd-MMM-yyyy HH:mm:ss)
	 */
	
        /**public void mostrarNumerosSinRepetirOrdenadosConFecha() {
            System.out.println("Números únicos, ordenados con fecha y hora:");

            Set<Integer> numeros = new HashSet<>();
            while (numeros.size() < 7) {
                numeros.add(generarNumeroAleatorio());
            }

            List<Integer> listaOrdenada = new ArrayList<>(numeros);
            Collections.sort(listaOrdenada);

            SimpleDateFormat formato = new SimpleDateFormat("dd-MMM-yyyy HH:mm:ss");
            String fechaActual = formato.format(new Date());

            for (int numero : listaOrdenada) {
                System.out.println(numero + " - " + fechaActual);
            }
        }*/
    
	
	void printRandomNumbersList(int count, int min, int max) {
	    for (int i = 0; i < count; i++) {
	        int random = (int)(Math.random() * (max - min + 1)) + min;
	        System.out.println(random);
	    }
	}
	
        /**
    	 * Sobrecarga 
    	 * El polimorfismo en tiempo de compilación en Java 
    	 * se conoce como sobrecarga de métodos (Method Overloading). 
    	 * Ocurre cuando múltiples métodos en una misma clase 
    	 * tienen el mismo nombre pero diferentes firmas 
    	 * (diferente número o tipo de parámetros).
    	 */
        
        boolean printRandomNumbersList(String numero, String minimo, String maximo) {
    		int number = Integer.parseInt(numero);
    		int min = Integer.parseInt(minimo);
    		int max = Integer.parseInt(maximo);
    		printRandomNumbersList(number, min, max);
    		return true;
    	}
        
    	/**
    	 * Sobrecarga de método que imprime en consola 7 números aleatorios del
    	 * 1 al 100.
    	 * @return Lista de 7 números aleatorios entre 1 y 100 (pueden repetirse)
    	 */
        
        public List<Integer> printRandomNumbersList() {
        	List<Integer> randomNumbers = new ArrayList<>();
            int min = 1;
            int max = 100;

            for (int i = 0; i < 7; i++) {
                int random = (int)(Math.random() * (max - min + 1)) + min;
                randomNumbers.add(random);
            }

            return randomNumbers;
    	   
        	
        	
        }
        
        
        
    }
	

=======
import java.util.Arrays;
import java.util.Random;

public class Melate {
	
	/**
	 * Genera un número aleatorio entre 1 y 54 (inclusive).
	 * @return número entero.
	 */
	int numeroAleatorio(int min, int max) {
		Random random = new Random();
		return random.nextInt(min, max + 1);
	}
	
	int randomNumber(int min, int max) {
	    // Generar un número aleatorio entre 0.0 y 1.0(sin incluir)
	    double randomValue = Math.random();
	    // Escalar el número aleatorio al rango deseado
	    double scaledRandomValue = randomValue * (max - min + 1);
	    // Convertir el número escalado en un entero redondeado hacia arriba
	    int finalNumber = (int) Math.ceil(scaledRandomValue);
	    return finalNumber;
	}
	
	
	
	/**
	 * Muestra en consola 7 números aleatorios del 1 al 54.
	 * Refactorizar el método para que genere 7 números aleatorios
	 * sin repetir.
	 */
	void printRandomNumbersList (int number, int min, int max) {
		int[] num = new int [number];
		for (int i = 0; i < number ; i++) {
			num[i] = numeroAleatorio(min, max);
		}
		System.out.println("tu lista de numeros es :"+ Arrays.toString(num));
	}
	
	/**
	 * Sobrecarga 
	 * El polimorfismo en tiempo de compilación en Java 
	 * se conoce como sobrecarga de métodos (Method Overloading). 
	 * Ocurre cuando múltiples métodos en una misma clase 
	 * tienen el mismo nombre pero diferentes firmas 
	 * (diferente número o tipo de parámetros).
	 */
	boolean printRandomNumbersList(String numero, String minimo, String maximo){
		int number = Integer.parseInt(numero);
		int min = Integer.parseInt(minimo);
		int max = Integer.parseInt(maximo);
		printRandomNumbersList(number, min, max);
		return true;
	}
	
	/**
	 * Sobrecarga de método que imprime en consola 7 números aleatorios del
	 * 1 al 100.
	 */
	void printRandomNumbersList() {
	    printRandomNumbersList(7, 1, 100);
	}

}
>>>>>>> upstream/main
