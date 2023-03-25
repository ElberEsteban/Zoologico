/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import Interfaces.Animal;

/**
 *
 * @author carlos.henao
 */
public class Taquilla {
    
    private int id;
    private Taquillero taquillero;
    private List<Cliente> clientes;
    private List<Plan> plan;
    private List<Venta> ventas;    
    
    public Taquilla(){
        this.id = 1;
        taquillero = new Taquillero(1,"Elber Esteban");
        clientes = obtenerClientes();
        plan = obtenerPlanes();
    }
    
    public List<Cliente> obtenerClientes(){       
        List<Cliente> cte = new ArrayList<>();   
        cte.add(new Cliente(1,"Elber González",true,100000,0,null,0));
        cte.add(new Cliente(2,"Carlos Henao",false,0,0,null,0));
        cte.add(new Cliente(3,"Margot López",false,0,0,null,0)); 
        return cte;
    }
    
    public List<Plan> obtenerPlanes(){                                    
        List<Plan> pln = new ArrayList<>();
        pln.add(new Plan(1,"Individual",50000,1,false,false,false,0));
        pln.add(new Plan(2,"Familiar",100000,4,false,true,false,1));
        pln.add(new Plan(3,"Institucional",2000000,15,true,true,false,2));
        pln.add(new Plan(4,"Menbresia",25000,4,false,true,false,2));
        pln.add(new Plan(5,"Cumpleaños",35000,1,false,true,true,1));
        return pln;
    }
    
    public List<Venta> obtenerVentas(){
        List<Venta> vta = new ArrayList<>();
        vta.add(new Venta(1,"Individual",50000, new Date(123,03,01,8,0,50),"Elber González",1,"Elber Esteban"));
        vta.add(new Venta(2,"Familiar",200000, new Date(123,03,01,8,5,30),"Carlos Henao",1,"Elber Esteban"));
        vta.add(new Venta(3,"Cumpleaños",35000,new Date(123,03,02,8,7,0),"Margot López",1,"Elber Esteban"));
        vta.add(new Venta(4,"Individual",50000,new Date(123,03,02,9,0,0),"Carlos Henao",1,"Elber Esteban"));
        return vta;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Taquillero getTaquillero() {
        return taquillero;
    }

    public void setTaquillero(Taquillero taquillero) {
        this.taquillero = taquillero;
    }

    public List<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(List<Cliente> clientes) {
        this.clientes = clientes;
    }

    public List<Plan> getPlan() {
        return plan;
    }

    public void setPlan(List<Plan> plan) {
        this.plan = plan;
    }

    public List<Venta> getVentas() {
        return ventas;
    }

    public void setVentas(List<Venta> ventas) {
        this.ventas = ventas;
    }
    
}
