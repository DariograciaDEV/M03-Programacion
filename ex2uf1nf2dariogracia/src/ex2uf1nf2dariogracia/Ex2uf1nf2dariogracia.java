/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex2uf1nf2dariogracia;

import java.util.*;

/**
 *
 * @author dagr5755
 */
public class Ex2uf1nf2dariogracia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        final int filas = 3;
        final int columnas = 5;
        int[][] gracia = new int[filas][columnas];

        plenarCartro(gracia);
        mostrarCartro(gracia);
        marcarBola(gracia);
        existeixBola(gracia);
        existeixBingo(gracia);
       
        }

    public static void mostrarCartro(int[][] gracia) {
        //mostrarem el cartro.
        for (int i = 0; i < gracia.length; i++) {
            for (int j = 0; j < gracia.length; j++) {
                System.out.print(gracia[i][j] + "\t");
            }
            System.out.println("");
        }
    }

    public static void plenarCartro(int[][] gracia) {
        //Omplim el cartro de maner aleatoria.
        Random rd = new Random();
        for (int filas = 0; filas < gracia.length; filas++) {
            for (int columnas = 0; columnas < gracia.length; columnas++) {
                gracia[filas][columnas] = rd.nextInt(1, 90);
            }
        }
    }

    public static boolean marcarBola(int[][] gracia) {
       int bola;
       int posicio;
        for (int filas = 0; filas < gracia.length ; filas++) {
            for (int columnas = 0; columnas < gracia.length; columnas++) {
                if (bola.length = valor) {
                    posicio = 0;
                    return true;
                }else   {
                    return false;
                }
                
            }
        }
        return true;
    }

    public static boolean existeixBola(int[][] gracia) {
        //comprobem si es sap el valor de la bola.
        int bola = 0;
        for (int i = 0; i < gracia.length; i++) {
            for (int j = 0; j < gracia.length; j++) {
                if (bola != 0) {
                    return true;
                } else {
                    return false;
                }
            }
        }
        return false;
    }

    public static boolean existeixBingo(int[][] gracia) {
        //Comprobem si totes les caselles estan a 0.
        boolean posicion = true;
        for (int filas = 0; filas < gracia.length; filas++) {
            for (int columnas = 0; columnas < gracia.length; columnas++) {
                if (gracia.length != 0) {
                    return false;
                } else {
                    return true;
                }
            }
        }
        return true;
    }

    public static boolean existeixFila(int[][] gracia) {
        //Comprobem que si hi ha alguna fla que sigui sencera 0 marqui true.
        for (int filas = 0; filas < gracia.length; filas++) {
            if (filas == 0) {
                return true;
            } else {
                return false;
            }
        }
        return true;
    }
}
