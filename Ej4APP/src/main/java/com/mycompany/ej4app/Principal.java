package com.mycompany.ej4app;


public class Principal {

    public static void main(String[] args) {
        try { // Call Web Service Operation
            com.mycompany.tp7arquitecturasw.ej4.PaisServicioService service = new com.mycompany.tp7arquitecturasw.ej4.PaisServicioService();
            com.mycompany.tp7arquitecturasw.ej4.PaisServicio port = service.getPaisServicioPort();
            port.servicioPaises();
        } catch (Exception ex) {
            // TODO handle custom exceptions here
            System.out.println("Error ejecutando el servicio");
        }

    }

}
