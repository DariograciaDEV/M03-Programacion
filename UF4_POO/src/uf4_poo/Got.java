/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uf4_poo;

/**
 *
 * @author dagr5755
 */
public class Got {
    private String Material;
    private int Capacitat;
    private boolean ple;
    private int liquid_acutal;

    
    public Got (){
        this.Capacitat=75;
        this.Material="Fusta";
        this.ple=true;
    }
    
    
    
    public String getMaterial() {
        return Material;
    }

    public int getCapacitat() {
        return Capacitat;
    }

    public boolean isPle() {
        return ple;
    }

    public int getLiquid_acutal() {
        return liquid_acutal;
    }

    public void setMaterial(String Material) {
        this.Material = Material;
    }

    public void setCapacitat(int Capacitat) {
        this.Capacitat = Capacitat;
    }

    public void setPle(boolean ple) {
        this.ple = ple;
    }

    public void setLiquid_acutal(int liquid_acutal) {
        this.liquid_acutal = liquid_acutal;
    }

    public Got(String Material, int Capacitat, boolean ple, int liquid_acutal) {
        this.Material = Material;
        this.Capacitat = Capacitat;
        this.ple = ple;
        this.liquid_acutal = liquid_acutal;
    }
    
    
}
