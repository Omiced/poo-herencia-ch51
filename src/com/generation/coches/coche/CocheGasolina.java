package com.generation.coches.coche;

//extends nos dice de donde estamos heredando
public class CocheGasolina extends Coche{
    private int litrosGasolina;
    private Boolean tieneGasolina;
    private int numCilindros;
    private int capacidadTanque;
    private String tipoGasolina;
    private int cilindradaMotor;

    public CocheGasolina(int numLlantas, int numAsientos, Boolean tieneCajuela,
                         String tipoMotor, String marca, String modelo, String carroceria,
                         String tipoTransmicion, int numPuertas, int numVentanas,
                         String color, int velocidadActual, int litrosGasolina,
                         Boolean tieneGasolina, int numCilindros, int capacidadTanque,
                         String tipoGasolina, int cilindradaMotor) {
        super(numLlantas, numAsientos, tieneCajuela, tipoMotor, marca, modelo, carroceria, tipoTransmicion,
                numPuertas, numVentanas, color, velocidadActual);
        this.litrosGasolina = litrosGasolina;
        this.tieneGasolina = tieneGasolina;
        this.numCilindros = numCilindros;
        this.capacidadTanque = capacidadTanque;
        this.tipoGasolina = tipoGasolina;
        this.cilindradaMotor = cilindradaMotor;
    }

    public int getCilindradaMotor() {
        return cilindradaMotor;
    }

    public void setCilindradaMotor(int cilindradaMotor) {
        this.cilindradaMotor = cilindradaMotor;
    }

    public String getTipoGasolina() {
        return tipoGasolina;
    }

    public void setTipoGasolina(String tipoGasolina) {
        this.tipoGasolina = tipoGasolina;
    }

    public int getCapacidadTanque() {
        return capacidadTanque;
    }

    public void setCapacidadTanque(int capacidadTanque) {
        this.capacidadTanque = capacidadTanque;
    }

    public int getNumCilindros() {
        return numCilindros;
    }

    public void setNumCilindros(int numCilindros) {
        this.numCilindros = numCilindros;
    }

    public Boolean getTieneGasolina() {
        return tieneGasolina;
    }

    public void setTieneGasolina(Boolean tieneGasolina) {
        this.tieneGasolina = tieneGasolina;
    }

    public int getLitrosGasolina() {
        return litrosGasolina;
    }

    public void setLitrosGasolina(int litrosGasolina) {
        this.litrosGasolina = litrosGasolina;
    }

    public void llenarTanque(){
        if(this.capacidadTanque == this.litrosGasolina) System.out.println("Tu tanque ya esta lleno");
        if(this.capacidadTanque > this.litrosGasolina)this.setLitrosGasolina(this.getLitrosGasolina() + (this.capacidadTanque - this.litrosGasolina));
    }

    public void consumo(){
        this.setLitrosGasolina(this.getLitrosGasolina() - 1) ;
    }



}
