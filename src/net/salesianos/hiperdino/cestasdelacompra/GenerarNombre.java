package net.salesianos.hiperdino.cestasdelacompra;

import java.util.Random;

public class GenerarNombre {
    

    private static final String[] NOMBRES_CLIENTES = new String[] {
        "Saúl", "Amanda", "Erik", "Vallejo", "Pablo", "Alberto", "Cristian", "Cristofer", "Jeremy", "Adán",
        "Chibuike", "Sofía", "Alba", "María", "Alby", "Alejandro", "Lucía", "Andrea", "Paula", "Óscar"
    };

    public static String getRandomNombre() {

        Random random = new Random();
        int randomIndex = random.nextInt(GenerarNombre.NOMBRES_CLIENTES.length);

        return GenerarNombre.NOMBRES_CLIENTES[randomIndex];
    }
}
