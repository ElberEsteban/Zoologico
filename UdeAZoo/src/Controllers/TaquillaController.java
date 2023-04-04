/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Controllers;

import Models.Taquilla;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
//import com.google.gson.Gson;
//import com.google.gson.GsonBuilder;
//import com.google.gson.reflect.TypeToken;
//import java.io.FileReader;
//import java.io.FileWriter;
//import java.io.PrintWriter;
//import java.io.Reader;
//import java.lang.ProcessBuilder.Redirect.Type;
//import java.util.ArrayList;
//import java.util.List;


/**
 * FXML Controller class
 *
 * @author Familia Henao
 */
public class TaquillaController implements Initializable {      
        
    protected Taquilla taquilla;
    
    @FXML
    private TextField lblIdCaja, lblNombreTaquillero;
    
    @FXML
    private AnchorPane contentView;
    
    @FXML       
    private Button btnCancelarView; 
    
    public TaquillaController(){
        this.taquilla = new Taquilla();
    }
    
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        this.lblIdCaja.setText(taquilla.getTaquillero().getId());
        this.lblNombreTaquillero.setText(taquilla.getTaquillero().getNombre());
        
//        String info = "";        
//        String path = "src/Datos/taquilla.json";
//        
//         try (PrintWriter out = new PrintWriter(new FileWriter(path))) {
//            Gson gson = new GsonBuilder().setPrettyPrinting().create();     
//            info = gson.toJson(taquilla);          
//             
//            //Gson gson = new Gson();
//            //String jsonString = gson.toJson(info);
//            out.write(info);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }         
//       
//     String datos = info;    
//     Gson dos = new Gson();
//         Taquilla taquillas = dos.fromJson(datos, Taquilla.class);
//
//         System.out.println(taquillas.getTaquillero().getNombre()); 
        
     }

    @FXML
    public void registrarClienteView() throws IOException {
        cargarVentanaEnContentView("/Views/RegistroClienteView.fxml");
    }
    @FXML
    public void registrarVentaView() throws IOException {
        cargarVentanaEnContentView("/Views/RegistroVentaView.fxml");
    }
    @FXML
    public void registrarAbonoView() throws IOException {
        cargarVentanaEnContentView("/Views/RegistroAbonoView.fxml");
    }
    @FXML
    public void consultarVisitaView() throws IOException {
        cargarVentanaEnContentView("/Views/ConsultaVisitaView.fxml");
    }
    @FXML
    public void consultarVentaView() throws IOException {
        cargarVentanaEnContentView("/Views/ConsultaVentaView.fxml");
    }
    public void cargarVentanaEnContentView(String url) throws IOException {
        AnchorPane fxmlView = FXMLLoader.load(getClass().getResource(url));
        contentView.getChildren().setAll(fxmlView);
        this.btnCancelarView.setVisible(true);
    }
    
    public void mensajeView(String titulo, String contenido, Alert.AlertType alertType){
        Alert dialogoView = new Alert(alertType);
        dialogoView.setTitle(titulo);
        dialogoView.setHeaderText(contenido);
        dialogoView.showAndWait();
    }
    @FXML
    public void cerrarContentViewSecundario(){
        this.contentView.getChildren().clear();
        this.btnCancelarView.setVisible(false);
    }        

}
