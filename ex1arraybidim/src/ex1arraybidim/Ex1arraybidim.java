/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex1arraybidim;

/**
 *
 * @author dagr5755
 */
public class Ex1arraybidim {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         final int files = 5;
        final int colum = 5;
        int[][] mapa = new int[files][colum];

        //Primera fila
        mapa[0][0] = 0;
        mapa[0][1] = 0;
        mapa[0][2] = 0;
        mapa[0][3] = 0;
        mapa[0][4] = 0;

        //Segona fila
        mapa[1][0] = 0;
        mapa[1][1] = 0;
        mapa[1][2] = 0;
        mapa[1][3] = 0;
        mapa[1][4] = 0;

        //Tercera fila
        mapa[2][0] = 0;
        mapa[2][1] = 0;
        mapa[2][2] = 0;
        mapa[2][3] = 0;
        mapa[0][4] = 0;
    
        for (int fila = 0; fila < mapa.length; fila++) {
            for (int col = 0; col < mapa[0].length; col++) {
                mapa[fila][col] = fila++;
            }
        }
    
    }
    
}
