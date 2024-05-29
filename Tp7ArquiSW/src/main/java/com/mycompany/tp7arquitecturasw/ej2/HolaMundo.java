package com.mycompany.tp7arquitecturasw.ej2;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class HolaMundo{
    
    @WebMethod
    public String saludar(){
        return "Hola Mundo";
    }
}
