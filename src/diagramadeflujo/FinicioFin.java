/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diagramadeflujo;

import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.CubicCurve;
import javafx.scene.shape.Line;

/**
 *
 * @author Daniel
 */
public class FinicioFin extends Figuras{

    @Override
    public VBox crearFigura() {
        int largo = 100 , ancho = 50 ;
        
        Line l1 = new Line(0, 0, largo-20, 0);
        
        HBox hb = new HBox();
        CubicCurve curve1 = new CubicCurve(0, 0, 0,0, -40,20, 0, ancho);
        CubicCurve curve2 = new CubicCurve(0, 0, 0, 0, 40,20, 0, ancho);
        curve2.setTranslateX(largo-20);
        curve1.setFill(null); 
        curve1.setStroke(Color.BLACK);
        curve2.setFill(null); 
        curve2.setStroke(Color.BLACK);
        
        hb.getChildren().addAll(curve1,curve2);
        
        Line l2 = new Line(0, ancho, largo-20, ancho);
        
        l1.setTranslateX(20);
        l2.setTranslateX(20);
        
        super.getCaja().getChildren().addAll(l1,hb,l2);
        return super.getCaja();
    }
    
}
