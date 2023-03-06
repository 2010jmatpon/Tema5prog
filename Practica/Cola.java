package Practica;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Cola {
    public static void main(String[] args) {
        // Voy a crear la cola del Paro
        // Para ello al ser una cola utilizaré un arrayList
        List<Integer> colaParo = new ArrayList<>();
        colaParo.add(0);
        colaParo.add(1);
        colaParo.add(2);
        colaParo.add(3);
        colaParo.add(4);
        colaParo.add(5);
        System.out.println("Cola del paro original");
        System.out.println(colaParo);
        // Aplico metodo encolar
        encolar(colaParo, 6);
        System.out.println("Se une a la cola un nuevo parado");
        System.out.println(colaParo);

        //Aplico método desencolar
        desencolar(colaParo, 1);
        System.out.println("Se marcha de la cola un parado");
        System.out.println(colaParo);

        //Aplico método frente
        frente(colaParo);

        //Aplico método resto
        System.out.println("El resto de la cola");
        resto(colaParo);

        //Aplico metodo limpiar
        System.out.println("Se limpia la cola");
        limpiar(colaParo);

        //Aplico metodo es vacia
        System.out.println("¿Queda algún parado en la cola?");
        esVacia(colaParo);

        //Aplico metodo longitud
        System.out.println("Longitud de la cola");
        longitud(colaParo);
    }



    public static void encolar (List<Integer> colaParo, Integer otroParado){
        colaParo.add(otroParado);
    }
    public static void desencolar (List<Integer> colaParo, Integer nuevoEmpleado){
        colaParo.remove(nuevoEmpleado);
    }
    public static void frente(List<Integer> colaParo) {
        System.out.println("Es atendido el primer parado");
        System.out.println(colaParo.get(0));
    }
     public static void resto(List<Integer> colaParo) {
        //Copio la cola del paro para después seguir haciendo el ejercicio con normalidad
        List<Integer> copiaColaDelParo = new LinkedList<>(colaParo);
        copiaColaDelParo.remove(0);
        System.out.println(copiaColaDelParo);
    }

     public static void limpiar(List<Integer> colaParo){
        colaParo.clear();

    }
     public static void esVacia(List<Integer> colaParo){
        if (colaParo.size() == 0){
            System.out.println("No hay parados en la cola.");
        } else {
            System.out.println("Aún hay parados en la cola");
        }
    }
     public static void longitud(List<Integer> colaParo){
         System.out.println(colaParo.size());
    }
}
