/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package array2dim;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author dagr5755
 */
public class Array2dim {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        final int files = 3;
        final int colum = 4;
        int[][] mapa = new int[files][colum];

        //Primera fila
        mapa[0][0] = 4;
        mapa[0][1] = 14;
        mapa[0][2] = 24;
        mapa[0][3] = 34;

        //Segona fila
        mapa[1][0] = 5;
        mapa[1][1] = 15;
        mapa[1][2] = 25;
        mapa[1][3] = 35;

        //Tercera fila
        mapa[2][0] = 6;
        mapa[2][1] = 16;
        mapa[2][2] = 26;
        mapa[2][3] = 36;

        for (int fila = 0; fila < mapa.length; fila++) {
            for (int col = 0; col < mapa[fila].length; col++) {
                System.out.println(mapa[fila][col] + "-");
            }
        }

        //pasar array todo a 4
        for (int fila = 0; fila < mapa.length; fila++) {
            for (int col = 0; col < mapa[fila].length; col++) {
                mapa[fila][col] = 4;
            }
        }

        //poner num aleatorio en cada array
        Random rd = new Random();
        for (int fila = 0; fila < mapa.length; fila++) {
            for (int col = 0; col < mapa[fila].length; col++) {
                mapa[fila][col] = rd.nextInt(100) + 1;
            }
        }

        System.out.println("**************************************");
        for (int fila = 0; fila < mapa.length; fila++) {
            for (int col = 0; col < mapa[fila].length; col++) {
                System.out.print(mapa[fila][col] + "-");
            }
        }

        /*Pedir que casilla quiero saber el num
        int x, y; //x ----> fila , y ------> columna
        Scanner sc = new Scanner(System.in);
        System.out.println("Fica la fila que vols veure");
        x = sc.nextInt();
        System.out.println("Fica la columna que vols veure");
        y = sc.nextInt();

        System.out.println("el valor que has introduit és: " + mapa[x][y]);
    }*/
        Scanner sc = new Scanner(System.in);
        for (int fila = 0; fila < mapa.length; fila++) {
            for (int col = 0; col < mapa[fila].length; col++) {
                System.out.println("Pon valor para " + fila + "");
                mapa[fila][col] = sc.nextInt();
            }
        }
        for (int fila = 0; fila < mapa.length; fila++) {
            for (int col = 0; col < mapa[fila].length; col++) {
                System.out.println(mapa[fila][col] + "-");
            }
        }
    }
}
