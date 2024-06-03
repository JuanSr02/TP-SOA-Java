package com.mycompany.tp7arquitecturasw.ej2;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.xml.ws.Endpoint;

@WebService
public class HolaMundo{
    
     public static void main(String[] args) {
        Endpoint.publish("http://localhost:8080/servicioHolaMundo",
                new HolaMundo());
    }
    
    @WebMethod
    public String saludar(){
        return "Hola Mundo";
    }
}
