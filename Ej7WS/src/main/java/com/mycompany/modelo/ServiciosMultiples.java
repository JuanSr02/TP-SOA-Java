package com.mycompany.modelo;

import javax.jws.WebMethod;
import javax.jws.WebService;
import java.math.*;
import java.util.ArrayList;

@WebService
public class ServiciosMultiples {

    @WebMethod
    public ArrayList<String> ServicioPrincipal(long nro){
        ArrayList <String> resultado = new ArrayList<>();
        
        try { // Call Web Service Operation
            com.dataaccess.webservicesserver.NumberConversion service = new com.dataaccess.webservicesserver.NumberConversion();
            com.dataaccess.webservicesserver.NumberConversionSoapType port = service.getNumberConversionSoap();
            // TODO initialize WS operation arguments here
            long nro1 = nro;
            // TODO process result here
            java.lang.String result = port.numberToWords(BigInteger.valueOf(nro));
            System.out.println("Result = "+result);
            resultado.add(result);
        } catch (Exception ex) {
            // TODO handle custom exceptions here
        }
        try { // Call Web Service Operation
            com.daehosting.webservices.isbn.ISBNService service = new com.daehosting.webservices.isbn.ISBNService();
            com.daehosting.webservices.isbn.ISBNServiceSoapType port = service.getISBNServiceSoap();
            // TODO initialize WS operation arguments here
            java.lang.String sISBN = String.valueOf(nro);
            // TODO process result here
            boolean result = port.isValidISBN13(sISBN);
            System.out.println("Result = "+result);
            resultado.add(String.valueOf(result));
        } catch (Exception ex) {
            // TODO handle custom exceptions here
        }

        return resultado;
    }
}
