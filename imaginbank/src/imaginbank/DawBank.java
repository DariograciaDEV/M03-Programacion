/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package imaginbank;

import java.util.*;

/**
 *
 * @author dagr5755
 */
public class DawBank {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int opcion_menu;
        // falta codigo
        //pedir datos para crear cuenta bancaria
        //crear cuenta bancaria

        do {
            opcion_menu = menu();
            switch(opcion_menu){
                case 1:{
                    
                }
                break;
                case 2:{
                    
                }
                break;
                case 3:{
                    
                }
                break;
                case 4:{
                    
                }
                break;
                case 5:{
                    
                }
                break;
                case 6:{
                    
                }
                break;
                case 7:{
                    
                }
                break;
                case 8:{
                    
                }
                break;
                
                    
                
            }
            //switch
        } while (true);

    }

    /**
     * muestra men�, devuelve la opci�n que has escogido del men� el
     * usuario(valida)
     *
     * @return opcion escogida por el usuario
     *
     */
    public static int menu() {
        int opcion;
        do {
            System.out.println("1. Datos de la cuenta. Mostrar� el IBAN, el titular y el saldo.\n"
                    + "2. IBAN. Mostrar� el IBAN.\n"
                    + "3. Titular. Mostrar� el titular.\n"
                    + "4. Saldo. Mostrar� el saldo disponible.\n"
                    + "5. Ingreso. Pedir� la cantidad a ingresar y realizar� el ingreso si es posible.\n"
                    + "6. Retirada. Pedir� la cantidad a retirar y realizar� la retirada si es posible.\n"
                    + "7. Movimientos. Mostrar� una lista con el historial de movimientos.\n"
                    + "8. Salir. Termina el programa.");
            Scanner sc = new Scanner(System.in);
            opcion = sc.nextInt();
        } while (opcion < 1 || opcion > 8);
        return opcion;
    }

}
