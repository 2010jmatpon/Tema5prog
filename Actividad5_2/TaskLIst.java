package Listas.Actividad5_2;

import java.util.Arrays;
import java.util.List;

public class TaskLIst {
    static void addTask(List list, String task){
        list.add(task);
    }
    static void removeTask(List list, String task){
        list.remove(task);
    }
    static void completeTask(List list, String task){
        System.out.println(task + ":Completado");
        removeTask(list, task);
        System.out.println(list);
    }

    static void getTasks (List list){
        Object[] array = list.toArray();
        System.out.println(array);
        System.out.println(Arrays.toString(array));
    }

}
