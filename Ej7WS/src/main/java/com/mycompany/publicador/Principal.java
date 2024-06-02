package com.mycompany.publicador;

import com.mycompany.servicio.ServiciosMultiples;
import java.lang.invoke.MethodHandles;
import javax.xml.ws.Endpoint;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import static spark.Spark.get;
import static spark.debug.DebugScreen.enableDebugScreen;
import util.Path;


public class Principal {

    public static void main(String[] args) {
       Logger registraLog = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());
       enableDebugScreen();
       Endpoint.publish("http://localhost:8080/servicio",new ServiciosMultiples());
       get(Path.Web.INICIO, ServiciosMultiplesControlador.getInicio); 
       get(Path.Web.SERVICIO, ServiciosMultiplesControlador.getServicio); 
       
    }

}
