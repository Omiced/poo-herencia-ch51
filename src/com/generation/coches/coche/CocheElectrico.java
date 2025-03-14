package com.generation.coches.coche;

public class CocheElectrico extends Coche{
    private int capacidadBateria;
    private String tipoCarga;
    private int voltaje;
    private int autonimiaKilometros;
    private float porcentajeCarga;

    public CocheElectrico(int numLlantas, int numAsientos, Boolean tieneCajuela, String tipoMotor, String marca, String modelo,
                          String carroceria, String tipoTransmicion, int numPuertas, int numVentanas, String color,
                          int velocidadActual, int capacidadBateria, String tipoCarga, int voltaje, float porcentajeCarga) {
        super(numLlantas, numAsientos, tieneCajuela, tipoMotor, marca, modelo, carroceria, tipoTransmicion, numPuertas, numVentanas,
                color, velocidadActual);
        this.capacidadBateria = capacidadBateria;
        this.tipoCarga = tipoCarga;
        this.voltaje = voltaje;
        this.porcentajeCarga = porcentajeCarga;
    }

    public int getCapacidadBateria() {
        return capacidadBateria;
    }

    public void setCapacidadBateria(int capacidadBateria) {
        this.capacidadBateria = capacidadBateria;
    }

    public String getTipoCarga() {
        return tipoCarga;
    }

    public void setTipoCarga(String tipoCarga) {
        this.tipoCarga = tipoCarga;
    }

    public int getVoltaje() {
        return voltaje;
    }

    public void setVoltaje(int voltaje) {
        this.voltaje = voltaje;
    }

    public int getAutonimiaKilometros() {
        return autonimiaKilometros;
    }

    public void setAutonimiaKilometros(int autonimiaKilometros) {
        this.autonimiaKilometros = autonimiaKilometros;
    }

    public float getPorcentajeCarga(){
        return this.porcentajeCarga;
    }

    public void setPorcentajeCarga(float porcentajeCarga){
        this.porcentajeCarga = porcentajeCarga;
    }

    public void cargar(){
        if(porcentajeCarga == 100) {
            System.out.println("Tienes la bateria al maximo");
        }else{
            this.setPorcentajeCarga(this.getPorcentajeCarga() + (100 - this.getPorcentajeCarga()));
        }
    }
}
