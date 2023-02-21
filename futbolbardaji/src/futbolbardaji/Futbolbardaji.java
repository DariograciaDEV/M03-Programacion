/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package futbolbardaji;
import futbolbardaji.*;
/**
 *
 * @author dagr5755
 */
public class Futbolbardaji {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Demarcacion Futbolista = Demarcacion.JUGADOR;
        Demarcacion Entrenador = Demarcacion.ENTRENADOR;
        Demarcacion Masajista = Demarcacion.MASAJISTA;
        Demarcacion Presidente = Demarcacion.PRESIDENTE;
        
        Entrenador trainer = new Entrenador(1, "Oriol");
        Futbolista player = new Futbolista(1, "Jeremy");
        Masajista massager = new Masajista(2, "Dani");
        Presidente manager = new Presidente(3, "Miquel Angel");
        
        if(!Futbolista.equals(trainer))
        {
            System.out.println("no iguales");
        }
        else
        {
            System.out.println("Iguales");
        }
        
        manager.tratarContrato(trainer);
        manager.tratarContrato(player);
        manager.tratarContrato(massager);
        
        trainer.Viajar();
        player.Viajar();
        massager.Viajar();
        manager.Viajar();
        System.out.println("sueldo jugador" + player.getSalary());
        player.jugarPartido();
        System.out.println("sueldo jugador" + player.getSalary());
    }
    
}
