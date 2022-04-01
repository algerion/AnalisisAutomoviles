/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package analisisautomoviles;

import javax.swing.JOptionPane;

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
//        try {
            Coche c1 = new Coche();
//            c1.setDireccionales(4);
            c1.setDireccionales(1);
            c1.setDireccionales(Direccionales.DERECHA);
            c1.acelerar();
//            sleep(5000);
            c1.acelerar();
            System.out.println("El coche está " + (c1.prende ? "encendido" : "apagado"));
            System.out.println("El kilometraje es " + c1.kilometraje + " m");
            System.out.println("La velocidad es " + c1.velocidad + " m/s");
            System.out.println("El coche está " + (c1.movimiento ? "en movimiento" : "detenido"));
            System.out.println("La luz delantera está " + (c1.luz_delantera ? "encendida" : "apagada"));
            System.out.println("La luz trasera está " + (c1.luz_trasera ? "encendida" : "apagada"));
            System.out.println("Las direccionales están " + c1.getDireccionales());
  /*      } catch (InterruptedException ex) {
            System.out.println("Interrumpido");
        }*/
    }
    
}
