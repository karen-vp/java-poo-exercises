package com.mx.ejemplo;

import com.mx.ejemplo.entidades.Rectangulo;
import com.mx.ejemplo.servicios.RectanguloServicio;

public class RectanguloMain {

    public static void main(String[] args){
        Rectangulo rectangulo = RectanguloServicio.crearRectangulo();
        System.out.println("La superficie del rectangulo es: " +
                RectanguloServicio.calcularSuperficie(rectangulo));
        System.out.println("El perimetro del rectangulo es: " +
                RectanguloServicio.calcularPerimetro(rectangulo));
        System.out.println(RectanguloServicio.dibujar(rectangulo));
        RectanguloServicio.dibujarConMatriz(rectangulo);
    }
}
