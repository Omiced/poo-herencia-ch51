package com.generation.coches.coche;

public class Coche {
    protected int numLlantas;
   protected  int numAsientos;
   protected  String tipoMotor;
   protected  Boolean tieneCajuela;
   protected String marca;
   protected  String modelo;
   protected String carroceria;
   protected  String tipoTransmicion;
   protected int numPuertas;
   protected int numVentanas;
   protected String color;
   protected int velocidadActual;

    public Coche(int numLlantas, int numAsientos, Boolean tieneCajuela, String tipoMotor, String marca, String modelo, String carroceria, String tipoTransmicion, int numPuertas, int numVentanas, String color, int velocidadActual) {
        this.numLlantas = numLlantas;
        this.numAsientos = numAsientos;
        this.tieneCajuela = tieneCajuela;
        this.tipoMotor = tipoMotor;
        this.marca = marca;
        this.modelo = modelo;
        this.carroceria = carroceria;
        this.tipoTransmicion = tipoTransmicion;
        this.numPuertas = numPuertas;
        this.numVentanas = numVentanas;
        this.color = color;
        this.velocidadActual = velocidadActual;
    }

    public int getNumLlantas() {
        return numLlantas;
    }

    public void setNumLlantas(int numLlantas) {
        this.numLlantas = numLlantas;
    }

    public int getNumAsientos() {
        return numAsientos;
    }

    public void setNumAsientos(int numAsientos) {
        this.numAsientos = numAsientos;
    }

    public String getTipoMotor() {
        return tipoMotor;
    }

    public void setTipoMotor(String tipoMotor) {
        this.tipoMotor = tipoMotor;
    }

    public Boolean getTieneCajuela() {
        return tieneCajuela;
    }

    public void setTieneCajuela(Boolean tieneCajuela) {
        this.tieneCajuela = tieneCajuela;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCarroceria() {
        return carroceria;
    }

    public void setCarroceria(String carroceria) {
        this.carroceria = carroceria;
    }

    public String getTipoTransmicion() {
        return tipoTransmicion;
    }

    public void setTipoTransmicion(String tipoTransmicion) {
        this.tipoTransmicion = tipoTransmicion;
    }

    public int getNumPuertas() {
        return numPuertas;
    }

    public void setNumPuertas(int numPuertas) {
        this.numPuertas = numPuertas;
    }

    public int getNumVentanas() {
        return numVentanas;
    }

    public void setNumVentanas(int numVentanas) {
        this.numVentanas = numVentanas;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getVelocidadActual() {
        return velocidadActual;
    }

    public void setVelocidadActual(int velocidadActual){
        this.velocidadActual = velocidadActual;
    }

    public void acelerar(){
        //acelera 50km/h
        this.setVelocidadActual(50);
    }

    public String reversa(){
        return " Ahora vas en reversa";
    }

    public void frenar(int velocidadActual){
        if(velocidadActual == 0) System.out.println("No estas en movimiento");
        this.setVelocidadActual(0);
    }

    public void arrancanr(int velocidadActual){
        if (velocidadActual != 0) System.out.println("ya estas en movimiento");
        this.setVelocidadActual(10);
    }

    public String caracteristicas(){
        return "El carro de la marca " + this.marca + " tiene " + this.numAsientos + " asientos, "
                + this.numPuertas + " puertas y  " + this.numVentanas + " ventanas, es de color " + this.color;
    }

}
