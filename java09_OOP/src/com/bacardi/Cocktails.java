package com.bacardi;

public class Cocktails {
	/*
	 * Establecer mínimo 2 atributos no estáticos
	 * Establacer mínimo 1 atributo estático
	 * Probar la clase en una nueva clase llamada CocktailsTest
	 */
	/*
	 * Agregar 1 método no estático
	 * Agregar 1 método estático
	 */
	    // Atributo estático (compartido por todos los objetos)
	    static String origen = "Cuba";

	 // Atributos no estáticos
	    String nombre;
	    String ron;
	    int ron_onzas;
	    int coca_cola_litros;
	    String hielo;
	    String limon;
	    int jugo_piña_litros;
	    String coco;
	    int cantidad;
	    int vasos;

	    // ✅ Método no estático: calcula la cantidad total de líquido en ml para este cóctel
	    public int calcularMililitrosTotales() {
	        int mlRon = ron_onzas * 30;
	        int mlCoca = coca_cola_litros * 1000;
	        int mlJugoPiña = jugo_piña_litros * 1000;
	        return mlRon + mlCoca + mlJugoPiña;
	    }

	    // ✅ Método estático: calcula cuántos vasos puedes servir con 2 litros de coca y 10 oz de ron
	    public static int calcularVasosConIngredientesFijos() {
	        int mlRon = 10 * 30;         // 10 oz * 30 ml
	        int mlCoca = 2 * 1000;       // 2 litros * 1000 ml
	        int totalMl = mlRon + mlCoca;
	        return totalMl / 200;        // 1 vaso = 200 ml
	    }

	    // Método toString mejorado
	    @Override
	    public String toString() {
	        return "Cóctel: " + nombre + "\n"
	            + "Ron: " + ron + "\n"
	            + (coca_cola_litros > 0 ? "Coca-Cola (L): " + coca_cola_litros + "\n" : "")
	            + (hielo != null ? "Hielo: " + hielo + "\n" : "")
	            + (limon != null ? "Limón: " + limon + "\n" : "")
	            + (jugo_piña_litros > 0 ? "Jugo de piña (L): " + jugo_piña_litros + "\n" : "")
	            + (coco != null ? "Coco: " + coco + "\n" : "")
	            + "Cantidad: " + cantidad + "\n"
	            + "Vasos: " + vasos + "\n"
	            + "Origen: " + origen + "\n";
	    }
	}