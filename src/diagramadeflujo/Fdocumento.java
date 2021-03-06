package diagramadeflujo;

import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.CubicCurve;
import javafx.scene.shape.Line;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Daniel
 */
public class Fdocumento extends Figuras{

    @Override
    public VBox crearFigura() {
        
        int largo = 100 , ancho = 50 ;
        
        Line l1 = new Line(0,0,largo,0);
        HBox hb = new HBox();
        Line l2 = new Line(0,0,0,ancho);
        Line l3 = new Line(largo,0,largo,ancho);
        l3.setTranslateX(largo);
        hb.getChildren().addAll(l2,l3);
        CubicCurve curve = new CubicCurve(0, ancho, 45,100 , 60,0, largo, ancho);
        curve.setTranslateY(-15);
        curve.setFill(null); 
        curve.setStroke(Color.BLACK);
        
        super.getCaja().getChildren().addAll(l1,hb,curve);
        return super.getCaja();
        
    }
    
}
