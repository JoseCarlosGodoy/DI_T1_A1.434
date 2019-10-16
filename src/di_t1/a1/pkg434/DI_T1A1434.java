/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package di_t1.a1.pkg434;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author usuario
 */
public class DI_T1A1434 extends Application {
    
    @Override
    public void start(Stage primaryStage) {
      
       Text t=new Text("Programming is fun");
        Pane p=new Pane();
        p.getChildren().add(t);
        Scene scene = new Scene(p, 300, 250);
       
        primaryStage.setTitle("Ejercicio 434");
        primaryStage.setScene(scene);
        primaryStage.show();
        
       
        t.setOnMouseDragged(e->{
            
            t.setY(e.getY());
            t.setX(e.getX());
        });  
    }
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
