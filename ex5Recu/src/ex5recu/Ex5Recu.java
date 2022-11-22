/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex5recu;

import java.util.*;

/**
 *
 * @author dagr5755
 */
public class Ex5Recu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("introduce numero entero: ");
        int num = teclado.nextInt();
        
    }

    private static void mostrarnumInvertido(int valor) {
        if (valor > 10) {
            System.out.println(valor);
        } else {
            System.out.println(valor);
            mostrarnumInvertido(valor);
        }
    }

}
