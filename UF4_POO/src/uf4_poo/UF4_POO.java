/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package uf4_poo;

/**
 *
 * @author dagr5755
 */
public class UF4_POO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Ampolla botella = new Ampolla();
        Got glass = new Got();

        botella.setMaterial("Vidre");
        botella.setCapacitat(1000);
        System.out.println("-" + botella.isAbierto());

        botella.isAbierto();

        System.out.println(botella.getLiquid_acutal());

        botella.setMaterial("Plastic");
        botella.setAny_caducitat(2024);
        System.out.println(botella.getMaterial());
        System.out.println(botella.getCapacitat());

        /**
         * **********************************************
         */
        System.out.println("crear got");

    }

}
