/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package focaexercici;
import java.util.*;
/**
 *
 * @author dagr5755
 */
public class Focaexercici {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Creem el dofi " + "introduim l'edat");
        int dofiEdat = sc.nextInt();
        System.out.println("Introdueix la raça");
        int raça = sc.nextInt();
        System.out.println("Crear foca");
        int focaEdat = sc.nextInt();
        System.out.println("introdueix el pes");
        int pes = sc.nextInt();
        
        Dofi dofi = new Dofi (dofiEdat,raça);
        Foca foca = new Foca (pes, focaEdat);
        
        System.out.println("Distancia de la carrera");
        int distancia = sc.nextInt();
        int dofiSprint = 0;
        int focaSprint = 0;
        int volta = 0;
        
        do {
            volta = volta ++;
            if (volta%6==0) {
                System.out.println("Millora el valor de la resistencia");
                int valor = sc.nextInt();
                foca.augmentar(valor);
                dofiSprint = dofiSprint + dofi.getDistancia_recorreguda();
                focaSprint = focaSprint + foca.getDistancia_recorreguda();
            } else
                dofiSprint = dofiSprint + dofi.getDistancia_recorreguda();
                focaSprint = focaSprint + foca.getDistancia_recorreguda();
        } while (dofiSprint == distancia || focaSprint == distancia);
  
        System.out.println(dofi);
        System.out.println(foca);
        
    }
  
}
