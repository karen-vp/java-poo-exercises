package com.mx.ejemplo.servicios;

import com.mx.ejemplo.entidades.Cadena;

import java.util.Scanner;

public class CadenaServicio {

    public static Scanner sc = new Scanner(System.in);
    public static Cadena crearCadena(){
        Cadena cadena = new Cadena();
        System.out.println("Ingrese una frase");
        cadena.setFrase(sc.nextLine());
        cadena.setLongitud(cadena.getFrase().length());

        return cadena;
    }

    public static void mostrarCadena(Cadena cadena){

        System.out.println(cadena.toString());
    }

    public static int mostrarVocales(Cadena cadena){
        Character[] vocales = {'a','e','i','o','u'};
        int numeroVocales = 0;
        //== vocales[j]
        for (int i = 0; i < cadena.getFrase().length(); i++) {
            for(int j = 0; j<vocales.length; j++) {
                if (cadena.getFrase().charAt(i) == vocales[j]) {
                    numeroVocales++;
                }
            }
        }
        return numeroVocales;
    }

    public static String invertirFrase(Cadena cadena){
        String cadenaInvertida = "";
        for(int i = (cadena.getFrase().length()-1); i>=0; i--){
            cadenaInvertida = cadenaInvertida + cadena.getFrase().charAt(i);
            /* Hola */
        }
        return cadenaInvertida;
    }

    public static void vecesRepetido(Cadena cadena){
        String letra = "";
        System.out.println("Ingresa una letra ");
        letra = sc.nextLine();

        int letraRepetida = 0;
        for(int i = 0; i<cadena.getFrase().length(); i++){
            if(cadena.getFrase().charAt(i) == letra.charAt(0)){
                letraRepetida++;
            }
        }
        System.out.println("El carácter " +letra + " se repite " + letraRepetida + " veces" );
    }

    /*Hacer los métodos compararLongitud, unirFrases, reemplazar*/

    public static Boolean contiene(Cadena cadena, String letra){
        if(cadena.getFrase().contains(letra)){
            return true;
        }
        return false;
    }
}
