/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diagramadeflujo;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author Daniel
 */
public class Ventana extends Stage{
    StackPane root;
    Figuras figuras,proceso,entradaSalida,documento,inicioFin,lineaFlujo;
    public Ventana() {
        root = new StackPane();
        Scene scene = new Scene(root, 1000,700);
        
       figuras = new Figuras() {
            @Override
            public VBox crearFigura() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        };
        
        proceso = new Fproceso();
        entradaSalida = new FentradaSalida();
        documento = new Fdocumento();
        inicioFin = new FinicioFin();
        lineaFlujo = new LineaFlujo();
        
        lineaFlujo.crearFigura();
        inicioFin.crearFigura();
        documento.crearFigura();
        entradaSalida.crearFigura();
        proceso.crearFigura();
        
        agregarFigura(inicioFin);
        agregarFigura(entradaSalida);
        agregarFigura(proceso);
        agregarFigura(documento);
        agregarFigura(lineaFlujo);
        
        
        this.elementos();
        this.setScene(scene);
    }
    public void agregarFigura(Figuras f){
        Figuras aux = figuras;
        while(aux.getSiguiente() != null){
            aux = aux.getSiguiente();
        }
        aux.setSiguiente(f);
        
    }
    public void elementos(){
        VBox vb = new VBox();
        vb.getChildren().addAll(proceso.getCaja(),entradaSalida.getCaja(),documento.getCaja(),inicioFin.getCaja(),lineaFlujo.getCaja());
        
        vb.setPadding(new Insets(20, 0, 0, 20));
        vb.setSpacing(10);
        
        root.getChildren().addAll(vb);
    }

    public Figuras getFiguras() {
        return figuras;
    }
    
    // se subio el repositorio?
    
}
