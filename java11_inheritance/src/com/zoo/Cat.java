package com.zoo;

<<<<<<< HEAD
public class Cat extends Feline {
=======
import com.roles.Pet;

public class Cat extends Feline implements Pet {
>>>>>>> upstream/main
	private String name;
	private boolean isDomestic;
	
	public Cat(String name, double age, boolean isDomestic) {
		super(age);
		this.name = name;
		this.isDomestic = isDomestic;
		super.setCommonName("Cat");
		super.setScientificName("Catus");
	}
<<<<<<< HEAD
	
=======

>>>>>>> upstream/main
	@Override
	public String noise() {
		return "Rauuuullll";
	}

	public final String getName() {
		return name;
	}

	public final void setName(String name) {
		this.name = name;
	}

	public final boolean isDomestic() {
		return isDomestic;
	}

	public final void setDomestic(boolean isDomestic) {
		this.isDomestic = isDomestic;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
<<<<<<< HEAD
		builder.append(super.toString() );
=======
		builder.append(super.toString());
>>>>>>> upstream/main
		builder.append("Cat [name=");
		builder.append(name);
		builder.append(", isDomestic=");
		builder.append(isDomestic);
		builder.append("]");
		return builder.toString();
	}
<<<<<<< HEAD
	
	
	
	
	
=======

	@Override
	public String trick() {
		return "Soy un gato, no tengo trucos, soy tu amo";
	}

		
>>>>>>> upstream/main
}
