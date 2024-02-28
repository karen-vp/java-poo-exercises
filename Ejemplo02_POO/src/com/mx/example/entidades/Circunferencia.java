package com.mx.example.entidades;

public class Circunferencia {

    private Double radio;

    // Constructor vacio
    public Circunferencia(){

    }
    public Circunferencia(Double radio){
        this.radio = radio;
    }

    // Getter Stter
    public Double getRadio(){
        return radio;
    }

    public void setRadio(Double radio){
        this.radio = radio;
    }

    @Override
    public String toString(){
        return "Circunferencia{ " + "\n" +
                "Radio: " + radio +
                " }";
    }
}
