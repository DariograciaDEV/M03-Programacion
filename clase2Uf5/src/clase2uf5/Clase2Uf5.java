/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase2uf5;

import java.util.*;

/**
 *
 * @author dagr5755
 */
public class Clase2Uf5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<Integer> llista = new ArrayList<Integer>();
        System.out.println(llista.isEmpty());
        llista.add(7);
        llista.add(new Integer(5));
        llista.add(17);
        llista.add(2);
        System.out.println(llista.isEmpty());
        System.out.println(llista.size());

        /*recorrer arraylist*/
 /*for (Integer valor : llista) {
            System.out.println(valor);
        }

        /*metodo Iterator*/
 /*System.out.println("Recorrer Iterator");
        Iterator<Integer> iter = llista.iterator();
        while (iter.hasNext()) {
            Integer i = iter.next();
            System.out.println(i);
        }*/
        System.out.println("Recorrer llista metode get");
        Integer val;
        for (int i = 0; i < llista.size(); i++) {
            val = llista.get(i);
            System.out.println(val);
        }

        /*Añadir obejto en la lista*/
        System.out.println("Afegir num a la posició 2");
        llista.set(2, 100);
        for (Integer num : llista) {
            System.out.println(num);
        }
        
    }

}
