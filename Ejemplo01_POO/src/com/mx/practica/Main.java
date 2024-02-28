package com.mx.practica;

import com.mx.practica.entidades.Libro;
import com.mx.practica.servicios.LibroServicio;

public class Main {
    public static void main(String args[]){
        //Imprimir información en consola
        /*System.out.println("Hola con salto de linea"); //salto de linea
        System.out.println("------");
        System.out.print("Hola sin salto de linea"); //sin salto de linea

        Libro libroPrueba = new Libro(); //instanciar la clase
        */

        //Libro libro1 = new Libro(); // <-- Libro.java tradicional
        // de instanciar objetos. No la usaremos

        /*
        Sin la palabra clave static.

        LibroServicio libroServicio1 = new LibroServicio();
        Libro libro3 = LibroServicio1.crearLibro();
         */

        // Con la palabra clave static
        Libro libro2 = LibroServicio.crearLibro();

        // Primer forma de imprimir mi objeto
        System.out.println(LibroServicio.mostrarLibro(libro2));
        // Segunda forma de imprimir mi objeto
        LibroServicio.mostrarLibro2(libro2);

    }
}
