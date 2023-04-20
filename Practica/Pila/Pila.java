package Practica5.Pila;

import java.util.LinkedList;
import java.util.List;

public class Pila {
    private List<Object> cartas = new LinkedList<>();
    public void apilar (Object elemento){
        cartas.add(elemento);
    }

    public void desapilar(){
        cartas.remove(cartas.size() - 1);
    }

    public void cima(){
        System.out.println(cartas.get(cartas.size() - 1));
    }

    public void limpiar(){
        cartas.clear();
    }

    public boolean esVacia(){
        if (cartas.isEmpty()){
            return true;
        }else return false;
    }

    public int longitud(){
        return cartas.size();
    }

    @Override
    public String toString() {
        return "Pila{" + cartas +
                '}';
    }
}
