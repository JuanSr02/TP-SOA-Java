package com.mycompany.tp7arquitecturasw.ej5;

import javax.xml.ws.Endpoint;

public class ContadorDeLetrasPublisher {
    public static void main(String[] args) {
        Endpoint.publish("http://localhost:8080/contadorLetras", new ContadorDeLetrasService());
        System.out.println("Service published!");
    }
}

