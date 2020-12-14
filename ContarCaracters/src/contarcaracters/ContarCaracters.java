/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contarcaracters;
import java.util.*;
/**
 *
 * @author sebas
 */
public class ContarCaracters {

    public static Scanner teclat = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] lletres = new int[25];
        char[] caracters = new char[25];
        int[] contador = new int[25];
        inicialitzaArray(contador);
        inicialitzaArray(lletres);
        String cadena = demanaCadena("Donam la cadena");
        contaCaracters(cadena, lletres);
        mostraResultat(lletres);
        System.out.println("#######################");
        contaCaractersString(cadena, caracters, contador);
        mostraResultatString(caracters, contador);
    }
    
    public static void inicialitzaArray(int[] lletres){
        for(int i=0; i < lletres.length;i++){
            lletres[i]=0;
        }
    }
    
    public static void contaCaractersString(String cadena, char[] lletres, int[] contador){
        int posicio = 0;
        for(int i= 0; i< cadena.length(); i++){
            if(!estaElCaracter(lletres, cadena.charAt(i)) && cadena.charAt(i) != ' '){
                lletres[posicio] = cadena.charAt(i);
                contador[posicio] = buscaCuantes(cadena, cadena.charAt(i));
                posicio++;
            }
        }
    }
    
    public static boolean estaElCaracter(char[] lletres, char caracter){
        for(int i=0; i< lletres.length; i++)
            if(lletres[i] == caracter)
                return true;
        return false;
    }
    
    public static int buscaCuantes(String cadena, char caracter){
        int contador = 0;
        int posicio=0;
        do{
            posicio = cadena.indexOf(caracter, posicio+1);
            if(posicio >= 0)
                contador++;
        }while(posicio >= 0);
            
        
        return contador;
    }
    
    
    
    
    
    
    
    public static void contaCaracters(String cadena, int[] lletres){
        for(int i=0; i < cadena.length();i++){
            if(cadena.charAt(i) >= 97 && cadena.charAt(i) <= 122)
                lletres[cadena.charAt(i)-97]++;
        }
    }
    
    public static String demanaCadena(String missatge){
        String cadena = "";
        do{
            System.out.println(missatge);
            cadena = teclat.nextLine();
        }while(cadena.length() <= 0);
        return cadena.toLowerCase();
    }
    
    public static void mostraResultat(int[] lletres){
        for(int i= 0; i< lletres.length; i++)
            if(lletres[i]>0)
                System.out.println(((char)(i+97))+" "+lletres[i]+" voltes");
    }
    
    
    
    
    
    
    
    
    public static void mostraResultatString(char[] lletres, int[] contador){
        for(int i= 0; i< lletres.length; i++)
            if(contador[i]>0)
                System.out.println(lletres[i]+" "+contador[i]+" voltes");
    }
    
    
}
