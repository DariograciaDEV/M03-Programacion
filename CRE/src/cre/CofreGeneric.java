/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cre;
import java.util.*;
/**
 *
 * @author dagr5755
 */
public abstract class CofreGeneric {
    protected int num_monedas;
    protected Carta carta1;
    
    
    protected abstract void obrirCofre();
    
    protected String mostrar_Cofre(){
        String tipus;
        if (this instanceof cofreArgent){
            tipus = "Cofre Argent ";
        } else {
            tipus = "Cofre Or ";
        } return " monedas " + num_monedas + " carta 1 " + carta1; 
    }
    
    protected int trobarMoneda (int min, int max){
        Random rd = new Random ();
        int monedes = rd.nextInt(min, (max+1));
        return monedes;
    }
    
    protected Carta trobarCarta (){
        Carta[] cartes_clash_royale = Carta.values();
        Random rd = new Random ();
         int random_num = rd.nextInt(cartes_clash_royale.length);
        return cartes_clash_royale[random_num];
    }
}
