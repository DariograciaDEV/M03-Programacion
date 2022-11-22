/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package provastring;

import java.util.Scanner;

/**
 *
 * @author dagr5755
 */
public class provastring {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a = 3;
        String frase = "Hola que tal";
        System.out.println(frase);
        Scanner Teclado = new Scanner(System.in);
        System.out.println("Escribe la frase ");
        frase = Teclado.next();
        System.out.println("Frase con next: " + frase);
        System.out.println("Escribe una frase ");
        frase = Teclado.nextLine();
        System.out.println("Frase con nextLine: " + frase);
        if (frase.isBlank()) {
            System.out.println("String esta vacio");
        } else {
            System.out.println("String no vacio");
        }
        char letra = frase.charAt(3);
        System.out.println("La letra en la posicion 3 es: " + letra);
        System.out.println("La frase tiene: " + frase.length());
        
        
    }

}
