/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;
import java.util.Date;

/**
 *
 * @author carlos.henao
 */
public class Cliente {
    
    private int id;
    private String nombre;
    private boolean socio;
    private double saldo;
    private double abono;
    private Date fechaAbono;
    private int visita;
    
    
    public Cliente(int id, String nombre, boolean socio, double saldo, double abono, Date fechaAbono, int visita){
        this.id = id;
        this.nombre = nombre;
        this.socio = socio;
        this.saldo = saldo;
        this.abono = abono;
        this.fechaAbono = fechaAbono;
        this.visita = visita;
    }
    
    public Cliente(){}
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
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

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
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
