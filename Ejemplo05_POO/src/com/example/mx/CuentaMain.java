package com.example.mx;

import com.example.mx.entidades.Cuenta;
import com.example.mx.servicios.CuentaServicio;

public class CuentaMain {

    public static void main(String[] args){

        Cuenta cuenta = CuentaServicio.crearCuenta();
        CuentaServicio.ingresarDinero(100.4, cuenta);
        CuentaServicio.retirarDinero(50, cuenta);
        CuentaServicio.extraccionRapida(cuenta);
        CuentaServicio.consultarSaldo(cuenta);
        CuentaServicio.mostrarDatos(cuenta);

        cuenta.setSaldoActual(CuentaServicio.ingresarDinero2(100, cuenta));
        cuenta.setSaldoActual(CuentaServicio.ingresarDinero(100.2) + cuenta.getSaldoActual());
    }
}
