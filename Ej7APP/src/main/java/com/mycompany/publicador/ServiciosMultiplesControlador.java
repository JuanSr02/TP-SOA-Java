package com.mycompany.publicador;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import spark.Request;
import spark.Response;
import spark.Route;
import util.Path;
import util.ViewUtil;

public class ServiciosMultiplesControlador {

    public static Route getInicio = (Request request, Response response) -> {
        HashMap model = new HashMap();
        return ViewUtil.render(request, model, Path.Template.INICIO);
    };

    public static Route getServicio = (Request request, Response response) -> {
        List<String> resultado = null;
        long numero = 0;
        try {
            numero = Long.parseLong(request.queryParams("nro"));
        } catch (NumberFormatException e) {
            System.out.println("Numero invalido");
        }
        
        try { // Call Web Service Operation
            com.mycompany.servicio.ServiciosMultiplesService service = new com.mycompany.servicio.ServiciosMultiplesService();
            com.mycompany.servicio.ServiciosMultiples port = service.getServiciosMultiplesPort();
            // TODO initialize WS operation arguments here
            long arg0 = numero;
            // TODO process result here
            java.util.List<java.lang.String> result = port.servicioPrincipal(arg0);
            System.out.println("Result = "+result);
            resultado = result;
        } catch (Exception ex) {
            // TODO handle custom exceptions here
        }
        
        
        HashMap model = new HashMap();
        model.put("resultados",resultado);
        return ViewUtil.render(request, model, Path.Template.PANTALLASERVICIO);
    };

}
