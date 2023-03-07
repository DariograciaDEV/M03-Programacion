/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PatrullaCanina;

/**
 *
 * @author dagr5755
 */
public class Gos {

    protected String nom;
    protected int energia;
    protected int hidratacio;

    public Gos(String nom, int energia, int hidratacio) {
        this.nom = nom;
        this.energia = energia;
        this.hidratacio = hidratacio;
    }

    Gos(String nom, int posicio) {
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

    public void bordar(int energiaBordar, int hidraBordar) {
        energiaBordar = this.energia - 10;
        hidraBordar = this.hidratacio - 20;

        System.out.println("El gos: " + this.nom + "te d'energia: " + energiaBordar + "i" + hidraBordar + " d'hidratació");
    }

    public void menjar(int energiaMenjar) {
        if (this.energia < 200) {
            energiaMenjar = this.energia + 10;
        } else if (this.energia == 200) {
            System.out.println("L'energia esta ha tope");
        }
    }

    public void beure(int beure) {
        beure = this.hidratacio + 50;
        System.out.println(beure);
    }

    public void rescatar(int atribut1, int atribut2) {
        atribut1 = this.energia - 20;
        atribut2 = this.hidratacio - 30;
        System.out.println("El gos: " + this.nom + "S'ha quedat amb" + atribut1 + " d'energia i " + atribut2 + " d'hidratacio");
    }

    @Override
    public String toString() {
        return "Gos{" + "nom=" + nom + ", energia=" + energia + ", hidratacio=" + hidratacio + '}';
    }
    
    

}
