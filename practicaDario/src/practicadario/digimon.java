/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicadario;
import java.util.*;

/**
 *
 * @author dagr5755
 */
public class digimon {
    String name;
    int lifePoints;
    boolean shield;

    public digimon(String name) {
        this.name = name;
        this.lifePoints = 600;
        this.shield = true;
    }
      

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLifePoints() {
        return lifePoints;
    }

    public void setLifePoints(int lifePonits) {
        this.lifePoints = lifePoints;
    }

    public boolean isShield() {
        return shield;
    }

    public void setShield(boolean shield) {
        this.shield = shield;
    }
    
    
    
    //creem la funció d'atac
    public void atacDigimon (digimon TTT){
        Random rd = new Random ();
        int atac;
        atac = rd.nextInt(30,200);
        System.out.println(atac);
    }
    
     private static void mostrarInfoDigimon(digimon TTT) {
        System.out.println(TTT.getLifePoints());
        System.out.println(TTT.isShield());
    }
   
}
