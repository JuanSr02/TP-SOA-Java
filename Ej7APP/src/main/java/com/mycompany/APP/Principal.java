package com.mycompany.APP;

import java.lang.invoke.MethodHandles;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import static spark.Spark.get;
import static spark.debug.DebugScreen.enableDebugScreen;
import util.Path;


public class Principal {

    public static void main(String[] args) {
       Logger registraLog = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());
       enableDebugScreen();
       get(Path.Web.INICIO, ServiciosMultiplesControlador.getInicio); 
       get(Path.Web.SERVICIO, ServiciosMultiplesControlador.getServicio); 
       
    }

}
