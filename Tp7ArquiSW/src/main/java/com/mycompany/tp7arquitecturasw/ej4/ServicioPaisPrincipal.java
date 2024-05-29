package com.mycompany.tp7arquitecturasw.ej4;

import javax.xml.ws.Endpoint;


public class ServicioPaisPrincipal {

     public static void main(String[] args) {
        PaisServicio servicio = new PaisServicio();
        Endpoint.publish("http://localhost:8080/servicioPais",servicio);
        servicio.ServicioPaises();
        
    }
}
