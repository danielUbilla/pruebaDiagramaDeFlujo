/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diagramadeflujo;

import javafx.scene.layout.VBox;
import javafx.scene.shape.Line;

/**
 *
 * @author Daniel
 */
public class LineaFlujo extends Figuras{

    @Override
    public VBox crearFigura() {
        
        Line l1 = new Line(0,20,10,10);
        Line l2 = new Line(0,20,90,20);
        Line l3 = new Line(0,20,10,30);
        
        super.getCaja().getChildren().addAll(l1,l2,l3);
        return super.getCaja();
    }
    
}
