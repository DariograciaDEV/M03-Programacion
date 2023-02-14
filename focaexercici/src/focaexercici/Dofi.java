/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package focaexercici;
import java.util.*;
/**
 *
 * @author dagr5755
 */
public class Dofi {
    private final int edat;
    private final String raza;
    private final int velocitat;
    private int distancia_recorreguda;

    public Dofi(int edat, String raza) {
        if (edat>0 && edat < 60)
        {
            this.edat = edat;
        }
        else
        {
            this.edat = 30;
            System.out.println("Edat dofi sera 30");
        }
        if(raza.equalsIgnoreCase("fosc") 
                || raza.equalsIgnoreCase("austral"))
        {
            this.raza = raza;
        }
        else
        {
            System.out.println("Raça incorrecta " + raza);
            this.raza = "fosc";
        }
        
        this.distancia_recorreguda=0;
        if (this.raza.equalsIgnoreCase("fosc"))
        {
            this.velocitat = this.edat*10;
        }
        else //if(this.raza.equalsIgnoreCase("austral"))
        {
            this.velocitat = this.edat*22;
        }
        
    }

    public int getEdat() {
        return edat;
    }

    public String getRaza() {
        return raza;
    }

    public int getVelocitat() {
        return velocitat;
    }

    public int getDistancia_recorreguda() {
        return distancia_recorreguda;
    }
    
    private int sprint_final()
    {
        Random rd = new Random();
        int ale = rd.nextInt(25, 100);
        return this.velocitat+ale;
    }

   
           
    private int sprint()
    {
        if (this.distancia_recorreguda<400)
        {
            this.distancia_recorreguda = this.distancia_recorreguda 
                    + this.velocitat;
        }
        else
        {
            this.distancia_recorreguda = this.distancia_recorreguda 
                    + sprint_final();
        }
        return this.distancia_recorreguda;
    }
    
     @Override
    public String toString() {
        return "Dofi{" + "edat=" + edat + ", raza=" + raza + ", velocitat=" + velocitat + ", distancia_recorreguda=" + distancia_recorreguda + '}';
    }
    
}
