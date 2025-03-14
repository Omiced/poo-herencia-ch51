package com.generation.coches.coche2;

public interface Restaurante {
    public static final String COMIDA = "pollo";
    public static final int NUM_MESAS= 2;

    public static final int PRECIO_POLLO = 10;
    public String hornear();
    public String freir();
    public int getCuenta();
    public String crearComida();
}
