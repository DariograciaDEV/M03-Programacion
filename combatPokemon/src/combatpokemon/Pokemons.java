/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package combatpokemon;

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
}
