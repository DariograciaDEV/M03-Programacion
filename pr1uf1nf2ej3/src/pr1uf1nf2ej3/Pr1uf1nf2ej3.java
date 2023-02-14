/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pr1uf1nf2ej3;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author dagr5755
 */
public class Pr1uf1nf2ej3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] num = new int[30];
        creacioDades(num);
        System.out.print(Arrays.toString(num));
        int numero = canviNum(num);
        System.out.println(numero);
    }

    private static void creacioDades(int[] num) {
        /*Fem que dintre de l'array insereixi 30 numeros aleatoris des del num
        1 fins el numero 15.*/
        
        Random rd = new Random();
        for (int i = 0; i < num.length; i++) {
            //aleatori = rd.nextInt(1, 51);
            num[i] = rd.nextInt(1, 15);
        }
    }

    private static int canviNum(int[] num) {
        /*Aqui volem indicar que de l'array busqui 
        el primer numero que sigui mayor de 12 per pasarlo a -1*/
        
        for (int i = 0; i < num.length; i++) {
            if (num.length < 12) {
                return -1;
            }
        }
        return num.length;
    }
}
