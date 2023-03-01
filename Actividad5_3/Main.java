package Maps.Actividad5_3;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        int[] numero = new int[5];

        numero[0] = 3;
        numero[1] = 2;
        numero[2] = 5;
        numero[3] = 11;
        numero[4] = 40;

        mapNumeros(numero);



    }

    public static void mapNumeros (int[] numero){
        Map<Integer, Integer> contarNumeros = new HashMap<>();
        if(!contarNumeros.containsValue(11)){
            System.out.println("El valor 11 no está en el map");
        } else {
            System.out.println("El valor 11 si está en el map");
        }

    }

}
