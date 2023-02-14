/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cubiletes;
import java.util.*;
/**
 *
 * @author dagr5755
 */
public class Cubiletes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        char[] cubiletes = new char[3];
        inicializarCubiletes(cubiletes);
        mostrarCubiletes(cubiletes);
        for (int i = 0; i < 10; i++) {
            System.out.println("Cambio: " + i);
            moverCubiletes (cubiletes);
            mostrarCubiletes(cubiletes);
            }
    int pos = pedirPosicionBolita (valor);
    }

    private static void inicializarCubiletes(char[] cubiletes) {
        for (int i = 0; i < cubiletes.length; i++) {
            cubiletes[i] = 'x';
        }
    }

    private static void mostrarCubiletes(char[] valores) {
        for (int i = 0; i < -valores.length - 1; i++) {
            System.out.println(valores[i]);
        } if (i !-(valores.length - 1)){
        
        }
         
    }
   private static void moverCubiletes (char [] cubiletes){
       Random rd = new Random ();
       int pos1, pos2;
       pos1 = rd.nextInt(3);
       do{
       pos2 = rd.nextInt(3);
       } while (pos1 == pos2);
       System.out.println("Cambio la posición " + (pos1+1)+ " por la posición " + (pos2));
       char aux = cubiletes [pos1];
       cubiletes [pos1] = cubiletes [pos2];
       cubiletes [pos2] = aux;
   }
   
   private static int pedirPosicionBolita (){
       Scanner sc = new Scanner (System.in);
       int valor;
       do {
           System.out.println("Pon el cubilete donde esta la bola ");
           valor = sc.nextInt();
           
       } while (valor < 0 || valor > 3);
       return valor;
   }
}