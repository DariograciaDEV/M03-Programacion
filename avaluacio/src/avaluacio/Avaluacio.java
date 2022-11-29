/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package avaluacio;
import java.util.*;
/**
 *
 * @author dagr5755
 */
public class Avaluacio {

    /**
     * @param args the command line arguments
     */
  
  public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Cuantas filas quieres calcular:? ");
        int fila = sc.nextInt();
        for (int i =1; i < fila; i++) {
            int numBombetes = calcularBombetes(i);
            /*int suma;
            suma = i + numBombetes;*/
            System.out.println("");
            System.out.println("Fila " + i + " total de bombetes per fila: " + numBombetes);
            System.out.println("");
            //System.out.println("Total de bombetes " + suma);
        }
    }

    public static int calcularBombetes(int files) {
        // realitzem l'operaci� per calcular els arbres
        int bombetes;
        bombetes = files * 2 - 1;
        return bombetes;
    }
}
