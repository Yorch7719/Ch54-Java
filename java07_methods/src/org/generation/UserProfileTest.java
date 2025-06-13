package org.generation;

public class UserProfileTest {

	public static void main(String[] args) {
		
		UserProfile userProfile = new UserProfile();
<<<<<<< HEAD

		boolean isValid = userProfile.isValidEmail(null);
		System.out.println("El valor null es valido? " + isValid); // false
=======
		
		boolean isValid = userProfile.isValidEmail(null);
		System.out.println("El valor null es válido? " + isValid); // false
>>>>>>> upstream/main
		
		isValid = userProfile.isValidEmail("myemail_gmail_com");
		System.out.println("El valor 'myemail_gmail_com' es válido? " + isValid); // false 
		
		isValid = userProfile.isValidEmail("myemail@gmail.com");
<<<<<<< HEAD
		System.out.println("El valor 'myemail@gmail.com' es válido? " + isValid); // true
		
	

	// ===================
	
		String nameFormated = userProfileTest.nameFormatted("David");
		System.out.println("Nombre formateado: " + nameFormated);
		
		nameFormated = userProfileTest.nameFormatted("  Ch 54   ");
		System.out.println("Nombre formateado: " + nameFormated);
	
	// ==================
	
	userProfile.logError("Tengo hambre y ya no estoy pensando");
	
	
	
	
	
	}
	
=======
		System.out.println("El valor 'myemail@gmail.com' es válido? " + isValid); // true 

		//=======================================================
		String nameFormated = userProfile.nameFormatted("David");
		System.out.println("Nombre formateado: " + nameFormated); // david
		
		nameFormated = userProfile.nameFormatted("  Ch 54   ");
		System.out.println("Nombre formateado: " + nameFormated); // ch 54
		
		// ======================================================
		
		userProfile.logError("Tengo hambre y ya no estoy pensando");
		
	}

>>>>>>> upstream/main
}
