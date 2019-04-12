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
public class FentradaSalida extends Figuras{

    @Override
    public VBox crearFigura() {
        int largo = 100 , ancho = 50 , inclinacion = 20;
        
        Line l1 = new Line(0, 0, largo-inclinacion, 0);
        l1.setTranslateX(inclinacion);
        HBox hb = new HBox();
        Line l2 = new Line(inclinacion, 0, 0, ancho);
        Line l3 = new Line(largo, 0,largo-inclinacion, ancho);
        l3.setTranslateX(60);
        hb.getChildren().addAll(l2,l3);
        Line l4 = new Line(0, ancho, largo-inclinacion, ancho);
        
        super.getCaja().getChildren().addAll(l1,hb,l4);
        return super.getCaja();
    }
    
}
