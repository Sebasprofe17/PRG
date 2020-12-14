/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funcionsstrings;
import java.util.*;
/**
 *
 * @author sebbre
 */
public class FuncionsStrings {
    static Scanner teclat = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        String nom = "Sebastian Ciscar";         
        System.out.println(nom.charAt(5));
        System.out.println(nom.length());
        System.out.println(nom.charAt(0));
        System.out.println(nom.charAt(nom.length()-1));
        System.out.println(nom.substring(10));
        System.out.println(nom.substring(10,13));
        System.out.println(nom.indexOf("i"));
        System.out.println(nom.substring(0, nom.indexOf(" ")));
        System.out.println(nom.substring(nom.indexOf(" ")+1));
        System.out.println(nom.toLowerCase());
        System.out.println(nom.toUpperCase());
        System.out.println(nom.trim());
        System.out.println(nom.replace(" ", ""));
        */
        
        String nom = demanaCadena("Donam el nom");
        String nom2 = demanaCadena("Donam el tros");
        if(nom.compareToIgnoreCase(nom2)<0){
            System.out.println(nom);
            System.out.println(nom2);
        }else if(nom.compareToIgnoreCase(nom2)>0){
            System.out.println(nom2);
            System.out.println(nom);
        }else{
            System.out.println(nom);
            System.out.println(nom);
        }
            
        
    }
    
    public static void estaLaCadena(String cadena, String tros){
        if(cadena.indexOf(tros)<0)
            System.out.println("No esta");
        else
            System.out.println("Si esta");
        
        if(cadena.contains(tros))
            System.out.println("Si esta");
        else
            System.out.println("No esta");
    }
    
    public static String tornaDelReves(String cadena){
        String cadena_del_reves="";
        for(int i=cadena.length()-1; i >= 0;i--)
            cadena_del_reves += cadena.charAt(i);
        return cadena_del_reves;
    }
    
    public static String demanaCadena(String missatge){
        System.out.println(missatge);
        return teclat.nextLine();
    }
    public static char tornaIconoJugador(String cadena){
        char icono;
        cadena = cadena.trim();
        cadena = cadena.toUpperCase();
        icono = cadena.charAt(0);
        return icono;
    }
    public static void escriuVertical(String cadena){
        for(int i=0; i< cadena.length();i++)
            System.out.println(cadena.charAt(i));
    }

}
