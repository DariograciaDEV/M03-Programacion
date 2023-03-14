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

    List<Cromo> album;
    List<Cromo> repes;
    int num_max_coleccio; //quants cromos hi ha

    public CromoDAO(int max) {
        album = new ArrayList<Cromo>();
        repes = new ArrayList<Cromo>();
        num_max_coleccio = max;
    }

    //no scanner i també els sout
    /**
     *
     * @param cromo_add cromo a poner en el album
     * @return true si se añade al albulm /false si se pone en repes
     * @throws NumberOutofAlbum cromo tiene un numero fuera del album
     */
    public boolean afegirCromo(Cromo cromo_add) throws NumberOutofAlbum {
        if (this.num_max_coleccio < cromo_add.getNum()) {
            throw new NumberOutofAlbum("Cromo no es de la col·leció");
        }

        if (!album.contains(cromo_add)) {
            album.add(cromo_add);
            return true;
            //sout no porque esta prohibido MVC
        } else {
            repes.add(cromo_add);
            return false;
        }

    }

    /**
     *
     * @param del card con numero informado
     * @return 0 l'he boorat de repes 1 l'he tret del album i -1 no el tinc
     */
    public int removeCard(Cromo del) {
        if (repes.remove(del)) {
            return 0;
        } else if (album.remove(del)) {
            return 1;
        } else {
            return -1;
        }

    }

    public boolean isAlbum(Cromo add) {
        return album.contains(add);
    }

    public boolean isRepes(Cromo add) {
        return repes.contains(add);
    }
    //afegir

    //esborrar
    //canviar
    //buscar
    //retornar colecció
    public List<Cromo> getAlbum() {
        return album;
    }

    public List<Cromo> getRepes() {
        return repes;
    }

    public int getNum_max_coleccio() {
        return num_max_coleccio;
    }

    public int getNumAlbum() {
        return album.size();
    }

    public int getNumRepes() {
        return repes.size();
    }

}
