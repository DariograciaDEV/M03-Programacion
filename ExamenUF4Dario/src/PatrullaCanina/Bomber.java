/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PatrullaCanina;

/**
 *
 * @author dagr5755
 */
public abstract class Bomber extends Gos implements NedadorInterface {

    public Bomber(String nom, int energia, int hidratacio) {
        super(nom, energia, hidratacio);
        this.energia = energia;
        this.hidratacio = hidratacio;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getEnergia() {
        return energia;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
    }

    public int getHidratacio() {
        return hidratacio;
    }

    public void setHidratacio(int hidratacio) {
        this.hidratacio = hidratacio;
    }

    
    
    public void nedar(){
        System.out.println("Estic nedant ");
    }

    public void apagarFoc(int atribut1, int atribut2) {
        atribut1 = this.energia-20;
        atribut2 = this.hidratacio- 20;
        System.out.println("Soc el: " + this.nom + "i estic apagant foc");
    }

}
