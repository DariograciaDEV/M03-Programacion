/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package divisadario;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author dagr5755
 */
public class DivisaDario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        Map<String, Double> Divises = new HashMap<String,Double>();
        CarregarDivises();
        MostrarDivises();
        CanviarcanviDivisa();
    }

   
    
    public void CarregarDivises(Map<String, Double> Divises){
       Divises.put("Euro", 5.0);
       Divises.put("Dolar", 5.0);
       Divises.put("Euro", 8.7);
       Divises.put("Dolar", 6.9);
       Divises.put("Euro", 8.0);
    }
    
    public void MostrarDivises(Map<String, Double> Divises){
        System.out.println(Divises);
    }
    
    public void CanviarCanviDivisa(){
        
    }
}
