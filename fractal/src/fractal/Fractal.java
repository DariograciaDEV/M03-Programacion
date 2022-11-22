/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fractal;

import java.util.*;

/**
 *
 * @author dagr5755
 */
public class Fractal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la longitud de un lado del cuadrado para hacer fractal: ");
        int lon = sc.nextInt();
        int perim = RectanguloFractal(lon);
        System.out.println("Has introducido " + lon + " de longitud y el perimetro del cuadrado es: " + perim + " .");
    }

    public static int RectanguloFractal(int longitud) {
        if (longitud == 1) {
            return 4 * longitud;
        } else if (longitud > 1) {
            return 4 * longitud + 4 * RectanguloFractal(longitud / 2);
        } else {
            return -1;
        }
    }
}
