/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practicadario;

import java.util.*;

/**
 *
 * @author dagr5755
 */
public class PracticaDario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        pokemon CCC;
        CCC = pedirDatos();
        canviarPunts(CCC);

        /*-----------------------------------------------------------*/
        digimon TTT;
        TTT = pedirinfo();
        mostrarInfoDigimon(TTT);

        /*-----------------------------------------------------------*/
        atacPokemon(CCC);
        mostrarAtac(CCC);
        rebreAtac(CCC, TTT);

    }

    private static pokemon pedirDatos() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Posa el nom del pokemon");
        String name = sc.nextLine();

        System.out.println("Posa la teva vida");
        int lifepoint = sc.nextInt();
        System.out.println("Posa els punts d'atac");
        int combatPoint = sc.nextInt();
        pokemon aux = new pokemon(name, lifepoint, combatPoint);
        return aux;
    }

    private static digimon pedirinfo() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Posa el nom del digimon");
        String name = sc.nextLine();
        digimon aux = new digimon(name);
        return aux;
    }

    /*-----------------------------------------------------------*/
    private static void atacPokemon(pokemon CCC) {
        int atac;
        atac = CCC.getCombatPoint();
        System.out.println(atac);
    }

    

    /*-----------------------------------------------------------*/
   //mostrarinformació
    private static void mostrarInfoDigimon(digimon TTT) {
        System.out.println(TTT.getLifePoints());
        System.out.println(TTT.isShield());
    }

    /*-----------------------------------------------------------*/
    //creem funcio per canviar punts
    private static int canviarPunts(pokemon CCC) {
        Scanner sc = new Scanner(System.in);
        boolean resposta = true;
        resposta = sc.nextBoolean();
        CCC.combatPoint = sc.nextInt();
        return CCC.combatPoint;
    }

    
    //creem funcio de mostrar l'atac
    private static void mostrarAtac(pokemon CCC) {
        CCC.critCombat();
        System.out.println(CCC.getCombatPoint());
    }

    // creem la funcio de rebre atac i veiem l'atac
    private static void rebreAtac(pokemon CCC, digimon TTT) {
        int atac; 
        System.out.println(atac = TTT.lifePoints - CCC.getCombatPoint()); 
        System.out.println(atac);
    }
}
