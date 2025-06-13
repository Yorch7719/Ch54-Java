package mx.com.Santander;

public class Atm {

	/*
	 * Atributos de instancia ( non-static fields ).
	 * 	 Variables que pertenecen a cada instancia (u objeto) de una clase. 
	 *   Esto significa que cada objeto creado a partir de la clase tiene 
	 *   su propia copia de estos atributos, por lo que pueden tener valores 
	 *   diferentes en cada instancia.
	 *   
	 *   
	 */
	int serialNumber; 
	double balance;
	String address;
	
	
	/*
	 * Atributos de clase ( static fields ).
	 * Atributos qye pertenecen a la clase. Esto significa que tendrá el 
	 * mismo valor para todos los objetos. 
	 * Estos atributos son útiles para mantener información común en todos
	 * los objetos. También, para propiedas donde no se requiere crear onjetos.
	 */
	static String bankName;
	
	
	/*
	 * Métodos contructores.
	 */
	
	/*
	 * Métodos de instancia (non-static methods)
	 *    <modificarAcceso> <retorno> nombreMétodo( parámetros )
	 *  Son aquellos que pertenecen a una instancia específica de una clase. 
	 *  Estos métodos pueden acceder y modificar los atributos de instancia 
	 *  y son llamados sobre un objeto particular de la clase.  
	 *    
	 */
	
	/**
	 * Retiro de dinero del cajero
	 * @param amout cantidad a retirar
	 * @return la cantidad disponible en el cajero
	 */
	
	double withdray(double ammount) {
		balance = balance - ammount;
		return balance;
	}
	
	/*
	 * Métodos de clase ( static methods)
	 * static <modificarAcceso> <retorno> nombreMétodo( parámetros )
	 *  Método que pertenece a la clase en sí, en lugar de a una instancia 
	 *  específica de la clase. Esto significa que se puede llamar al método 
	 *  sin necesidad de crear un objeto de la clase.
	 *  Un método estático no puede tener acceso a atributos y métodos
	 *  no estáticos.
	 */
	
	static String printBankName() {
		String message = "Bienvenido al banco " + bankName;
		return message;
		
		
		
	}
	
	
	
	
}
