package com.mx.example.servicios;
import com.mx.example.entidades.Circunferencia;


import java.util.Scanner;

public class CircunferenciaServicio {

    static Scanner sc =  new Scanner(System.in);

    public static Circunferencia crearCircunferencia(){
        Circunferencia circunferencia = new Circunferencia();
        System.out.println("Ingresa el valor del radio");
        circunferencia.setRadio(sc.nextDouble());
        return circunferencia;
    }

    public static Double calcularArea(Circunferencia circunferencia){
        Double area = 0.0;
        // Math.pow(lo que quiero elevar, cantidad a la que se eleva)
        area = Math.PI * Math.pow(circunferencia.getRadio(), 2);

        return area;
    }

    public static Double calcularPerimetro(Circunferencia circunferencia){
        Double perimetro = 0.0;
        perimetro = 2 * Math.PI * circunferencia.getRadio();
        return perimetro;
    }
}
