/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cre;
import java.util.*;
/**
 *
 * @author dagr5755
 */
public class cofreArgent extends CofreGeneric {
Random rd = new Random(); 
    @Override
    protected void obrirCofre() {
        this.num_monedas = trobarMoneda(105,120);
        this.carta1 = trobarCarta();
    }
}
