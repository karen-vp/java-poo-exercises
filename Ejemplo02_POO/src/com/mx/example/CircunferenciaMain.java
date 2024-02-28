package com.mx.example;

import com.mx.example.entidades.Circunferencia;
import com.mx.example.servicios.CircunferenciaServicio;

public class CircunferenciaMain {
    public static void main(String[] args){
        Circunferencia circunferencia = CircunferenciaServicio.crearCircunferencia();
        System.out.println("El area es " + CircunferenciaServicio.calcularArea((circunferencia)));
        System.out.println("El perimetro es " + CircunferenciaServicio.calcularPerimetro((circunferencia)));
        
    }
}
