package com.mycompany.tp7arquitecturasw.ej3;

import javax.jws.WebMethod;
import javax.jws.WebService;
import java.util.HashMap;
import java.util.Map;
import javax.xml.ws.Endpoint;

@WebService
public class CodigoPostalServicio {
    
        public static void main(String[] args) {
        Endpoint.publish("http://localhost:8080/servicioPostal", new CodigoPostalServicio());
    }

    private static final Map<String, String> codigosPostales = new HashMap<>();

    static {
        codigosPostales.put("10001", "New York");
        codigosPostales.put("20001", "Washington, D.C.");
        codigosPostales.put("94105", "San Francisco");
        // Añadir más códigos postales y ciudades según sea necesario
    }

    @WebMethod
    public String obtenerCiudadPorCodigoPostal(String codigoPostal) {
        return codigosPostales.getOrDefault(codigoPostal, "Código postal no encontrado");
    }
}

