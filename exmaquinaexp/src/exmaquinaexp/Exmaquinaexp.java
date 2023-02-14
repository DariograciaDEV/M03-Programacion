/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exmaquinaexp;

import java.util.Scanner;

/**
 *
 * @author dagr5755
 */
public class Exmaquinaexp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args, boolean demanarLlaminadura) {
        final int files = 4;
        final int colum = 4;
        String[][] maquina = new String[files][colum];

        String[][] nombresGolosinas = {
            {"KitKat", "Chicles de fresa", "Donetes", "Palotes"},
            {"Kinder Bueno", "Bolsa variada Haribo", "Chetoos", "Twix"},
            {"Donuts", "M&M'S", "Papa Delta", "Chicles de menta"},
            {"Lacasitos", "Crunch", "Milkybar", "Oreos"}};

        double[][] precio = {
            {1.1, 0.8, 1.5, 0.9},
            {1.8, 1, 1.2, 1},
            {1.8, 1.3, 1.2, 0.8},
            {1.5, 1.1, 1.1, 1.1}};

        int opcio;
        do {
            opcio = menu();
            switch (opcio) {
                case 0:
                    System.out.println("Apagar Maquina");
                    break;
                case 1:
                    System.out.println(demanarLlaminadura);
                    break;
                case 2:
                    System.out.println("Mostra llaminadures-columna elegida");
                    break;
                case 3:
                    System.out.println("Omplir llaminadures");
                    break;
                case 4:
                    System.out.println("Mostrar existencies maquina");
                    break;

            }

        } while (/*falta condici� per sortir*/);

    }

    private static int menu() {
        Scanner sc = new Scanner(System.in);
        System.out.println("*****************************");
        System.out.println("1.- Demanar llaminadura");
        System.out.println("2.- Mostra llaminadures-columna elegida");
        System.out.println("3.- Omplir llaminadures");
        System.out.println("4.- Mostrar existencies maquina");
        System.out.println("0.- Apagar m�quina");
        System.out.println("Escull opci�");

        //aqui falta demanar la opci� i uqe si no es correcta torni a demanar-la
        //retornar opci� escollida
        return -1;
    }

    public static String[][] demanarLlaminadura(int fila, int colum) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Tens que demanar la llaminadura");
        int x, y; //x ----> fila , y ------> columna
        System.out.println("Fica la fila que està el producte que vols: ");
        x = sc.nextInt();
        System.out.println("Fica la columna que està el producte que vols: ");
        y = sc.nextInt();
        String[][] maquina = null;

        System.out.println("el valor que has introduit és: " + maquina[x][y]);
        return maquina;
    }
    
    public static String mostrarLlaminadura (int fila, int colum){
        
    }

}
