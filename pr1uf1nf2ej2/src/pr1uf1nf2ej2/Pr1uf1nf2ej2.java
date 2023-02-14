/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pr1uf1nf2ej2;

import java.util.*;

/**
 *
 * @author dagr5755
 */
public class Pr1uf1nf2ej2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 0;
        System.out.println("Escriu el teu nom");
        String nom = sc.nextLine();
        boolean valido = comprobarNombre (nom);
        char nickname = retallarNom(nom);
        int aleatori = numAleatori(num);
        System.out.println(nickname + "_" + aleatori);
    }

    public static char retallarNom(String nom) {
        // I aquesta funcio demanara per on vols retallar el nom.
        
        Scanner sc = new Scanner(System.in);
        String retallar;
        char last = 0, first = 0;
        int respuesta = 0;
        System.out.println("Per on vols retallar el nom, darrere o per davant");
        respuesta = sc.nextInt();
        if (respuesta == last) {
            retallar = nom.substring(4, 0);
        } else if (respuesta == first) {
            retallar = nom.substring(0, 4);
        }
        return (char) respuesta;
    }

    private static int numAleatori(int num) {
        //Aqui generem el numero aleatori per concatenar. 

        int valorAleatorio = 0;
        Random rd = new Random();
        valorAleatorio = rd.nextInt(1, 1000);
        return valorAleatorio;
    }

    private static boolean comprobarNombre(String nom) {
        //esta funcion valida que el nombre tenga mas de 4 letras.
        
        boolean valido = true;
        if (nom.length() < 4) {
            valido = false;
        }
        return valido;
    }

}
