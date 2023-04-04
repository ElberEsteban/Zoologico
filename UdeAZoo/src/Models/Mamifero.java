/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

import Interface.Animal;

public class Mamifero implements Animal {

    private String desarrollo;

    public Mamifero(String desarrollo){
        this.desarrollo = desarrollo;
    }

    public Mamifero(){}

    @Override
    public void comer() {
        System.out.println("El mamífero está comiendo");
    }

    @Override
    public void dormir() {
        System.out.println("El mamífero está durmiendo");
    }

}
