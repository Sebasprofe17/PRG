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
public class Vehicle {
    private String matricula;
    private int numRodes;
    private Propietari amo;

    public Vehicle(String matricula, Propietari amo, int numRodes) {
        this.matricula = matricula;
        this.numRodes = numRodes;
        this.amo = amo;
    }

    public Vehicle(String matricula, Propietari amo) {
        this.matricula = matricula;
        this.amo = amo;
        numRodes = 4;
    }

    public int getNumRodes() {
        return numRodes;
    }

    public void setNumRodes(int numRodes) {
        this.numRodes = numRodes;
    }
    

    public Propietari getAmo() {
        return amo;
    }

    public void setAmo(Propietari amo) {
        this.amo = amo;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    
    
    
    
}
