/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package funcions_joc;

import java.util.Random;

import java.util.Scanner;

/**
 *
 * @author dagr5755
 */
public class Funcions_joc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }

    public static int caidaBola(int maquina) {
        Random sc = new Random();
        maquina = sc.nextInt(36) + 0;
        return maquina;
    }

    public static boolean comprobarResultado(int bola, int num_apostado) {

    }

    public static int pedirNumero(int escoger) {
        Scanner Teclado = new Scanner(System.in);
        System.out.println("Escoge el numero de la bola");
        escoger = Teclado.nextInt();
        return escoger;
    }

    public static int ganancias(int dinero_apostado, int num_apostado) {
        int multiplica = 0;
        if ((dinero_apostado > 1) && (dinero_apostado < 36)){
            multiplica =  dinero_apostado * 35;
        } else if ((dinero_apostado == 37) || ((dinero_apostado == 38))){
            multiplica = dinero_apostado * 2;
        }
        return multiplica;
    }
}
