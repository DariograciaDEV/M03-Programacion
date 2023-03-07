package PatrullaCanina;

import java.util.*;

/**
 *
 * @author dagr5755
 */
public class PatrullaCanina {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Gos [] gosset = new Gos[6];
        crearPersonatges(gosset);
        llistarPersonatges(gosset);
        actuarGossos(gosset);
        cansarGos(gosset);

    }

    public static void crearPersonatges(Gos[] gosset) {
        gosset[0] = new Gos("Nuk", 0);
        gosset[1] = new Gos("Marshall", 1);
        gosset[2] = new Gos("Brian", 2);
        gosset[3] = new Gos("Naska", 3);
        gosset[4] = new Gos("Yang", 4);
        gosset[5] = new Gos("Rocky", 5, 200);
        

    }

    private static void llistarPersonatges(Gos [] gosset) {
        for (int i = 0; i < gosset.length; i++) {
            System.out.println(gosset.length);
        }
    }

    private static void actuarGossos(Gos [] gosset) {
       gosset[i].bordar(0, 0);
       gosset[i].beure(0);
       gosset[i].menjar(0);
       gosset[i].rescatar(0, 0);
    }

    public static void ferNedar(Gos [] gosset) {
        for (int i = 0; i < gosset.length; i++) {
            gosset[i].Nedar();
        }
        
    }

    public static void cansarGos(Gos [] gosset) {
        Scanner sc = new Scanner (System.in);
        for (int i = 0; i < gosset.length; i++) {
            System.out.println("Quin gos vols canasar");
            int gos =sc.nextInt();
            gos = gosset[i].bordar(gos, gos);
        }
        
    }

}
