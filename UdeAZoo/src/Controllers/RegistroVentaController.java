/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Controllers;

import Models.Cliente;
import Models.Plan;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;

public class RegistroVentaController extends TaquillaController  implements Initializable {

    @FXML
    private DatePicker tfdFechaVenta;

    @FXML
    private ComboBox cmbListaClientes, cmbListaPlanes;

    @FXML
    private TextField tfdValorVenta;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        cargarListadoClientes();
        cargarListadoPlanes();       
    }

    private void cargarListadoClientes(){
        ObservableList<Cliente> clientes = FXCollections.observableList(taquilla.getClientes());
        for(Cliente cliente : clientes){
            this.cmbListaClientes.getItems().add(cliente.getNombre());
        }
    }

    private void cargarListadoPlanes(){
        ObservableList<Plan> planes = FXCollections.observableList(taquilla.getPlan());
        for(Plan plan : planes){
            this.cmbListaPlanes.getItems().add(plan.getNombre());
        }
    }

    @FXML
    private void fechaVentaViewseleccionada(){
        System.out.println(this.tfdFechaVenta.getValue());
    }

    @FXML
    private void clienteVentaViewSeleccionado(){
        System.out.println(this.cmbListaClientes.getValue());
    }

    @FXML
    private void planVentaViewSeleccionado(){
        this.tfdValorVenta.setText(calcularCostoVenta(this.cmbListaPlanes.getValue().toString()));
    }

    private String calcularCostoVenta(String tipoPlan){
      String precio = "";
        List<Plan> plan = taquilla.getPlan();
        for (Plan p : plan ){
            if(p.getNombre() == tipoPlan){
                precio = p.getPrecio();
                break;
            }
        }
       return precio;
    }
    
    @FXML
    private void cancelarVentaView(){}

    //DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
    // Date date = new Date();
    //System.out.println("Hora actual: " + dateFormat.format(date));
    
}

