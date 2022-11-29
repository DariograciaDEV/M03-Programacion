/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package provaex;
import java.util.*;
/**
 *
 * @author dagr5755
 */
public class Provaex {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

            System.out.print("Entra el número de files de l'arbre: ");
            int numFiles = lector.nextInt();
            if (numFiles > 0) {
                int numBombetesTotals = calculaBombetes(numFiles);
                System.out.format("Per a un arbre de %d files calen %d bombetes en total\n",
                        numFiles, numBombetesTotals);
            } else {
                System.out.println("El número de files ha de ser positiu");
        }
    }
    
    /**
     * calcula recursivament el nombre de bombetes d'un arbre de Nadal
     * @param files el nombre de files de l'arbre
     * @return el nombre total de bombetes
     */
    public static int calculaBombetes(int files) {
        int bombetesTotals;

        if (files==1) {
            bombetesTotals = 1;
        } else {
            bombetesTotals = ((2*files)-1) + calculaBombetes(files-1);
        }
        return bombetesTotals;
    }
    
}
