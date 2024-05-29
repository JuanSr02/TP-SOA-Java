/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import lombok.Getter;

/**
 *
 * @author Daniel
 */
public class Path {

    // Los metodos @Getter son necesarios para acceder desde las variables de Templates de Velocity
    // NO USAR ACCESOS DIRECTOS, SINO SIEMPRE A TRAVÉS DE ESTA CLASE
    public static class Web {

        @Getter
        public static final String SERVICIO = "/api/getServicio";
        public static final String INICIO = "/api/getInicio";
    }

    public static class Template {

        public final static String LAYOUT = "templates/layout.vtl";
        public final static String PANTALLASERVICIO = "templates/servicio.vtl";
        public final static String INICIO = "templates/inicio.vtl";

    }

}
