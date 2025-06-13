// Importar la clase ArrayList del paquete java.util
import java.util.ArrayList;
// Importar la interfaz List del paquete java.util
import java.util.List;
<<<<<<< HEAD
// Si quisiéramos importar todas las clases de java.util (menos recomendado):
// import java.util.*;
=======

// Si quisiéramos importar todas las clases de java.util (menos recomendado):
// import java.util.*;

>>>>>>> upstream/main
public class ImportExample {
    public static void main(String[] args) {
        // Ahora podemos usar ArrayList y List directamente sin el prefijo del paquete
        List<String> names = new ArrayList<>(); // Usamos la interfaz List como tipo
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
<<<<<<< HEAD
        names.add("Yorch");
        names.add("Naty");
        names.add("T'Challa");
        System.out.println("Names: " + names); // Imprime: Names: [Alice, Bob, Charlie]
    }
}
=======

        System.out.println("Names: " + names); // Imprime: Names: [Alice, Bob, Charlie]
    }
}
>>>>>>> upstream/main
