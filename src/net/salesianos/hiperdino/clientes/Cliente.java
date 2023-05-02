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

}
