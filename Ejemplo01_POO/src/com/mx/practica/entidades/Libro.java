package com.mx.practica.entidades;

public class Libro {
    //alcance tipoDato nombre.
    private String ISBN;
    private String autor;
    private String titulo;
    private int numeroPag;

   //contructor vacio
    public Libro(){

    }
//constructor con parametros
    public Libro(String ISBN, String titulo, int numeroPag, String autor){
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.numeroPag = numeroPag;
        this.autor = autor;
    }

    //Getters alcance tipoDato nombre (parametros) {cuerpo}
    public String getISBN(){
        return ISBN;
    }

    public String getAutor(){
        return autor;
    }

    public String getTitulo(){
        return titulo;
    }

    public int getNumeroPag(){
        return numeroPag;
    }

    //Setters

    public void setISBN(String ISBN){
        this.ISBN = ISBN;
    }

    public void setAutor(String autor){
        this.autor = autor;
    }

    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    public void setNumeroPag(int numeroPag){
        this.numeroPag = numeroPag;
    }

    // Sobreescribiendo el metodo toString para imprimir los atributos de
    // nuestro objeto
    @Override
    public String toString(){
        return "Libro{" +
                " ISBN: " + ISBN +
                " autor: " + autor +
                " titulo: " + titulo +
                " numero paginas: " + numeroPag +
                "}";
    }

}
