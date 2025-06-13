package org.generation;

public class SwitchConditional {

	public static void main(String[] args) {
<<<<<<< HEAD
		/*
		 *  * La sentencia switch en Java es una estructura de 
=======
	    /*
	     * La sentencia switch en Java es una estructura de 
>>>>>>> upstream/main
	     * control que permite ejecutar diferentes bloques 
	     * de código basándose en el valor de una variable 
	     * o expresión. Es una alternativa más limpia a una 
	     * serie de sentencias if-else if.
	     * 
	     * Puedes usar switch con los siguientes tipos de datos:
	     * Primitivos: int, byte, short, char.
	     * Clases Wrapper: Integer, Byte, Short, Character.
	     * String (desde Java 7).
	     * enum (tipos enumerados).
	     * 
<<<<<<< HEAD
	     * Switch usa el métod equals para comparar los Strings.
=======
	     * Switch usa el método equals para comparar los Strings.
>>>>>>> upstream/main
	     * 
	     * Sintaxis:
	     *   switch( evaluación){
	     *     case 1:
	     *           sentencias;
	     *           break;
	     *     case 2:
	     *           sentencias;
	     *           break;
	     *     default:
	     *           sentencias;      
	     *   }
<<<<<<< HEAD
		 */
=======
	     */
>>>>>>> upstream/main
		
		String userRole = "ADMIN";
		
		switch( userRole ) {
<<<<<<< HEAD
		case "ADMIN":
			System.out.println("Acceso al panel de administrador");
			break;
			/*
			 * Olvidar el brak causará una ejecucion continua con el siguiente case,
			 * hasta encontrar un break o hasta que termine el switch.
			 */
		case "EDITOR":
			System.out.println("Acceso a la edición de contenido");
			break;
		//case "VIEWER", "CUSTOMER":
		case "VIEWER":
		case "CUSTOMER":
			System.out.println("Acceso a la vista pública");
		default:
			System.out.println("Rol desconocido, acceso denegado");
		}

		
		
		
		
		
		
		
=======
		 case "ADMIN":
			 	System.out.println("Acceso al panel de administrador");
			 	break;
			 	/*
			 	 * Olvidar el break causará una ejecución continua 
			 	 * con el siguiente case, hasta encontrar un break o
			 	 * hasta que termine el switch		
			 	 */
		 case "EDITOR":
			 	System.out.println("Acceso a la edición de contenido");
			 	break;
		 // case "VIEWER", "CUSTOMER":
		 case "VIEWER": 
		 case "CUSTOMER":
			 	System.out.println("Acceso a la vista pública");
			 	break;			 
	     default:
	    	   System.out.println("Rol desconocido, acceso denegado");
		}
>>>>>>> upstream/main
		
	}

}
