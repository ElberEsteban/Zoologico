/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */
package Controllers;

import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author Familia Henao
 */
public class Program extends Application {    
    
    @Override
    public void start(Stage primaryStage) throws IOException {
        
        FXMLLoader fxmlLoader = new FXMLLoader(Program.class.getResource("/Views/TaquillaView.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        primaryStage.setTitle("UdeAZoo");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
