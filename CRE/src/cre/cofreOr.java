/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cre;

import java.util.Random;

/**
 *
 * @author dagr5755
 */
public class cofreOr extends CofreGeneric {

    Random rd = new Random();

    @Override
    protected void obrirCofre() {
        this.num_monedas = trobarMoneda(420, 480);
        this.carta1 = trobarCarta();
    }
}
