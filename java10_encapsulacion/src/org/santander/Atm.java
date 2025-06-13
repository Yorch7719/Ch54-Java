package org.santander;

/**
 *  Los pilares de OOP: encapsulación, herencia, polimorfismo, abstracción.
 *  
 *  Encapsulación: Principio de consiste en ocultar los detalles de como 
 *  funciona un objeto. Un aspecto importante de la encapsulación es el
 *  concepto de acceso controlado. Se puede establecer diferentes
 *  niveles de acceso para los atributos y métodos de un objeto.
 *  
 *  La encapsulación ofrece beneficios como:
 *  - Seguridad de datos: Ocultar los detalles internos o que los datos
 *      sean modificados de manera incorrecta o no autorizada.
 *  - Modularidad: Se facilita la creacíón de componentes independientes
 *      que pueden ser reutilizados.
 *  - Abstracción: Permite que los usuarios de un objeto se centren en
 *      lo que hace el objeto en lugar de cómo lo hace.
 *      
 Niveles de acceso para la encapsulación:
 *  1.- Public: Son accesibles desde cualquier parte del código.
 *  2.- Protected: Son accesibles desde la misma clase, paquete y clases derivadas.
 *  3.- Default: Son accesibles dentro de la misma clase y del mismo paquete.
 *  4.- Private: Son accesibles dentro de la misma clase.
 * 
 */

public class Atm {

	private int serialNumber;
	private double balance;
	private String model;
	private String address;
	
	/*
	 * Para acceder a los atributos encapsulados, usamos los métodos Setter y Getters
	 * 
	 * Esto protege los datos de manipulación incorrecta y controla como 
	 * interactúa con el resto de código. 
	 * 
	 * <Modificador de Acceso> <retorno> set/getNombreDelAtributo( parámetros)
	 * 
	 */
	
	public void setSerialNumber(int newSerialNumber) {
		if (newSerialNumber != 0) {
			serialNumber = newSerialNumber;			
		}
	}
	public int getSerialNumber() {
		return serialNumber;
	}
	//==================================================================
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public double getBalance() {
		return this.balance;
	}
	
	// Realizar los sdetter y getters para model y address
	
	//==================================================================	
	public void setModel(String model) {
		this.model = model;
	}
	public String getModel() {
		return this.model;
	}
	//==================================================================
	public void setAddress(String address) {
		this.address = address;
	}
	public String getAddress() {
		return this.address;
	}
	//==================================================================
	
	public String toString() {
		return "Serial Number: " + this.serialNumber + 
				" Balance: " + this.balance + 
				" Model: " + this.model + 
				" Address: " + this.address;
		
		
	}
	
	 /* Métodos constructores
     *  Un constructor es un tipo especial de método que se llama automáticamente
     *  cuando se crea una instancia(objeto) de una clase. Su propósito principal
     *  es inicializar el estado de un objeto recién creado.
     *  
     *  Reglas:
     *  - El nombre del constructor debe ser el mismo que el de la clase.
     *  - Un constructor no tiene retorno.
     *  - Un constructor puede llamar a otro constructor de la misma clase usando
     *      la palabra this(). Esta llamada debe ser la primera instrucción del constructor.
     *  - Es posible tener una sobrecar de constructores.
     *  - Constructor por default: Si no se proporciona un constructor en la clase, Java
     *      proporciona un constructor por defecto sin parámetros.
     *      
     *      <ModificadorDeAccesso> NombreDeLaClase(Parámetros para inicializar atributos)
     */
	
	public Atm() {
		this.serialNumber = 1;
		this.balance = 500_000;
		this.model = "T-800";
		this.address = "N/A";
	}
	
	public Atm(int serialNumber, double balance, String model,  String address) {
		this.serialNumber = serialNumber;
		this.balance = balance;
		this.model = model;
		this.address = address.toUpperCase();
	}
	
	/*
	 * El Telescoping Constructor Anti-pattern (Antipatrón del 
	 * Constructor Telescópico) en Java ocurre cuando una clase 
	 * tiene múltiples constructores, y cada nuevo constructor 
	 * toma los parámetros de otro y añade uno nuevo.
	 */
	
	/**
	 *  factory method
	 *  https://refactoring.guru/es/design-patterns
	 *  Los patrones de diseño creacionales se utilizan para promover 
	 *  el código limpio, modular y fácil de mantener, así como para 
	 *  mejorar la flexibilidad y la reutilización del código.
	 *  
	 *  Patrón de diseño: Es una solución reutilizable y 
	 *  probada para problemas comunes en el desarrollo de software.
	 *  Anti-patrón: Es una práctica de diseño que parece 
	 *  útil pero que en realidad genera problemas de 
	 *  mantenimiento, rendimiento o escalabilidad.
	 */
	public static Atm createAirPortAtm() {
		return new Atm(1000, 900_000, "T-2000", "Airport");
	}
	
	/**
	 * Agregar min. 2 atributos no estáticos
	 * Agregar min. 1 atributo estático
	 * - Encapsular los atributos
	 * - Realizar 2 métodos contructores
	 * - Crear los setters y getters
	 * - Crear el método toString
	 */
	
	
	
	
	
	
	
	
	
}
