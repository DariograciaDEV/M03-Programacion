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
public class Foca {
    private int pes;
    private int edat;
    private int resistencia;
    private int distancia_recorreguda;
    
    public Foca (int pes, int edat){
        if (edat > 0 && edat < 15) {
            this.edat=edat;
        } else {
            this.edat=15;
            System.out.println("Edat és 15");
        }
        
        if (pes > 1 && pes < 141) {
            this.pes = pes;
        } else {
            this.pes=140;
            System.out.println("El pes és de 140");
        }
        this.resistencia=3;
    }

    public int getPes() {
        return pes;
    }
    public int getEdat() {
        return edat;
    }
    public int getResistencia() {
        return resistencia;
    }
    public int getDistancia_recorreguda() {
        return distancia_recorreguda;
    }
    public void setPes(int pes) {
        this.pes = pes;
    }
    public void setResistencia(int resistencia) {
        this.resistencia = resistencia;
    }
       
    public int canviarPes (int Pes){
        Scanner sc = new Scanner (System.in);
        int pescanviat = sc.nextInt();
        return pescanviat;
    }
    
    public void sprint (){
        int distancia_recorreguda = this.edat* (200-this.edat);
        if (this.resistencia) {
            
        }
    }

    @Override
    public String toString() {
        return "Foca{" + "pes=" + pes + ", edat=" + edat + ", resistencia=" + resistencia + ", distancia_recorreguda=" + distancia_recorreguda + '}';
    }
    
    
}
