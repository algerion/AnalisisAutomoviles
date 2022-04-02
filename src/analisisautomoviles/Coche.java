/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package analisisautomoviles;

/**
 *
 * @author Angel
 */
public class Coche {
    //Atributos
    public boolean prende, luz_delantera, luz_trasera;
    private boolean movimiento;
    public double kilometraje;
    private Direccionales direccionales;
    public double velocidad;
    public long time_milis;
    
    //Constructor
    /**
     */
    public Coche(){
        this.velocidad = 0.0;
        this.direccionales = Direccionales.APAGADAS;
        this.kilometraje = 0;
        this.luz_delantera = false;
        this.luz_trasera = false;
        this.prende = false;
        this.movimiento = false;
    }
    
    //Getters y Setters
    public void setMovimiento(boolean movimiento) {
        this.movimiento = movimiento;
        if(!this.prende) //this.prende != true
            this.movimiento = false;
    }

    public boolean isMovimiento() {
        return movimiento;
    }

    public String getDireccionales() {
        return direccionales.getEstado();
    }
    
    public void setDireccionales(int direccionales){
        if(direccionales < Direccionales.values().length){
            for(Direccionales d : Direccionales.values())
                if(direccionales == d.ordinal())
                    this.direccionales = d;
        } else
            this.direccionales = Direccionales.APAGADAS;
    }

    public void setDireccionales(Direccionales direccionales){
        this.direccionales = direccionales;
    }

    //Otros métodos
    public String acelerar(double metros_seg, double segundos){
        if(this.prende && metros_seg > 0 && segundos > 0){
            this.movimiento = true;
            this.velocidad = metros_seg;
            this.kilometraje += metros_seg * segundos;// v=d/t d = vt acumulador  
            return "";
        } else
            return "No puede acelerar, el vehículo está apagado o algún argumento es cero";
    }

    //toString
    @Override
    public String toString(){
        return "El coche está " + (this.prende ? "encendido" : "apagado") +
            "\nEl coche está " + (this.movimiento ? "en movimiento" : "detenido") +
            "\nEl kilometraje es " + this.kilometraje + " m" +
            "\nLa velocidad es " + this.velocidad + " m/s" +
            "\nLa luz delantera está " + (this.luz_delantera ? "encendida" : "apagada") +
            "\nLa luz trasera está " + (this.luz_trasera ? "encendida" : "apagada") +
            "\nLas direccionales están " + this.getDireccionales();
    }
}
