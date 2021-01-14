/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestorparking;

/**
 *
 * @author sebbre
 */
public class Propietari {
    private String nom;
    private Vehicle vehicle;
    
    public Propietari(String nom) {
        this.nom = nom;
    }

    public Propietari(String nom, Vehicle vehicle) {
        this.nom = nom;
        this.vehicle = vehicle;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
    
    
   
    public Propietari() {
        this.nom = "Anonim";
    }
}
