/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jocpista;
import java.util.*;

/**
 *
 * @author sebbre
 */
public class JocPista {
    static Scanner teclat = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        char[] pista = new char[20];
        char caracter = demanarCaracter("Donam el icono");
        int pases;
        char costat;
        
        incialitzaPista(pista,'_');
        pista[0] = caracter;
        
        pintaPista(pista);
        do{
            pases = demanarNumero();
            costat  = demanarCaracter("Donam el costat: esquerre la e i dreta la d");
            menejarIcono(pista, caracter, pases, costat);
            pintaPista(pista);
        }while(pases > 0);
        
    }
    
    public static void menejarIcono(char[] pista, char caracter, int pases, char costat){
        int pos_inicial, pos_final=0;
        pos_inicial = buscaIcono(pista, caracter);
        if(costat=='e'){
            pos_final = pos_inicial - pases;
            if(pos_final < 0)
                pos_final = 0;
        }else{
            pos_final = pos_inicial + pases;
            if(pos_final > pista.length-1)
                pos_final = pista.length-1;
        }
        pista[pos_inicial] = '_';
        pista[pos_final] = caracter;
    }
    
    
    public static int buscaIcono(char[] pista, char icono){
        for(int i=0; i< pista.length ;i++){
            if(icono == pista[i])
                return i;
        }
        return 0;
    }
    
    public static int demanarNumero(){
        System.out.println("Donam el numero");
        int x = teclat.nextInt();
        teclat.nextLine();
        return x;
    }
    
    public static char demanarCaracter(String missatge){
        System.out.println(missatge);
        return teclat.nextLine().charAt(0);
    }
    
    public static void incialitzaPista(char[] pista, char caracter){
        for(int i=0; i< pista.length; i++)
            pista[i] = caracter;
    }
    
    public static void pintaPista(char[] pista){
        for(int i=0; i< pista.length; i++)
            System.out.print(pista[i]);
        System.out.print("\n");
    }
    
}
