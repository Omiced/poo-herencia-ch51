package com.generation.coches.coche2;

public class KFC implements Restaurante{

    @Override
    public String hornear() {
        return "honeraste papas";
    }

    @Override
    public String freir() {
        return "Freiste pollo";
    }

    @Override
    public int getCuenta() {
        return 500;
    }

    @Override
    public String crearComida() {
        return "Creaste una cubeta de 12 piezas";
    }
}
