package net.salesianos.hiperdino.clientes;

import java.util.Stack;


public class Cliente {
    private String nombre;
    private int numeroDeProductos;
    

    Stack<String> articulos = new Stack<>();


    public void annadirArticulo(String articulo){
        articulos.push(articulo);
    }


}
