package net.salesianos.hiperdino.cajeros;

import java.util.LinkedList;
import java.util.Queue;

public class Cajero {
    
    private int numeroDeCaja;
    private int numeroDeClientes;
    
    Queue<String> persons = new LinkedList<>();

    public Cajero(int numeroDeCaja, int numeroDeClientes, Queue<String> persons) {
        this.numeroDeCaja = numeroDeCaja;
        this.numeroDeClientes = numeroDeClientes;
        this.persons = persons;
    }

    @Override
    public String toString() {
        String msg = ("* Número de caja : " + numeroDeCaja + "\n");
        msg += ("* Total de clientes : " + numeroDeClientes + "\n");
        msg +=("* Clientes en la fila : " + "\n" + persons);
        return msg;
    }

}





