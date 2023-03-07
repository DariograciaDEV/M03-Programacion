/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PatrullaCanina;

/**
 *
 * @author dagr5755
 */
public abstract class Nedador extends Gos implements NedadorInterface {

    public enum estil {
        Policia("CROL");
        private String estil;

        private estil(String estil) {
            this.estil = estil;
        }

    }

    public Nedador(String nom, int energia, int hidratacio) {
        super(nom, energia, hidratacio);
        this.energia = 100;
        this.hidratacio = 200;
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

    public abstract void Nedar();

}
