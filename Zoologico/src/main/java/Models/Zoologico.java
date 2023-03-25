/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Models;
import Models.Taquilla;

/**
 *
 * @author carlos.henao
 */
public class Zoologico {
    
    private String nombre;
    private Taquilla taquilla;
    
    public Zoologico(){
        this.nombre = "UdeAZoo";
        new Taquilla();
    }   

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Taquilla getTaquilla() {
        return taquilla;
    }

    public void setTaquilla(Taquilla taquilla) {
        this.taquilla = taquilla;
    }

}
