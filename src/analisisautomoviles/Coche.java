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
    private boolean prende, luz_delantera, luz_trasera;
    private boolean movimiento;
    private double kilometraje;
    private Direccionales direccionales;
    private double velocidad;

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
    public double getKilometraje() {
        return kilometraje;
    }

    public double getVelocidad() {
        return velocidad;
    }
/*
    public void setKilometraje(double kilometraje) {
        this.kilometraje = kilometraje;
    }
*/
    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }
    
    public boolean isMovimiento() {
        return movimiento;
    }
    
    public String estadoMovimiento(){
        return this.movimiento ? "en movimiento" : "detenido";
    }

    public void setMovimiento(boolean movimiento) {
        this.movimiento = movimiento;
        if(!this.prende) //this.prende != true
            this.movimiento = false;
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

    public boolean isCochePrendido() {
        return prende;
    }

    public String estadoCoche(){
        return (this.prende ? "encendido" : "apagado");
    }
    
    public boolean isLuzDelanteraEncendida() {
        return luz_delantera;
    }

    public String estadoLuzDelantera(){
        return (this.luz_delantera ? "encendida" : "apagada");
    }
    
    public boolean isLuzTraseraEncendida() {
        return luz_trasera;
    }

    public String estadoLuzTrasera(){
        return (this.luz_trasera ? "encendida" : "apagada");
    }
    
/*    
    public void setPrendeCoche(boolean prende) {
        this.prende = prende;
    }
    */
    public void enciendeCoche() {
        this.prende = true;
    }

    public void apagaCoche() {
        this.prende = false;
    }

    public void cambiaEstadoCoche() {
        this.prende = !this.prende;
    }

/*
    /**
     * Solo Dios y yo sabíamos para qué servía esta cosa, ahora, solo Dios lo sabe
     * @param delantera true para delantera, false para trasera
     * @param luz true para encendida, false para apagada
     *//*
    public void setLuz(boolean delantera, boolean luz) {
        if(delantera)
            this.luz_delantera = luz;
        else
            this.luz_trasera = luz;
    }

    public void setLuz_delantera(boolean luz_delantera) {
        this.luz_delantera = luz_delantera;
    }
*/
    //probar implementación con switch ... case
    public void enciendeLuzDelantera() {
        this.luz_delantera = true;
    }

    public void apagaLuzDelantera() {
        this.luz_delantera = false;
    }

    public void cambiaEstadoLuzDelantera() {
        this.luz_delantera = !this.luz_delantera;
    }

/*
    public void setLuz_trasera(boolean luz_trasera) {
        this.luz_trasera = luz_trasera;
    }
*/  
    public void enciendeLuzTrasera() {
        this.luz_trasera = true;
    }

    public void apagaLuzTrasera() {
        this.luz_trasera = false;
    }

    public void cambiaEstadoLuzTrasera() {
        this.luz_trasera = !this.luz_trasera;
    }

    //Otros métodos
    public String acelerar(){
        if(this.prende){
            this.movimiento = true;
            this.velocidad = 5;
            this.kilometraje += this.velocidad; //Aceleración instantánea de 1 segundo
            return "";
        } else
            return "No puede acelerar, el vehículo está apagado o algún argumento es cero";
    }

    public String acelerar(double segundos){
        if(this.prende && segundos > 0){
            this.movimiento = true;
            this.velocidad = 5;
            this.kilometraje += this.velocidad * segundos;// v=d/t d = vt acumulador  
            return "";
        } else
            return "No puede acelerar, el vehículo está apagado o algún argumento es cero";
    }

    public String acelerar(double metros_seg, double segundos){
        if(this.prende && metros_seg > 0 && segundos > 0){
            this.movimiento = true;
            this.velocidad = metros_seg;
            this.kilometraje += this.velocidad * segundos;// v=d/t d = vt acumulador  
            return "";
        } else
            return "No puede acelerar, el vehículo está apagado o algún argumento es cero";
    }

    //toString
    @Override
    public String toString(){
        return "El coche está " + this.estadoCoche() +
            "\nEl coche está " + this.estadoMovimiento() +
            "\nEl kilometraje es " + this.kilometraje + " m" +
            "\nLa velocidad es " + this.velocidad + " m/s" +
            "\nLa luz delantera está " + this.estadoLuzDelantera() +
            "\nLa luz trasera está " + this.estadoLuzTrasera() +
            "\nLas direccionales están " + this.getDireccionales();
    }
}
