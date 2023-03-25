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
public class Reptil implements Animal {
    
    private String Osamenta;
    
    public Reptil(String osamenta){
        this.Osamenta = osamenta;
    }
    
    public Reptil(){}
    
    @Override
    public void comer() {
        System.out.println("El Reptil está durmiendo");
    }  

    @Override
    public void dormir() {
        System.out.println("El Reptil está comiendo");
    }
    
}
