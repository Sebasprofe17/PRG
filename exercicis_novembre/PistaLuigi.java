/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.*;
/**
 *
 * @author sebas
 */
public class PistaLuigi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner teclat = new Scanner(System.in);
       char luigi = 'L';
       String rejola = "#";
       char[][] pista = new char[15][15];
       
       
       for(int i =0; i< pista.length; i++){
            for(int j=0; j< pista[i].length; j++){
                if(i==0 || i == pista.length-1 || j==0 || j==pista[i].length-1)
                    pista[i][j]='#';
                else
                    pista[i][j]=' ';
            }
       }
        pista[1][1] = 'L';
        for(int i =pista.length-1; i>=0; i--){
            for(int j=0; j< pista[i].length; j++){
                    System.out.print(pista[i][j]);
            }
            System.out.print('\n');
       }
       
       
    }
    
}
