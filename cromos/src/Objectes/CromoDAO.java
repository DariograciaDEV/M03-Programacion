/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objectes;

import Prcromos.*;
import java.util.*;

/**
 *
 * @author dagr5755
 */
public class CromoDAO {

    List<Cromo> repe;
    List<Cromo> album;
    int num_max_coleccio;

    public CromoDAO() {
        album = new ArrayList<Cromo>();
        repe = new ArrayList<Cromo>();
        num_max_coleccio = max;

    }

    public void afegirCromo(Cromo cromo_add) {
        
        if (!Cromo.contains(cromo_add)) {
            Album.add(cromo_add);
            return true;
        } else {
            repes.add(cromo_add);
        }
        
    }

}
