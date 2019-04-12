/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diagramadeflujo;

import javafx.scene.layout.VBox;

/**
 *
 * @author Daniel
 */
abstract public class Figuras {
    private Figuras siguiente;
    private VBox caja;

    public Figuras() {
        caja = new VBox();
        siguiente = null;
    }
    public void sigteNull(){
        siguiente = null;
    }
    
    abstract public VBox crearFigura();

    public VBox getCaja() {
        return caja;
    }

    public void setSiguiente(Figuras siguiente) {
        this.siguiente = siguiente;
    }

    public Figuras getSiguiente() {
        return siguiente;
    }
    
    
    
}
