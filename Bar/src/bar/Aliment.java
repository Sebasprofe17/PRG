/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bar;

import java.util.Objects;

/**
 *
 * @author sebbre
 */
public class Aliment {
    protected String nom;
    Aliment(String n){
        nom=n;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    @Override
    public String toString() {
        return "Aliment{" + "nom=" + nom + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
    	Aliment a = ((ElementPedido<Menjar>)obj).getElement();
        if (this == a) {
            return true;
        }
        if (a == null) {
            return false;
        }
        if (getClass() != a.getClass()) {
            return false;
        }
        final Aliment other = (Aliment) a;
        if (!Objects.equals(this.nom, other.nom)) {
            return false;
        }
        return true;
    }
    
}
