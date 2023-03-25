/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;
import Interfaces.Animal;

/**
 *
 * @author carlos.henao
 */
public class Anfibio implements Animal{
    
    private String orden;
    
    @Override
    public void comer() {
        System.out.println("El anfibio está durmiendo");
    }  

    @Override
    public void dormir() {
        System.out.println("El anfibio está comiendo");
    }
    
}

