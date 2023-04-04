/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

import java.util.Date;

public class Venta {
    
    private int id;
    private String plan;
    private double costo;
    private Date fecha;
    private String nombreCliente;
    private int taquilla;
    private String nombreTaquillero;
    
    public Venta(int id, String plan, double costo, Date fecha,  String nombreCliente, int taquilla, String nombreTaquillero){
        this.id = id;
        this.plan = plan;
        this.costo = costo;
        this.fecha = fecha;
        this.nombreCliente = nombreCliente;
        this.taquilla = taquilla;
        this.nombreTaquillero = nombreTaquillero;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public int getTaquilla() {
        return taquilla;
    }

    public void setTaquilla(int taquilla) {
        this.taquilla = taquilla;
    }

    public String getNombreTaquillero() {
        return nombreTaquillero;
    }

    public void setNombreTaquillero(String nombreTaquillero) {
        this.nombreTaquillero = nombreTaquillero;
    }

    public String getPlan() {
        return plan;
    }

    public void setPlan(String plan) {
        this.plan = plan;
    }
    
}
