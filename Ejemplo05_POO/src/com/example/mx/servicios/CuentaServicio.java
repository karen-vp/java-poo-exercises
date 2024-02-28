package com.example.mx.servicios;

import com.example.mx.entidades.Cuenta;

import java.util.Scanner;

public class CuentaServicio {

    private static Scanner sc = new Scanner(System.in);

    public static Cuenta crearCuenta(){
        Cuenta cuenta = new Cuenta();
        System.out.println("Proporciona el numero de cuenta");
        cuenta.setNumeroCuenta(sc.nextInt());
        System.out.println("Proporciona el DNI");
        cuenta.setDNI(sc.nextInt());
        System.out.println("Proporciona el saldo actual");
        cuenta.setSaldoActual(sc.nextDouble());
        System.out.println("Proporciona tu interes");
        cuenta.setInteres(sc.nextDouble());
        return cuenta;
    }

    public static void ingresarDinero(double ingreso, Cuenta cuenta){
        cuenta.setSaldoActual(ingreso + cuenta.getSaldoActual());

    }

    public static double ingresarDinero2(double ingreso, Cuenta cuenta){
        return (cuenta.getSaldoActual() + ingreso);
    }

    public static double ingresarDinero(double ingreso){
        return ingreso;
    }

    public static void retirarDinero(double retiro, Cuenta cuenta){
        cuenta.setSaldoActual(cuenta.getSaldoActual() - retiro );
    }

    public static void extraccionRapida(Cuenta cuenta){
        cuenta.setSaldoActual(cuenta.getSaldoActual()*.8);

    }

    public static void consultarSaldo(Cuenta cuenta){
        System.out.println("Su saldo es: " + cuenta.getSaldoActual());


    }
    public static void mostrarDatos(Cuenta cuenta){
        System.out.println(cuenta.toString());
    }
}
