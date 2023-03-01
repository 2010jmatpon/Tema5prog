package Listas.Actividad5_2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main extends TaskLIst{
    public static void main(String[] args) {
        List<String> Tarea1 = new LinkedList<>();
        List<String> Tarea2 = new ArrayList<>();

        addTask(Tarea1, "Tarea nº1");
        addTask(Tarea1, "Tarea nº2");
        addTask(Tarea1, "Tarea nº3");

        System.out.println(Tarea1);

        removeTask(Tarea1, "Tarea nº2");
        System.out.println(Tarea1);

        completeTask(Tarea1, "Tarea nº1");
        System.out.println(Tarea1);

        getTasks(Tarea1);
        System.out.println(Tarea1);

    }
}
