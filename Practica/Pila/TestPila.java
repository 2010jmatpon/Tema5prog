package Practica5.Pila;

public class TestPila {
    public static void main(String[] args) {
        Pila cartas = new Pila();
        cartas.apilar("As de Oros");
        cartas.apilar("Dos de Oros");
        cartas.apilar("Tres de Oros");
        cartas.apilar("Cuatro de Oros");
        cartas.apilar("Cinco de Oros");
        System.out.println(cartas);

        cartas.apilar("Rey de Oros");
        System.out.println(cartas);

        cartas.desapilar();
        System.out.println(cartas);

        cartas.cima();

        cartas.limpiar();

        System.out.println(cartas.esVacia());

        System.out.println(cartas.longitud());
    }
}
