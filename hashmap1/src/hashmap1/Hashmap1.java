/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hashmap1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author dagr5755
 */
public class Hashmap1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // Create a HashMap object called capitalCities
        Map< String, Integer> lletres = new HashMap();
        lletres.put("A", 1);
        lletres.put("B", 2);
        lletres.put("C", 3);
        lletres.put("D", 4);
        lletres.put("E", 5);
        lletres.put("F", 6);
        lletres.put("G", 7);
        lletres.put("H", 8);
        lletres.put("Z", 28);
        System.out.println(lletres);

        /*Set<Map.Entry<String,Integer>>set=lletres.entrySet();
        Iterator<Map.Entry<String,Integer>> Iterador = set.iterator();
        
        while  (Iterador.hasNext()){
            Map.Entry<String,Integer> entry = Iterador.next();
            String key = entry.getKey();
            Integer valor = entry.getValue();
            System.out.println("("+ key + ")->" + valor + "");
        }
        
        Set <String> keys = lletres.keySet();
        
        for (String clave : keys) {
            Integer valor = lletres.get(clave);
            System.out.println("foreach(" + clave + ")->" + valor+"");
        }
        
       Integer valor_recuperado = lletres.get("F");
        System.out.println("");
        
        lletres.putIfAbsent("A", 150);*/
        //Map <char,int> lletres1 = new HashMap();
        lletres.put("A", 150);
        System.out.println("Values () ---------------------------");
        Collection<Integer> valores = lletres.values();
        ArrayList<Integer> lista_valores = new ArrayList<Integer>(valores);
        for (Integer valor : lista_valores) {
            System.out.println(valor);
        }

    }
}
