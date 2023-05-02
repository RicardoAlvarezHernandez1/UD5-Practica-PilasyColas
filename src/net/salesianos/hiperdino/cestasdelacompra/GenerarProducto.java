package net.salesianos.hiperdino.cestasdelacompra;

import java.util.Random;

public class GenerarProducto {
    

    private static final String[] NOMBRES_PRODUCTOS = new String[] {
        "Aspiradora", "Alfombra", "Comida para perros veganos", "Ordenador", "Salmón", "Bistec de cerdo", "Reloj",
        "Limpia cristales", "Zapatos", "Gafas", "Mochila", "Cascos"
    };

    public static String getRandomProducto() {

        Random random = new Random();
        int randomIndex = random.nextInt(GenerarProducto.NOMBRES_PRODUCTOS.length);

        return GenerarProducto.NOMBRES_PRODUCTOS[randomIndex];
    }
}
