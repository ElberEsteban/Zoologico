/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Controllers;

import Models.Cliente;
import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;


public class RegistroClienteController extends TaquillaController implements Initializable {

    @FXML
    private TextField tfdIdentificacionCliente, tfdNombreCliente, tfdSaldoCliente;
    @FXML
    private CheckBox checkSocio;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
    
    @FXML
    public void registrarCliente(){
        agregarClienteALista();
        mensajeView("Registro de Clientes","El Cliente ha sido registrado", Alert.AlertType.INFORMATION);
        limpiarCamposRegistroClienteView();
    }
    
    private void agregarClienteALista(){  
        taquilla.getClientes().add(
            new Cliente(
                    this.tfdIdentificacionCliente.getText(),
                    this.tfdNombreCliente.getText(),
                    this.checkSocio.isSelected(),
                    this.tfdSaldoCliente.getText(),
                    0,
                    null,
                    0));

        List<Cliente> clientes = taquilla.getClientes();
        for(Cliente cliente : clientes){
            System.out.println(cliente.getNombre());
        }

    }
    
    @FXML
    private void limpiarCamposRegistroClienteView(){
        this.tfdIdentificacionCliente.setText("");
        this.tfdNombreCliente.setText("");
        this.tfdSaldoCliente.setText("");
        this.checkSocio.setSelected(false);
        this.tfdIdentificacionCliente.requestFocus();
    }
    
    @FXML
    private void cancelarRegistroClienteView() throws IOException {
        System.out.println("Cancalado registro cliente");
    }
    
}
