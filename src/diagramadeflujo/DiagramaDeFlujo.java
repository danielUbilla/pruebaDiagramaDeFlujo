/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diagramadeflujo;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author Daniel
 */
public class DiagramaDeFlujo extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        // uahsiduahsiduhasdhhhhhhhhhhhhhh
        Ventana v = new Ventana();
        Sistema sis = new Sistema(v.getFiguras());
        sis.ejecucion();
        v.show();
        // aiusdhiausdhllllllllllllllllllll
        //asdasdd
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
