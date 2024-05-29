package com.mycompany.tp7arquitecturasw.ej3;


import javax.xml.ws.Endpoint;

public class ServicioPostal {
    public static void main(String[] args) {
        Endpoint.publish("http://localhost:8080/servicioPostal", new CodigoPostalServicio());
    }
}

