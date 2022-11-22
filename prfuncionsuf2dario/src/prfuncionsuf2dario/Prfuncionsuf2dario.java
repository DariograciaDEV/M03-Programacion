/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prfuncionsuf2dario;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author dagr5755
 */
public class Prfuncionsuf2dario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }

    public static int quantitat_apostada(int saldo) {
        int apostar;
        Scanner sc = new Scanner(System.in);
        System.out.println("Quant vols apostar? Tens " + saldo);
        apostar = sc.nextInt();
        return apostar;
    }

    public static void tirada_disc(int disc1, int disc2, int disc3) {
        Random sc = new Random();
        disc1 = sc.nextInt(3);
        disc2 = sc.nextInt(3);
        disc3 = sc.nextInt(3);
    }

    public static void mostrar_tirada(int char1, int char2, int char3) {
        int disc1 = char1, disc2 = char2, disc3 = char3;
        System.out.println("****************************");
        System.out.println("*" + disc1 + disc2 + disc3 + "*");
        System.out.println("****************************");
    }

    public static boolean seguir_jugant(int calers) {
        boolean correcta = true;
        if (calers > 25) {
            correcta = false;
        } else if (calers < 0) {
            correcta = false;
        }
        return correcta;
    }

}
