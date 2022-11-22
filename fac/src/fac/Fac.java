/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fac;

/**
 *
 * @author dagr5755
 */
public class Fac {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num = 1;
        salut(num);
    }
    
    public static void salut (int n){
                if (n==0){
                    System.out.println("Hurraaa!!");
                } else {
                    System.out.println("Hip");
                    salut (n-1);
                }
    }
    
}
