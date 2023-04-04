/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

import Interface.Animal;

public class Ave implements Animal {

    private String pico;

    public Ave(String pico){
        this.pico = pico;
    }

    public Ave(){}

    public void volar(){
        System.out.println("El ave está volando");
    }

    @Override
    public void dormir(){
        System.out.println("El ave está durmiendo");
    }

    @Override
    public void comer(){
        System.out.println("El ave está comiendo");
    }

}
