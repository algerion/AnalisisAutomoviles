/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package analisisautomoviles;

import java.sql.Timestamp;

/**
 *
 * @author Angel
 */
public class Coche {
    public boolean prende, luz_delantera, luz_trasera, movimiento;
    public double kilometraje;
    public Direccionales direccionales;
    public double velocidad;
    public long time_milis;
    
    public Coche(){
        this.velocidad = 0.0;
        this.direccionales = Direccionales.APAGADAS;
        this.kilometraje = 0;
        this.luz_delantera = false;
        this.luz_trasera = false;
        this.prende = false;
        this.movimiento = false;
        /*
        if(!this.prende) //this.prende != true
            this.movimiento = false;
*/
    }
    
    public void acelerar(){
        long segundos, nuevo_time_milis = System.currentTimeMillis();
        
        velocidad += 5; //contador-acumulador
        if(nuevo_time_milis - time_milis != 0)
            segundos = (nuevo_time_milis - time_milis) / 1000;
        else
            segundos = 1;
        kilometraje += velocidad / segundos;// v=d/t d = vt acumulador  
        time_milis = System.currentTimeMillis();
    }

    public String getDireccionales() {
        return direccionales.getEstado();
    }
    
    public void setDireccionales(int direccionales){
        switch(direccionales){
            case 1:
                this.direccionales = Direccionales.IZQUIERDA;
                break;
            case 2:
                this.direccionales = Direccionales.DERECHA;
                break;
            case 3:
                this.direccionales = Direccionales.INTERMITENTES;
                break;
            default:
                this.direccionales = Direccionales.APAGADAS;
                break;
        }
    }
}
