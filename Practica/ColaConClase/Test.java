package Practica5.ColaConClase;

public class Test {
    public static void main(String[] args) {
        Cola colaCarniceria = new Cola();

        //Se forma la cola con el metodo encolar
        System.out.println("Cola");
        colaCarniceria.encolar(0);
        colaCarniceria.encolar(1);
        colaCarniceria.encolar(2);
        colaCarniceria.encolar(3);
        colaCarniceria.encolar(4);
        colaCarniceria.encolar(5);
        colaCarniceria.encolar(6);
        colaCarniceria.encolar(7);
        colaCarniceria.encolar(8);
        System.out.println(colaCarniceria);
        //Se marcha el primero al ser atendido con método desencolar
        System.out.println("Se va el primero");
        colaCarniceria.desencolar();
        System.out.println(colaCarniceria);
        //Metodo frente
        System.out.println("¿Quién es el primero de la cola ahora?: " + colaCarniceria.frente());
        //Resto de la cola
        System.out.println("¿Cuál es el resto de la cola?: " + colaCarniceria.resto());
        //Se van todos de la cola porque la carnicería ha cerrado
        System.out.println("Se vacia la cola, que esto cierra");
        colaCarniceria.limpiar();
        System.out.println(colaCarniceria);
        //Comprobamos que no queda nadie en la cola
        System.out.println("¿Ya se fueron todos?: " + colaCarniceria.esVacia());
        //Vemos la longitud
        System.out.println("Ahora que se fueron cuanta gente queda?: " + colaCarniceria.longitud() + " personas");

    }
}
