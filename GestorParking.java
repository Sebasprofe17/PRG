/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestorparking;
import java.util.*;
/**
 *
 * @author sebbre
 */
public class GestorParking {

    public static Scanner teclat = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    }
    
    public static int demanaUnInt(String missatge){
        
        int x=0;
        System.out.println(missatge);
        x = teclat.nextInt();
        teclat.nextLine();
        return x;
    }
    
    public static String demanaUnString(String missatge){ 
        String x="";
        System.out.println(missatge);
        x = teclat.nextLine();
        teclat.nextLine();
        return x;
    }
    
}
