package com.mycompany.tp7arquitecturasw.ej4;

import java.util.Scanner;
import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.xml.ws.Endpoint;

// APLICACION QUE SOLICITA POR PANTALLA EL ISO DE UN PAIS Y TE CEVUELVE LA INFO COMPLETA UTILIZANDO EL WS
@WebService
public class PaisServicio {
    
     public static void main(String[] args) {
        PaisServicio servicio = new PaisServicio();
        Endpoint.publish("http://localhost:8080/servicioPais",servicio);
    }

    @WebMethod
    public void ServicioPaises() {
        String pais = "";
        int opcion = 1;
        Scanner in = new Scanner(System.in);
        do {
            System.out.println("Quiere buscar informacion de un pais? (0 Salir 1 Buscar)");
            try {
                opcion = in.nextInt();
            } catch (Exception e) {
                System.out.println("Error, Pais Invalido");
            }
            in.nextLine();
            if (opcion == 1) {
                do {
                    System.out.println("Ingrese el ISO de un pais");
                    pais = in.nextLine();
                } while (pais.isEmpty());
                try { // Call Web Service Operation
                    org.oorsprong.websamples.CountryInfoService service = new org.oorsprong.websamples.CountryInfoService();
                    org.oorsprong.websamples.CountryInfoServiceSoapType port = service.getCountryInfoServiceSoap();
                    // TODO initialize WS operation arguments here
                    java.lang.String sCountryISOCode = pais;
                    // TODO process result here
                    org.oorsprong.websamples.TCountryInfo result = port.fullCountryInfo(sCountryISOCode);
                    System.out.println("Informacion del pais:" + pais);
                    System.out.println("Nombre: " + result.getSName());
                    System.out.println("Moneda: " + result.getSCurrencyISOCode());
                    System.out.println("Capital: " + result.getSCapitalCity());
                    System.out.println("Continente: " + result.getSContinentCode());

                } catch (Exception ex) {
                    // TODO handle custom exceptions here
                    System.out.println("Error ejecutando servicio web");
                }
            }
        } while (opcion != 0);
        System.out.println("Servicio Finalizado");
        System.exit(0);

    }

}
