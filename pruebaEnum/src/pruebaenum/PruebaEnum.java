/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pruebaenum;

/**
 *
 * @author dagr5755
 */
public class PruebaEnum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Demarcacion jugador = Demarcacion.DEFENSA;
        Demarcacion jugador2 = Demarcacion.DELANTERO;
        //Demarcacion jugador3 = "DELANTERO"; //error no permet
        System.out.println("***name()***");
        System.out.println(jugador.name());
        System.out.println(jugador2.name());
        System.out.println("***toString()***");
        System.out.println(jugador.toString());
        System.out.println(jugador2.toString());
        System.out.println("***ordinal()***");
        System.out.println(jugador.ordinal());
        System.out.println(jugador2.ordinal());
        System.out.println("***values()***");
        Demarcacion[] lista = Demarcacion.values();
        for (int i = 0; i < lista.length; i++) {
            System.out.print(lista[i].name()+ "-");
        }
        System.out.println("");
        Demarcacion jugador3 = lista[2];
        System.out.println(jugador3.name());
        Demarcacion jugador4 = Demarcacion.values()[0];
        System.out.println(jugador4.name());
    }

    private static void printEquipo() {
        Equipo lleida = Equipo.LLEIDA;
        
        System.out.println("lleida name " + lleida.name());
        System.out.println(lleida.getNombre_equipo());
        System.out.println(lleida.getPos_liga_anterior());
    }
    
}
