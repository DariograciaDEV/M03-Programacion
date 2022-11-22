/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package contbitlles;

import java.util.*;

/**
 *
 * @author dagr5755
 */
public class Contbitlles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Cuantes files tens? ");
        int files = sc.nextInt();
        int bitlles = contarBitlles(files);
        System.out.println(files + " tenen " + bitlles + " potes ");
    }

    private static int contarBitlles(int files) {
        int bitlles;
        if (files == 1) {
            bitlles = 1;
            return bitlles;
        } else if (files > 1) {
            return files + contarBitlles(files - 1);
        }
        return -1;
    }
}
