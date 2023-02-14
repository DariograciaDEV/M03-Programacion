/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exuf1nf2;

import java.util.*;

/**
 *
 * @author dagr5755
 */
public class Ex2ExUF1NF2Dario {
    public static void main(String[] args) {
       final int filas = 3;
       final int columnas = 5;
       int[][] gracia = new int[filas][columnas];
       
       //Primera fila
       gracia [filas][columnas] = 4; 
       gracia [filas][columnas] = 4;
       gracia [filas][columnas] = 4;
       gracia [filas][columnas] = 4;
       gracia [filas][columnas] = 4;
               

        //Segona fila
       gracia [filas][columnas] = 4; 
       gracia [filas][columnas] = 4;
       gracia [filas][columnas] = 4;
       gracia [filas][columnas] = 4;
       gracia [filas][columnas] = 4;
        

        //Tercera fila
       gracia [filas][columnas] = 4; 
       gracia [filas][columnas] = 4;
       gracia [filas][columnas] = 4;
       gracia [filas][columnas] = 4;
       gracia [filas][columnas] = 4;
        
        
        
        
       
       for (int fila = 0; fila < gracia.length; fila++) {
            for (int col = 0; col < gracia[fila].length; col++) {
                gracia[fila][col] = 0;
            }
        }
       
        plenarCartro (gracia);
        mostrarCartro(gracia);
     
        
    }
    
    public static void plenarCartro(int[][] gracia) {
        //Omplim el cartro de maner aleatoria
        Random rd = new Random();
        int num = 0;
        for (int filas = 0; filas < gracia.length; filas++) {
            for (int columnas = 0; columnas < gracia.length; columnas++) {
                num = rd.nextInt(1, 90);
            }
        }
    }

    public static int mostrarCartro(int[][] gracia) {
        //mostrarem el cartro
        for (int filas = 0; filas < gracia.length; filas++) {
            for (int columnas = 0; columnas < gracia.length; columnas++) {
                System.out.print(gracia[filas][columnas] + "\t");
            }
            System.out.println("");
        }
        return gracia.length;
    }

    public static boolean marcarBola(int bola) {

        return true;
    }

    public static boolean existeixBola(int bola) {

        return true;
    }

    public static boolean existeixBingo(int[][] gracia) {
        boolean posicio = true;
        if (gracia != 0 ) {
            
        }
        
        return true;
    }
}