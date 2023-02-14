/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uf4_poo;

/**
 * Clase botella servira definir caracteristicas basicas 
 * @author dagr5755
 */
public class Ampolla {
    private String Material;
    private int Capacitat;
    private String tipus_liquid;
    private int any_caducitat;
    private boolean abierto;
    private int liquid_acutal;

    public Ampolla(){
    this.Capacitat=1000;
    this.Material="Vidre";
    this.abierto=false;
    
}
    // Setters informar a la botella el material que esta formada la botella.
    public void setMaterial(String Material_Ampolla) {
        if (Material_Ampolla.equalsIgnoreCase("Vidre")
               || Material_Ampolla.equalsIgnoreCase("Plastic"))
       {//materials valids
           //material = material_botella;
            this.Material = Material_Ampolla; //this = el objeto llamado
       }
       else
       {//si no es material valid
           System.out.println("El material" + Material_Ampolla + " no es valido."
                   + "Creamos una botella de Vidre");
           this.Material="Vidre";         

       }
    }

    public Ampolla(String Material, int Capacitat, String tipus_liquid, int any_caducitat, boolean abierto, int liquid_acutal) {
        this.Material = Material;
        this.Capacitat = Capacitat;
        this.tipus_liquid = tipus_liquid;
        this.any_caducitat = any_caducitat;
        this.abierto = abierto;
        this.liquid_acutal = liquid_acutal;
    }
    
    
    //Getters
    public String getMaterial() {
        return Material;
    }

    
    public void setCapacitat(int Capacitat) {
        this.Capacitat = Capacitat;
    }

    public void setTipus_liquid(String tipus_liquid) {
        
    }

    public void setAny_caducitat(int any_caducitat) {
        if (this.any_caducitat > 2024){
            System.out.println("És una ampolla nova");
        } else {
            System.out.println("És una ampolla antigua");
        }
            
    }

    public void setAbierto(boolean abierto) {
        if (abierto = false){
            System.out.println("La botella esta cerrada");
        } else {
            System.out.println("La botella esta abierta");
        }
    }

    public void setLiquid_acutal(int liquid_acutal) {
        this.liquid_acutal = liquid_acutal;
    }
    
    
    

    public int getCapacitat() {
        return Capacitat;
    }

    public String getTipus_liquid() {
        return tipus_liquid;
    }

    public int getAny_caducitat() {
        return any_caducitat;
    }

    public boolean isAbierto() {
        return abierto;
    }

    public int getLiquid_acutal() {
        return liquid_acutal;
    }
}
