/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bar;

import java.util.*;

/**
 *
 * @author sebbre
 */
public class Bar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Comanda> comandes = new ArrayList<Comanda>();
        Comanda comandaSebas = new Comanda("sebas");
        
        try {
			System.out.println(comandaSebas.llistar());
		} catch (ComandaBuidaException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
    }
    
}
