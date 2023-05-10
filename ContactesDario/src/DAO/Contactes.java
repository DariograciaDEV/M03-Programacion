/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author dagr5755
 */
public class Contactes {

    public ArrayList<Contactes> Agenda = new ArrayList<Contactes>();

    private int dniNumeric;
    private char dniChar;
    private String nom;
    private int edat;

    public Contactes(String nom, String t, int dni) {
        this.dniNumeric = dni;
        this.dniChar = dniL;
        this.nom = nom;
        this.edat = edat;

    }

    public int getDniNumeric() {
        return dniNumeric;
    }

    public void setDniNumeric(int dniNumeric) {
        this.dniNumeric = dniNumeric;
    }

    public char getDniChar() {
        return dniChar;
    }

    public void setDniChar(char dniChar) {
        this.dniChar = dniChar;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getEdat() {
        return edat;
    }

    public void setEdat(int edat) {
        this.edat = edat;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Contactes other = (Contactes) obj;
        return Objects.equals(this.dniNumeric, other.dniChar);
    }

    @Override
    public String toString() {
        return "El contacte amb nom: " + nom + " te el dni " + dniNumeric + dniChar + " i te " + edat + "anys";
    }

    public void CanviarNom() {

    }

    public void add(Contactes contactes) {

    }

    public void LlistarPerEdad(int edat) {

    }

    public void augmentarAny() {
        for (int i = 0; i < Contactes.size(); i++) {
            int edades = Contactes.get(i).getEdad();
            Contactes.get(i).setEdat(edat + 1);
        }
    }
    
    public void llistar(){
        ArrayList<Contactes> All = new ArrayList<Contactes>();
        for (int i = 0; i < Contactes.size(); i++) {
            System.out.println(Contactes.get(i));
        }
    }
}
