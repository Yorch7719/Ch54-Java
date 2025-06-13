package org.santander;

public class AtmTest {

	public static void main(String[] args) {
		Atm cajero01 = new Atm();
		
		cajero01.setSerialNumber(1);
		cajero01.setBalance(500_000.00);
		cajero01.setModel("T-800");
		cajero01.setAddress("Av. Siempre viva n.134");
		
		System.out.println(cajero01);
		
		Atm cajero02 = new Atm(2, 400_000, "T-100", "Av Concha 8254");
		Atm cajero03 = new Atm();
		
		System.out.println(cajero02);
		System.out.println(cajero03);
		
		Atm cajero05 = Atm.createAirPortAtm();
		
		
		
	}

}
