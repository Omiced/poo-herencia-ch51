package com.generation.coches.coche2;

public class SubWay implements Restaurante{

    @Override
    public String hornear() {

        return "Horneaste unos panes de ajo";
    }

    @Override
    public String freir() {
        return "No hay nada que freir";
    }

    @Override
    public int getCuenta() {
        return 200;
    }

    @Override
    public String crearComida() {
        return "Creaste un subway de pollo con penino";
    }
}
