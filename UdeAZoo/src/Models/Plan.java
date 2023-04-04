/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

import Interface.Animal;
import java.util.ArrayList;
import java.util.List;

public class Plan {

    private int id;
    private String nombre;
    private String precio;
    private int cupo;
    private boolean guia;
    private boolean alimentacion;
    private boolean  obsequio;
    private Recorrido recorrido;

    public Plan(int id, String nombre, String precio, int cupo, boolean guia, boolean alimentacion, boolean obsequio, int idRecorrido){
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.cupo = cupo;
        this.guia = guia;
        this.alimentacion = alimentacion;
        this.obsequio = obsequio;
        this.recorrido = obtenerRecorrido(idRecorrido);
    }

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

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {  this.precio = precio; }

    public int getCupo() {
        return cupo;
    }

    public void setCupo(int cupo) {
        this.cupo = cupo;
    }

    public boolean isGuia() {
        return guia;
    }

    public void setGuia(boolean guia) {
        this.guia = guia;
    }

    public boolean isAlimentacion() {
        return alimentacion;
    }

    public void setAlimentacion(boolean alimentacion) {
        this.alimentacion = alimentacion;
    }

    public boolean isObsequio() {
        return obsequio;
    }

    public void setObsequio(boolean obsequio) {
        this.obsequio = obsequio;
    }

    public Recorrido getRecorrido() {
        return recorrido;
    }

    public void setRecorrido(Recorrido recorrido) {
        this.recorrido = recorrido;
    }

    public Recorrido obtenerRecorrido(int id){
        List<Recorrido> rdo = new ArrayList<>();
        List<Animal> animales = new ArrayList<>();
        animales.add((Animal) new Ave());
        animales.add((Animal) new Mamifero());
        rdo.add( new Recorrido (1,"Bronce",animales));
        animales.add(new Reptil());
        rdo.add( new Recorrido (1,"Plata",animales));
        animales.add((Animal) new Anfibio());
        rdo.add( new Recorrido (1,"Oro",animales));
        return rdo.get(id);
    }

}