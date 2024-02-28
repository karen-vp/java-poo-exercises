package com.mx.ejemplo.servicios;

import com.mx.ejemplo.entidades.Rectangulo;

import java.util.Arrays;
import java.util.Scanner;

public class RectanguloServicio {
    public static Double base;
    public static Double altura;
    public static Scanner sc = new Scanner(System.in);
        public static Rectangulo crearRectangulo(){
            System.out.println("Ingrese la base");
            base = sc.nextDouble();

            System.out.println("Ingrese la altura");
            altura = sc.nextDouble();

            Rectangulo rectangulo = new Rectangulo(base, altura);
            return rectangulo;
    }

    public static Double calcularSuperficie(Rectangulo rectangulo){
            Double superficie = 0.0;
            superficie = rectangulo.getBase() * rectangulo.getAltura();

            return superficie;

    }

    public static Double calcularPerimetro(Rectangulo rectangulo){
            Double perimetro = 0.0;
            perimetro = (rectangulo.getBase() + rectangulo.getAltura()) * 2;

            return perimetro;
    }

    public static String dibujar(Rectangulo rectangulo){
            String dibujoRectangulo = "";
            for(int i = 0; i< rectangulo.getAltura(); i++){
               for(int j=0; j< rectangulo.getBase(); j++){
                   dibujoRectangulo += "*";
               }
                dibujoRectangulo += "\n";
            }
            
            return dibujoRectangulo;
    }

    public static void dibujarConMatriz(Rectangulo rectangulo){

        int base =  (int) rectangulo.getBase();
        int altura = (int) rectangulo.getAltura();
        String dibujoRectangulo [][] = new String[base][altura];

        for(int i = 0; i< altura; i++){
            for(int j= 0; j< base; j++) {
                dibujoRectangulo[i][j] = "*";
            }
        }
        System.out.println(Arrays.deepToString(dibujoRectangulo));

    }
}
