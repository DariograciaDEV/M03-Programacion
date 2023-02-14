/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pr1uf1nf2ej1;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author dagr5755
 */
public class Pr1uf1nf2ej1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] tauler = new int[30];

        iniciarTauler(tauler);
        definirCasellesMort(tauler);
        mostrarTauler(tauler);
        int tirada = tiradaDau();
        int mostrarTauler = 0;

        System.out.println(mostrarTauler);
    }

    private static void iniciarTauler(int[] tauler) {
        //Iniciem el tauler amb valor a 0.

        for (int i = 0; i < tauler.length; i++) {
            tauler[i] = '0';
        }
    }

    private static int tiradaDau() {
        //Tirem daus de manera aleatoria.

        Random rd = new Random();
        int lanzamiento = rd.nextInt(6) + 1;
        return lanzamiento;
    }

    private static void definirCasellesMort(int[] tauler) {
        // Definim les 4 caselles que son mort.

        Random rd = new Random();
        for (int i = 0; i < tauler.length; i++) {
            int mort = rd.nextInt(0, 4);
            tauler[mort] = 0;
        }
    }

    private static void mostrarTauler(int[] tauler) {
        //Mostarem la posicio.

        System.out.println(Arrays.toString(tauler) + "_");
    }

}
