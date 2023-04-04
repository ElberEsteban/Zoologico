/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

import java.util.Date;

public class Cliente {

    private String id;
    private String nombre;
    private boolean socio;
    private String saldo;
    private double abono;
    private Date fechaAbono;
    private int visita;

    public Cliente(String id, String nombre, boolean socio, String saldo, double abono, Date fechaAbono, int visita){
        this.id = id;
        this.nombre = nombre;
        this.socio = socio;
        this.saldo = saldo;
        this.abono = abono;
        this.fechaAbono = fechaAbono;
        this.visita = visita;
    }

    public Cliente(){}

    public String getId() {
        return id;
    }
    
    public void setId(String id) {
        this.id = id;
    }
    
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public boolean isSocio() {
        return socio;
    }
    public void setSocio(boolean socio) {
        this.socio = socio;
    }
    public String getSaldo() {
        return saldo;
    }
    
    public void setSaldo(String saldo) {
        this.saldo = saldo;
    }
    
    public double getAbono() {
        return abono;
    }
    
    public void setAbono(double abono) {
        this.abono = abono;
    }
    public Date getFechaAbono() {
        return fechaAbono;
    }
    
    public void setFechaAbono(Date fechaAbono) {
        this.fechaAbono = fechaAbono;
    }
    
    public int getVisita() {
        return visita;
    }
    
    public void setVisita(int visita) {
        this.visita = visita;
    } 
    
}
