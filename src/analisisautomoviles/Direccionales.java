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
public enum Direccionales {
    APAGADAS("apagadas"), IZQUIERDA("a la izquierda"), DERECHA("a la derecha"), 
            INTERMITENTES("en intermitencia");
    private String estado;
    
    private Direccionales(String estado){
        this.estado = estado;
    }

    public String getEstado() {
        return estado;
    }
    
    
}
