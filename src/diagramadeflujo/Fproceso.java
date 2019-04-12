/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diagramadeflujo;

import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Line;

/**
 *
 * @author Daniel
 */
public class Fproceso extends Figuras{

    @Override
    public VBox crearFigura() {
        
        int largo = 100 , ancho = 50 ;
        
        Line l1 = new Line(0, 0, largo, 0);
        HBox hb = new HBox();
        Line l2 = new Line(0, 0, 0, ancho);
        Line l3 = new Line(largo, 0,largo, ancho);
        l3.setTranslateX(largo);
        hb.getChildren().addAll(l2,l3);
        Line l4 = new Line(0, ancho, largo, ancho);
        
        super.getCaja().getChildren().addAll(l1,hb,l4);
        return super.getCaja();
    }
    
}
