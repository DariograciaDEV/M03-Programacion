/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicirecur;

import java.util.*;

/**
 *
 * @author dagr5755
 */
public class Exercicirecur {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("introdueix el primer valor: ");
        int valor1 = teclado.nextInt();
        System.out.println("introdueix el segon valor: ");
        int valor2 = teclado.nextInt();
        int numeros = sumaValor(valor1, valor2);
        int sumaTotal = sumaValor(valor1, valor2);
        System.out.println(" la suma es: " + sumaTotal);
    }

    private static int sumaValor(int maximo, int minimo) {
        int v1;
        if (minimo == maximo) {
            v1 = maximo;
            maximo = minimo;
            minimo = v1;
        } else if () {
            return maximo + sumaValor(minimo, maximo -1);
        }
        return -1;
    }

}
