/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herenciaclase1;

/**
 *
 * @author dagr5755
 */
public class Persona {
    protected String DNI;
    protected String Nombre;

    public Persona(String DNI, String Nombre) {
        this.DNI = DNI;
        this.Nombre = Nombre;
    }

    public String getDNI() {
        return DNI;
    }

    public String getNombre() {
        return Nombre;
    }
    
    public void mostrarPersona(){
        System.out.println("Persona con DNI" + DNI + "el nombre" + Nombre);
    }
}
