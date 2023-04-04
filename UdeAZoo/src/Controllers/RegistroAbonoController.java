/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Controllers;

import Models.Cliente;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

/**
 * FXML Controller class
 *
 * @author Familia Henao
 */
public class RegistroAbonoController extends TaquillaController implements Initializable {


    @FXML
    private ComboBox cmbListaClienteAbono;
    @FXML
    private TextField tfdValorabono, tfdValorSaldo;

    @FXML
    private DatePicker tfdFechaAbono;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        //cargarListadoClientes();
    }

    private void cargarListadoClientes(){
//        ObservableList<Cliente> clientes = FXCollections.observableList(taquilla.getClientes());
//        for(Cliente cliente : clientes){
//            this.cmbListaClienteAbono.getItems().add(cliente.getNombre());
//        }
    }

    @FXML
    private void cancelarAbonoView(){
        
    }   
    
}
