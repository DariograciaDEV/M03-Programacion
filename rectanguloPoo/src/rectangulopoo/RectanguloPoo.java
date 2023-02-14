/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package rectangulopoo;
import  rectangulopoo.cordenadas;
/**
 *
 * @author dagr5755
 */
public class RectanguloPoo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        cordenadas rectangle = new cordenadas (0,0,5,5);
        
    int base = rectangle.getX2()-rectangle.getX1();
    int lado = rectangle.getY2()-rectangle.getY1();
    int perimetro = (base*2) + (lado*2);
        System.out.println("(" + rectangle.getX1() + "," + rectangle.getY1()+ ")" );
    
    }
    
}
