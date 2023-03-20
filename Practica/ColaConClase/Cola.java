package Practica5.ColaConClase;

import java.util.LinkedList;
import java.util.List;

public class Cola {
    private List cola = new LinkedList();
    public void encolar(Object elemento){
        cola.add(elemento);
    }
    public void desencolar() {
        cola.remove(0);
    }
    public int frente() {
        return (int) cola.get(0);
    }
    public List resto() {
        List<Integer> copiaCola = new LinkedList<>(cola);
        copiaCola.remove(0);
        return copiaCola;
    }

    public void limpiar(){
        cola.removeAll(cola);
    }
    public boolean esVacia(){
        if (cola.isEmpty()){
            return true;
        }else return false;
    }

    public int longitud(){
         return cola.size();
    }

    @Override
    public String toString() {
        return "Cola de la Carnicería{" + cola + "}";
    }
}
