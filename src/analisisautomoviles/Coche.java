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
    public int direccionales;
    public double velocidad;
    public long time_milis;
    
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
}
