package com.mycompany.tp7arquitecturasw.ej2;

import javax.xml.ws.Endpoint;

public class Principal {

    public static void main(String[] args) {
        Endpoint.publish("http://localhost:8080/servicioHolaMundo",
                new HolaMundo());
    }

}
