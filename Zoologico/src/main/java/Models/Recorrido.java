/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;
import Interfaces.Animal;
import java.util.List;

/**
 *
 * @author carlos.henao
 */
public class Recorrido {
    
    private int id;
    private String nombre;
    private List<Animal> animal;
    
    public Recorrido(int id, String nombre, List<Animal> animal){
        this.id = id;
        this.nombre = nombre;        
        this.animal = animal;
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

    public List<Animal> getAnimal() {
        return animal;
    }

    public void setAnimal(List<Animal> animal) {
        this.animal = animal;
    }
    
}
