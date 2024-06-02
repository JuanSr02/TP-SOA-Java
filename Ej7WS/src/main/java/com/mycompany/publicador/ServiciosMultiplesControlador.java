package com.mycompany.publicador;

import com.mycompany.servicio.ServiciosMultiples;
import java.util.ArrayList;
import java.util.HashMap;
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
        long numero = 0;
        try {
            numero = Long.parseLong(request.queryParams("nro"));
        } catch (NumberFormatException e) {
            System.out.println("Numero invalido");
        }
        ServiciosMultiples servicio = new ServiciosMultiples();
        ArrayList<String> resultado = servicio.ServicioPrincipal(numero);
        HashMap model = new HashMap();
        model.put("resultados",resultado);
        return ViewUtil.render(request, model, Path.Template.PANTALLASERVICIO);
    };

}
