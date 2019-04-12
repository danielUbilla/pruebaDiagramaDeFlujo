/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diagramadeflujo;

import javafx.event.EventHandler;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.VBox;

/**
 *
 * @author Daniel
 */
public class Sistema {

    Figuras f;
    
    public Sistema(Figuras f) {
        this.f = f;
    }
    
    public void ejecucion(){
        Figuras aux = f;
        while( aux.getSiguiente() != null){
            aux.getSiguiente().getCaja().setOnMouseDragEntered(new EventHandler<MouseEvent>(){

            @Override
            public void handle(MouseEvent event) {
                System.out.println(" ( "+event.getX()+" , "+event.getY()+" ) ");
            }

        });
        }
    }
    
    
    
}
