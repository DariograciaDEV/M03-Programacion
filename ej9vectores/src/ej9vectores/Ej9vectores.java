/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej9vectores;

import java.util.*;

/**
 *
 * @author dagr5755
 */
public class Ej9vectores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nombre = null, pass = null;
        pedirNombre (nombre);
        introducePass (pass);
        
        validarNombre(nombre);
        boolean validarNombre = false;
        System.out.println(validarNombre);
        
        
    }
    
    private static void pedirNombre (String nombre){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un correo: ");
        nombre = sc.nextLine();
    }
    
    private static void introducePass (int pass){
        Scanner sc = new Scanner (System.in);
        System.out.println("introduce la contraseña");
        pass = sc.nextInt();
    }

    private static void validarNombre (String nombre){
        //validaremos la password y debe de contener '@', y debe de tener el dominio office.proven.cat
        
        if (nombre.contains("@")) {
            System.out.println("Es correcto");
        } else  {
            System.out.println("Es incorrecto");
        }
        if (nombre.endsWith("@proven.cat")) {
            System.out.println("Es correcto");
        } else  {
            System.out.println("Es incorrecto");
        }
          System.out.println("tu usuario es: " + nombre);
    }
    
    private static void validarPassword (String pass){
        if (pass > 8) {
            System.out.println("Es correcto");
        } else {
            System.out.println("Contraseña incorrecta");
            System.out.println("Debe de ser mayor de 8 caracteres");
        }
        
        
            
        
        
    }
}
