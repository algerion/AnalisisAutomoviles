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
public class AnalisisAutomoviles extends Thread{
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        AnalisisAutomoviles x = new AnalisisAutomoviles();
        x.start();
    }

    public void run() {
        try {
            Coche c1 = new Coche();
            c1.velocidad = 0.0;
            c1.direccionales = 0;
            c1.kilometraje = 0;
            c1.luz_delantera = false;
            c1.luz_trasera = false;
            c1.prende = false;
            c1.movimiento = false;
            if(!c1.prende) //c1.prende != true
                c1.movimiento = false;
            c1.acelerar();
            sleep(5000);
            c1.acelerar();
            System.out.println("El coche está " + (c1.prende ? "encendido" : "apagado"));
            System.out.println("El kilometraje es " + c1.kilometraje + " m");
            System.out.println("La velocidad es " + c1.velocidad + " m/s");
            System.out.println("El coche está " + (c1.movimiento ? "en movimiento" : "detenido"));
            System.out.println("La luz delantera está " + (c1.luz_delantera ? "encendida" : "apagada"));
            System.out.println("La luz trasera está " + (c1.luz_trasera ? "encendida" : "apagada"));
            System.out.println("Las direccionales están " + (c1.direccionales == 3 ? "en intermitencia" :
                    c1.direccionales == 1 ? "a la izquierda" : c1.direccionales == 2 ? "a la derecha"
                    : "apagadas"));
        } catch (InterruptedException ex) {
            System.out.println("Interrumpido");
        }
    }
    
}
