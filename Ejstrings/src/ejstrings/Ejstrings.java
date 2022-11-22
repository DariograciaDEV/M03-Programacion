/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejstrings;

import java.util.Scanner;

/**
 *
 * @author dagr5755
 */
public class Ejstrings {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Pon la frase que quieras ");
        String frase = sc.nextLine();
        int letra = returnNum ();
        
        
    }
    
    public static int retornNum(String frase){
        int num = frase.length();
        return num;
    }
    
}
