package com.example.mx.entidades;

public class Cuenta {
    private int numeroCuenta;
    private long DNI;
    private double saldoActual;
    private double  interes;

    public Cuenta() {
    }

    public Cuenta(int numeroCuenta, long DNI, double saldoActual, double interes) {
        this.numeroCuenta = numeroCuenta;
        this.DNI = DNI;
        this.saldoActual = saldoActual;
        this.interes = interes;
    }

    public double getInteres() {
        return interes;
    }

    public void setInteres(double interes) {
        this.interes = interes;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public long getDNI() {
        return DNI;
    }

    public void setDNI(long DNI) {
        this.DNI = DNI;
    }

    public double getSaldoActual() {
        return saldoActual;
    }

    public void setSaldoActual(double saldoActual) {
        this.saldoActual = saldoActual;
    }

    @Override
    public String toString() {
        return "Cuenta{" +
                "numeroCuenta=" + numeroCuenta +
                ", DNI=" + DNI +
                ", saldoActual=" + saldoActual +
                ", interes=" + interes +
                '}';
    }
}
