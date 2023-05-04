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
        String msg = ("********************************" + "\n" + "* Nombre : " + nombre + "\n");
        msg += ("* Total de productos : " + numeroDeProductos + "\n");
        String listaArticulos = "";
        for (int i = 0; i < articulos.size(); i++) {
            listaArticulos += articulos.get(i);
        }
        msg +=("* Lista de artículos en la cesta : " + "\n" + listaArticulos + "********************************");
        return msg;
    }
}
