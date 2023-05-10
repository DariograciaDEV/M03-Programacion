package contactesdario;

import Exception.InvalidAgeException;
import DAO.Contactes;
import Objetos.Cont;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author dagr5755
 */
public class ContactesDario {

    public static void main(String[] args) throws InvalidAgeException {
        Scanner sc = new Scanner(System.in);
        Contactes contactesDario = new Contactes("Adrian", "49490641T", 22);
        carregarContactes();
        LlistarAgenda();
        LlistarPerEdat();
        



    

    

    public static void LlistarAgenda(Contactes contactesDario) {
        
    }

   

    private static void PassarAny(Contactes contactosDario) {
        contactosDario.augmentarAny();
        System.out.println("passa un any");
        contactosDario.llistar();

    }

    private static void canviarNom(Contactes ContactesDario) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Numero de DNI");
        String dni = sc.nextLine();
        ContactesDario.CanviarNom();
        
    }

    private static void carregarContactes(Contactes contactesDario) {
        contactesDario.add(new Contactes("Jairo", "49490641T", 75842315));
        contactesDario.add(new Contactes("Miquel", "49490641T", 52314582));
        contactesDario.add(new Contactes("Sonia", "49490641T", 30210278));
        contactesDario.add(new Contactes("Ramon", "49490641T", 12124204));
        contactesDario.add(new Contactes("Marc", "49490641T", 23092013));
        contactesDario.add(new Contactes("Vincent", "49490641T", 57412045));
    }

    private static void carregarContactes() {
    }

    private static void LlistarPerEdat() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introdueix l'edat: ");
        int edat = sc.nextInt();
        contactesDario.LlistarPerEdad(edat);
    }

}
