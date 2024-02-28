package com.mx.practica.servicios;

import com.mx.practica.entidades.Libro;

import java.util.Scanner;

public class LibroServicio {

    /* static -> para reutilizar el objeto, se declara static porque el
    método es static
    */
    static Scanner sc = new Scanner(System.in);

    // Firma del método
    // [Modificador de acceso] [static: accede a métodos sin instanciar objetos]
    // [Libro: tipo de objeto que devuelve el método]
    // [crearLibro: Nombre del método]
    public static Libro crearLibro(){
        Libro libro = new Libro(); // se va a destruir una vez que termine de ejecutarse el método
        System.out.println("Ingrese el ISBN");
        libro.setISBN(sc.nextLine());
        System.out.println("Ingresa el autor");
        libro.setAutor(sc.nextLine());
        System.out.println("Ingresa el titulo");
        libro.setTitulo((sc.nextLine()));
        System.out.println("Ingresa el numero de paginas");
        libro.setNumeroPag(sc.nextInt());

        return libro;
    }

    public static String mostrarLibro(Libro libro){
        return "Los datos de tu libro son " + '\n' + libro.toString();
    }

    // Otra forma de hacer la impresion de datos, cuando queremos
    // imprimir cosas en consola debemos devolver como void en el
    // método.
    public static void mostrarLibro2(Libro libro){
        System.out.println("Los datos de tu libro son " + '\n' + libro.toString());
    }



}
