package net.salesianos.hiperdino.clientes;

import java.util.Stack;


public class Cliente {
    
    private String nombre;

    private int numeroDeProductos;

    Stack<String> articulos = new Stack<>();
    
    public Cliente(String nombre, int numeroDeProductos, Stack<String> articulos) {
        this.nombre = nombre;
        this.numeroDeProductos = numeroDeProductos;
        this.articulos = articulos;
    }


    @Override
    public String toString() {
        String msg = ("* Nombre : " + nombre + "\n");
        msg += ("* Total de productos : " + numeroDeProductos + "\n");
        msg +=("* Lista de artículos en la cesta : " + "\n" + articulos);
        return msg;
    }
}
