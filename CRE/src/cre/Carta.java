/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cre;

/**
 *
 * @author dagr5755
 */
public enum Carta {
        GIGANTE_NOBLE("Gigante Noble",6), GIGANTE ("Gigante", 5),
        ARQUERA ("Arquera",3), ESBIRROS5("Esbirros de 5",5),
        FLECHAS("Flechas",3), CABALLERO ("CCaballero",3), 
        PEKKA("Super Pekka",7), PRINCIPE("El principe",5),
        MINERO("El minero",3),ESBIRROS("Los Esbirros",3),
        MAGO("El mago",5);
    
    private String Nombre;
    private int Elixir;
    private int Arena;
    
    private Carta (String nombre, int Elixir){
        this.Nombre = nombre;
        this.Elixir = Elixir;
        if (Elixir==8) 
            this.Arena = 10;
        else if(Elixir ==9)
            this.Arena = 13;
        else{
            this.Arena = Elixir;
        }
    }
    
    public String getNombre(){
        return Nombre;
    }
    
    public int getElixir (){
        return Elixir;
    }
    
    public int getArena(){
        return Arena;
    }
public void setElixir(int elixir) {
       if (Elixir==8)
       {
                this.Arena=10;
                this.Elixir=elixir;
       }        
        else if (elixir==9)
        {
                this.Arena = 13;
                this.Elixir=elixir;
        }
        else
            {
                this.Arena = elixir;
                this.Elixir=elixir;
            }
    }

    @Override
    public String toString() {
        return "Carta " + "name=" + Nombre + ", elixir=" + Elixir;
    }    

}
