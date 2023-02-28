package Conjuntos.Actividad5_1;

import Conjuntos.Actividad5_1.Persona;

import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        TreeSet<Persona> gente = new TreeSet<>();

        Persona Antonio = new Persona("Antonio", 47);
        Persona Recio = new Persona("Recio", 34);
        Persona Serafin = new Persona("Serafín", 48);
        Persona Pepe = new Persona("Pepe", 68);

        gente.add(Antonio);
        gente.add(Recio);
        gente.add(Serafin);
        gente.add(Pepe);

        System.out.println(gente);
    }
}