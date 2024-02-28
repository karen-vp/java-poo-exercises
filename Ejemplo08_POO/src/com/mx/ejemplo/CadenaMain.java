package com.mx.ejemplo;

import com.mx.ejemplo.entidades.Cadena;
import com.mx.ejemplo.servicios.CadenaServicio;

import java.util.Scanner;

public class CadenaMain {

    public static void main(String[] args){

        Cadena cadena = CadenaServicio.crearCadena();
        CadenaServicio.mostrarCadena(cadena);
        System.out.println(CadenaServicio.mostrarVocales(cadena));
        System.out.println(CadenaServicio.invertirFrase(cadena));
        CadenaServicio.vecesRepetido(cadena);
        System.out.println(CadenaServicio.contiene(cadena,"a"));

    }
}
