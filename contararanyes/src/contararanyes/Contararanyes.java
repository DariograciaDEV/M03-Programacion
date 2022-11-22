/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package contararanyes;

import java.util.*;

/**
 *
 * @author dagr5755
 */
public class Contararanyes {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Cuantes aranyes tens? ");
        int aranyes = sc.nextInt();
        
        
    }

    private static int contarPotes(int aranyes) {
        if (aranyes == 0) {
            return 0;
        }
        if (aranyes == 1) {
            return 8;
        } else if (aranyes%2 == 0) {
            return 8 + contarPotes(aranyes - 1);
        }
        return 0;
    }
}
