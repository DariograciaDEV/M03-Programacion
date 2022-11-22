/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package autoav;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author dagr5755
 */
public class Autoav {

    public static void main(String[] args) {
        double imc, resultado;
        imc = calculoIndiceIMC();
        interpretarIndiceIMC(imc);
        // TODO code application logic here
    }

    public static double calculoIndiceIMC() {
        Scanner sc = new Scanner(System.in);
        double altura, peso, imc;
        System.out.println("Cual es tu altura ? (EN METROS)");
        altura = sc.nextDouble();
        comprobarAltura(altura);
        System.out.println("Cual es tu peso ?");
        peso = sc.nextInt();
        imc = peso / (altura * altura);
        return imc;
    }

    public static void interpretarIndiceIMC(double imc) {
        int resultado;
        System.out.println("Clasificacion   |       IMC     ");
        System.out.println("Peso Bajo       |       <18,50     ");
        System.out.println("Peso Normal     |       18,50/24,99     ");
        System.out.println("Sobrepeso       |       25 o mes      ");

        if (imc < 18.50) {
            System.out.println("Tu peso es Bajo.");
            resultado = 1;
        } else if (imc > 18.50 || imc < 25) {
            System.out.println("Tu peso es Normal");
            resultado = 2;
        } else if (imc > 25) {
            System.out.println("Tienes Sobrepeso");
            resultado = 3;
        }

    }

    public static double comprobarAltura(double altura) {
        Scanner sc = new Scanner(System.in);
        if (altura < 0 || altura > 2.75) {
            System.out.println("Altura invalida introduce la valida : (RANGO 0-2.75");
            altura = sc.nextDouble();
        }
        return altura;
    }

    public static double comprobarPeso(double peso) {
        Scanner sc = new Scanner(System.in);
        if (peso < 0 || peso > 635) {
            System.out.println("Peso invalido introduce valido : (RANGO 0-2.75");
            peso = sc.nextDouble();
        }
        return peso;
    }

}
