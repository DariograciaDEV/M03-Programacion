/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PatrullaCanina;

/**
 *
 * @author dagr5755
 */
public class Policia extends Gos {
    
    public Policia(String nom, int energia, int hidratacio) {
        super(nom, energia, hidratacio);
        this.energia = 10;
        this.hidratacio=20;
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
    
    
    
    public void detenir(int energia, int hidratacio){
        energia = this.energia - energia;
        hidratacio = this.hidratacio - hidratacio;
        System.out.println("El meu nom és: "+this.nom + "i estic: ");
    }

    
    
    
}
