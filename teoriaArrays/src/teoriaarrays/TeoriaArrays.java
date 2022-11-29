/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package teoriaarrays;

import java.util.*;

import teoriaarrays.Utilitats;

/**
 *
 * @author dagr5755
 */
public class TeoriaArrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // creación array
        int[] numeros = new int[6];

        //demanar datos
        Scanner sc = new Scanner(System.in);
        //Recorremos la array, para ir añadiendo la información
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Introduce " + (i + 1) + "=");
            numeros[i] = sc.nextInt();
        }
        //Mostramos los datos introducidos
        Utilitats.mostrarArray(numeros);
        
        int minimo, maximo;
        minimo = numeros [0];
        maximo = numeros [0];
        for (int i = 0; i < numeros.length; i++) {
            if (numeros [i] > maximo) {
                maximo = numeros [i];
            }
            if (numeros [i] < minimo) {
                maximo = numeros [i];
            }
        }
        System.out.println("El maximo es: " + maximo);
        System.out.println("El minimos es: " + minimo);
    }

}
