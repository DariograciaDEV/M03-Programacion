/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prjackpotdariouf2;

import java.util.Random;

import java.util.Scanner;

/**
 *
 * @author dagr5755
 */
public class PrJackPotDarioUF2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int disc1 = 0, disc2 = 0, disc3 = 0, quantitat, apostat = 0, tirada_disc, mostrar;
        int char1 = 0, char2 = 0, char3 = 0;
        System.out.println("Quant saldo vols possar?");
        quantitat = quantitat_apostada(apostat);
        System.out.println("apostaras: " + apostat);
        tirada_disc(disc1, disc2, disc3);
        mostrar_tirada(char1, char2, char3);

    }

    public static int quantitat_apostada(int saldo) {
        int apostar;
        Scanner sc = new Scanner(System.in);
        saldo = sc.nextInt();
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
