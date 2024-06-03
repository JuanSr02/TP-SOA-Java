package com.mycompany.ej5app;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        while (true) {
            System.out.println("Ingrese una letra a continuacion");
            Scanner in = new Scanner(System.in);
            String letra = in.nextLine();
            try { // Call Web Service Operation
                com.mycompany.tp7arquitecturasw.ej5.ContadorDeLetrasServiceService service = new com.mycompany.tp7arquitecturasw.ej5.ContadorDeLetrasServiceService();
                com.mycompany.tp7arquitecturasw.ej5.ContadorDeLetrasService port = service.getContadorDeLetrasServicePort();
                // TODO initialize WS operation arguments here
                java.lang.String arg0 = letra;
                // TODO process result here
                java.lang.String result = port.ingresarLetra(arg0);
                System.out.println("Result = " + result);
            } catch (Exception ex) {
                // TODO handle custom exceptions here
            }

        }
    }
}
