package com.mycompany.tp7arquitecturasw.ej5;


import javax.jws.WebService;
import javax.jws.WebMethod;
import java.util.HashMap;

/* EN ESTE EJERCICIO PASE A SERVICIO WEB UN PROGRAMA JAVA SIMPLE QUE 
SE LE INGRESAN LETRAS Y SE VAN CONTANDO LAS LETRAS QUE FUERON INGRESADAS Y LA IDEA ES QUE FINALICE CUANDO UNA LETRA FUE INGRESADA K VECES */

@WebService
public class ContadorDeLetrasService {
    boolean x= false;
    private final HashMap<String, Integer> conteoLetras = new HashMap<>();
    private int k = 5; // Configura un valor predeterminado o permite configurarlo

    @WebMethod
    public String ingresarLetra(String letra) {
        if (x){
            return "Servicio Finalizado.";
        }
        if (letra.length() != 1 || !Character.isLetter(letra.charAt(0))) {
            return "Por favor, ingrese una letra válida.";
        }
        
        conteoLetras.put(letra, conteoLetras.getOrDefault(letra, 0) + 1);
        
        if (conteoLetras.get(letra) == k) {
            x=true;
            return "La letra " + letra + " ha alcanzado " + k + " repeticiones.";
        }
        return "Letra " + letra + " contada " + conteoLetras.get(letra) + " veces.";
    }

    @WebMethod
    public void setK(int k) {
        this.k = k;
    }
}

