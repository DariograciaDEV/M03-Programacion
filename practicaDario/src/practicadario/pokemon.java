/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicadario;

/**
 *
 * @author dagr5755
 */
public class pokemon {

    String name;
    int lifePoints;
    int combatPoint;

    public pokemon(String name, int lifepoint, int combatPoint) {
        this.lifePoints = lifePoints;
        
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLifePoints() {

        return lifePoints;
    }

    public void setVida(int vida) {
        this.lifePoints = vida;

    }

    public int getCombatPoint() {
        return combatPoint;

    }

    public void setCombatPoint(int combatPoint) {
        this.combatPoint = combatPoint;

    }

    //realitzem el crit d'atac
    public void critCombat() {
        System.out.println(this.getName() + "Pokemon a l'atac amb força");
    }
    
    
//  Canviem els punts
    public void canviPuntsAtac(int CombatPoint) {
        System.out.println(CombatPoint);
    }
    
    private static void atacPokemon(pokemon CCC) {
        int atac;
        atac = CCC.getCombatPoint();
        System.out.println(atac);
    }

}
