package mx.com.Santander;

public class AtmTest {

	public static void main(String[] args) {
		Atm cajero01 = new Atm();
		cajero01.serialNumber = 1;
		cajero01.balance = 500_000.00;
		cajero01.address = "Av Simpre Viva n.1000";
		
		/* crear un cajero, asignarlo a la variable cajero02
		* establecer los atributos como:
		* serialNumber : 2
		* balance: 400_000.00
		* address: "Av Concha n.124" 
		*/
		
		Atm cajero02 = new Atm();
		cajero02.serialNumber = 2;
		cajero02.balance = 400_000.00;
		cajero02.address = "Av. Concha n.124";
		
		Atm.bankName = "Santander";
		System.out.println( cajero01.bankName ); // Santander
		System.out.println( cajero02.bankName ); // Santander
		System.out.println( Atm.bankName ); // Santander
		
		// ==== Uso de métodos no estáticos
		System.out.println("Balance en cajero01: " + cajero01.balance);
		cajero01.withdray(8_000.00);
		System.out.println("Nuevo balance en cajero01:" + cajero01.balance);
		
		System.out.println(Atm.printBankName());
		
		
		
		
	}

}
