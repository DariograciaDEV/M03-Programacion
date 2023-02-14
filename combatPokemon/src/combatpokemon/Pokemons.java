/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package combatpokemon;
import java.util.*;
/**
 *
 * @author dagr5755
 */
public class Pokemons {

    String nomPokemon;
    int CP;
    boolean viu;

    public Pokemons(String nomPokemon) {
        this.nomPokemon = nomPokemon;
    }

    public String getNomPokemon() {
        return nomPokemon;
    }

    public int getCP() {
        return CP;
    }

    public String toString() {
        String frase = "Nom Pokemon " + this.nomPokemon + " y " + " tiene " + this.CP + " puntos  ";
        return frase;
    }
    
    
    public void atac (){
        Random rd = new Random();
        int atac = rd.nextInt(0, 10);
        System.out.println("El " + this.nomPokemon + "ataca amb la força " + atac);
        ;
    }
}
