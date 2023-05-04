package net.salesianos.hiperdino;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

import net.salesianos.hiperdino.cajeros.Cajero;
import net.salesianos.hiperdino.cestasdelacompra.GenerarNombre;
import net.salesianos.hiperdino.cestasdelacompra.GenerarProducto;
import net.salesianos.hiperdino.clientes.Cliente;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner teclado = new Scanner(System.in);

        String estadoDeCajero = "cerrado";

        boolean salida = false;

        Queue<Cliente> clientes = new LinkedList<>();
        
        
        while (salida == false){
            System.out.println("1. Abrir caja");
            System.out.println("2. Añadir un nuevo cliente a la cola");
            System.out.println("3. Atender cliente");
            System.out.println("4. Ver clientes pendientes");
            System.out.println("5. Cerrar supermercado");
            
            int opcion = teclado.nextInt();
            switch (opcion) {
                case 1:
                    if (estadoDeCajero == "cerrado") {

                        estadoDeCajero = "abierto";
                        System.out.println("Se a abierto la caja.");

                    } else if (estadoDeCajero == "abierto"){
                        System.out.println("El cajero ya estaba abierto");
                    }
                    break;
                case 2:
                    if ( estadoDeCajero == "abierto") {

                        String nombre = GenerarNombre.getRandomNombre();
                        int numeroDeProductos = (int)(Math.random()*12+1);
                        Stack<String> articulos = new Stack<>();
                        for (int i = 0; i < numeroDeProductos; i++) {
                            String articulo = GenerarProducto.getRandomProducto() + "\n";
                            articulos.push(articulo);
                        }
                        Cliente clientito = new Cliente(nombre , numeroDeProductos , articulos);
                        
                        clientes.add(clientito);
                        System.out.println(clientes.toString());

                    } else {
                        System.out.println("Disculpe pero la caja está cerrada");
                    }

                    break;
                case 3:
                    if (estadoDeCajero == "abierto" && clientes.isEmpty() == false){
                        System.out.println("Se ha atendido a : " + clientes.remove());
                    } else if (estadoDeCajero == "cerrado"){
                        System.out.println("El cajero está cerrado");
                    } else if(clientes.isEmpty() == true){
                        System.out.println("No hay clientes que atender en este cajero.");
                    }
                    
                    break;
                case 4:
                    int numeroCajero = 1;
                    int numeroDeClientes = clientes.size();

                    Cajero cajerito = new Cajero(numeroCajero, numeroDeClientes, clientes);
                    System.out.println(cajerito.toString());
                    break;
                case 5:
                    if (estadoDeCajero == "abierto") {
                        estadoDeCajero = "cerrado";
                        salida = true;
                    } else {
                        salida = true;
                    }
                    break;
                default:
                    break;
            }
        }
    }
}