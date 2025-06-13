package mx.gob.loterianacional;

<<<<<<< HEAD
import java.util.List;

public class MelateTest {

    public static void main(String[] args) {

        // Declaramos una sola vez el objeto Melate
        Melate melate = new Melate();

        // Llamada a un método sobrecargado con parámetros
        melate.printRandomNumbersList(7, 1, 54);
        melate.printRandomNumbersList(7, 1, 57);

        // Llamada al método sin parámetros que devuelve una lista
        List<Integer> numeros = melate.printRandomNumbersList();

        System.out.println("Tus 7 números aleatorios del 1 al 100 son:");
        for (int numero : numeros) {
            System.out.println(numero);
        }

        // Si quieres usar los métodos comentados, asegúrate que existan:
        // melate.mostrarNumerosRepetidos();
        // melate.mostrarNumerosSinRepetirOrdenadosConFecha();
    }
=======
public class MelateTest {

	public static void main(String[] args) {
		Melate melate = new Melate();
		
		melate.printRandomNumbersList(7, 1, 54);		
		melate.printRandomNumbersList("7", "1", "54");
		melate.printRandomNumbersList();
		
		

	}

>>>>>>> upstream/main
}
