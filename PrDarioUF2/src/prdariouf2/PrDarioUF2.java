/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prdariouf2;

import java.util.Scanner;

/**
 *
 * @author dagr5755
 */
public class PrDarioUF2 {

    /**
     * Calculadora IMC
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Introdueix la teva alçada");

        double alçada = sc.nextDouble();
        System.out.println("Introdueix el teu pes");
        double masa = sc.nextDouble();

        double indice = calculoIndiceIMC(alçada, masa);
        System.out.println("El teu IMC és: " + indice);

        int IMC = interpretarIndiceIMC(indice);

        switch (IMC) {
            case 0:
                System.out.println("Baix Pes");
                break;
            case 1:
                System.out.println("Normal");
                break;
            case -1:
                System.out.println("Sobre Pes");
                break;
        }
    }

    public static double calculoIndiceIMC(double estatura, double pes) {
        double imc;
        imc = (pes / (estatura * estatura));
        return imc;
    }

    public static int interpretarIndiceIMC(int indiceIMC) {
        int IMC;
        if (indiceIMC < 18.5) {
            IMC = 0;
            //return 0;
        } else if (indiceIMC > 24.99) {
            IMC = 1;
            //return 1;
        } else {
            IMC = -1;
            //return -1;
        }
        return IMC;
    }
}
