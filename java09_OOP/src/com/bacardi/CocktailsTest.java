package com.bacardi;

public class CocktailsTest {

    public static void main(String[] args) {
        Cocktails cubaLibre = new Cocktails();
        cubaLibre.nombre = "Cuba Libre";
        cubaLibre.ron = "Havana Club 7 años";
        cubaLibre.ron_onzas = 10;
        cubaLibre.coca_cola_litros = 2;
        cubaLibre.hielo = "Ni que fuera caliente";
        cubaLibre.limon = "Para que sea libre de Castro";
        cubaLibre.cantidad = 5;
        cubaLibre.vasos = 10;

        Cocktails piñaColada = new Cocktails();
        piñaColada.nombre = "Piña Colada";
        piñaColada.ron = "Legendario 7 años";
        piñaColada.ron_onzas = 10;
        piñaColada.jugo_piña_litros = 2;
        piñaColada.coco = "Para darle sabor";
        piñaColada.cantidad = 3;
        piñaColada.vasos = 5;

        // Imprimir cócteles
        System.out.println(cubaLibre);
        System.out.println(piñaColada);

        // ✅ Usar el método no estático
        System.out.println("Mililitros totales en Cuba Libre: " + cubaLibre.calcularMililitrosTotales() + " ml");
        System.out.println("Mililitros totales en Piña Colada: " + piñaColada.calcularMililitrosTotales() + " ml");

        // ✅ Usar el método estático
        System.out.println("Con 2 litros de Coca-Cola y 10 oz de ron se pueden servir: "
                + Cocktails.calcularVasosConIngredientesFijos() + " vasos");
    }
}
