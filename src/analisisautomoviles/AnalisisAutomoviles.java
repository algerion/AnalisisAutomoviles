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
public class AnalisisAutomoviles {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Coche c1 = new Coche();
        String acelera;
        double velocidad = Double.parseDouble(JOptionPane.showInputDialog("Velocidad:"));
        double tiempo = Double.parseDouble(JOptionPane.showInputDialog("Tiempo:"));
        c1.prende = true;
        acelera = c1.acelerar(velocidad, tiempo);
        if(!acelera.equals(""))
            JOptionPane.showMessageDialog(null, acelera, "Error", 
                    JOptionPane.ERROR_MESSAGE);
        JOptionPane.showMessageDialog(null, c1, "Info", JOptionPane.INFORMATION_MESSAGE);
    }
    
}
