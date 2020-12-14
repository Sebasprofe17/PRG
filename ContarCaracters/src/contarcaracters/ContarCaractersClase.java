/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contarcaracters;
import java.util.*;
/**
 *
 * @author sebbre
 */
public class ContarCaractersClase {
    public static Scanner teclat = new Scanner(System.in);
    
    public static void main(String[] args){
        int[] lletres = new int[22];

        String cadena = demanarCadena("Donam la cadena");
        contaCaracters(cadena, lletres);
    }
    
    public static void contaCaracters(String cadena, int[] lletres){
        
        for(int i=0; i < cadena.length();i++){
            
            if(cadena.charAt(i) >= 97 && cadena.charAt(i) <= 122)
                
                lletres[     cadena.charAt(i)  -  97      ]++;
        }
    }
    
    public static String demanarCadena(String missatge){
        System.out.println("Donam la cadena");
        return teclat.nextLine().toLowerCase();
    }
    
    public static void mostraResultatString(char[] lletres, int[] contador){
        for(int i= 0; i< lletres.length; i++)
            if(contador[i]>0)
                System.out.println(lletres[i]+" "+contador[i]+" voltes");
    }
}
