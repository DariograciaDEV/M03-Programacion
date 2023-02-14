/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herenciaclase1;
/**
 *
 * @author dagr5755
 */
public class Alumno extends Persona {
    private String ciclo;
    private int curso;

    public Alumno(String ciclo, int curso, String DNI, String Nombre) {
        super(DNI, Nombre);
        this.ciclo = ciclo;
        this.curso = curso;
    }

    @Override
    public void mostrarPersona() {
        super.mostrarPersona();
        System.out.println("ciclo" + ciclo + "curso" + curso);
    }

    @Override
    public String toString() {
        return "Alumno{" + "nombre" + Nombre + "Dni" + DNI + "ciclo=" + ciclo + ", curso=" + curso + '}';
    }

}
