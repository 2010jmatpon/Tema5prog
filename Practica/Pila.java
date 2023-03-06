package Practica;

import java.util.List;
import java.util.Stack;

public class Pila {
    public static void main(String[] args) {
        Stack<String> cartas = new Stack<>();
        cartas.push("As de Oros");
        cartas.push("Dos de Oros");
        cartas.push("Tres de Oros");
        cartas.push("Cuatro de Oros");
        cartas.push("Cinco de Oros");
        cartas.push("Seis de Oros");
        cartas.push("Siete de Oros");
        cartas.push("Ocho de Oros");
        cartas.push("Nueve de Oros");
        cartas.push("Sota de Oros");
        cartas.push("Caballo de Oros");
        cartas.push("Rey de Oros");

        System.out.println("Pila Original");
        System.out.println(cartas);

        //Aplico método apilar
        System.out.println("Añado nueva carta");
        apilar(cartas, "As de Copas");
        System.out.println(cartas);

        //Aplico método desapilar
        System.out.println("Retiro un elemento");
        desapilar(cartas);
        System.out.println(cartas);

        //Aplico metodo cima
        System.out.println("Obtengo el elemento de arriba");
        cima(cartas);

        //Aplico metodo limpiar
        System.out.println("Desapilo por completo la pila");
        limpiar(cartas);
        System.out.println(cartas);

        //Aplico metodo esVacia
        System.out.println("¿Siguen habiendo cartas en la pila?");
        esVacia(cartas);

        //Aplico metodo longitud
        System.out.println("Longitud de la pila");
        longitud(cartas);
    }

    public static void apilar (Stack<String> cartas, String nuevaCarta){
        cartas.push(nuevaCarta);
    }
    public static void desapilar (Stack<String> cartas){
        cartas.pop();
    }
    public static void cima (Stack<String> cartas){
        System.out.println(cartas.peek());
    }
    public static void limpiar(Stack<String> cartas){
        cartas.clear();
    }
    public static void esVacia(Stack<String> cartas){
        if (cartas.size() == 0){
            System.out.println("No hay cartas en la pila.");
        } else {
            System.out.println("Aún hay cartas en la pila");
        }
    }
    public static void longitud(List<String> cartas){
        System.out.println(cartas.size());
    }

}
