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
public class PistaMarioAmbMario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner teclat = new Scanner(System.in);
       
       char imatge_mario = 'M';
       String rejola = "##";
       
       int maxim = 0;
       int[] mario = {0,2};
       int[] pista = {1,1,3,0,3,5,0,3,2,1,1,3,5,5,0,3,2,1,1,2,5,0,7,0,5,3,1,1,1};
       
       char tirada;
       char direccio = 'd';
       
       for(int i =0; i< pista.length; i++)
           if(maxim < pista[i])
               maxim = pista[i];
       System.out.print("\n\n\n\n\n\n\n\n\n\n");
       
       do{
            for(int i = maxim;i >0;i--){
                 for(int j = 0; j < pista.length;j++){
                     if(mario[0]==j && mario[1]==i)
                         System.out.print(imatge_mario+"  ");
                     else{
                         if(pista[j]>= i)
                             System.out.print(rejola+" ");
                         else
                             System.out.print("   ");
                     }
                 }
                 System.out.print("\n");
            }//del for
            System.out.println("Dame la tirada: w ^ , a < , d > .    P para salir ");
            tirada = teclat.nextLine().charAt(0);
            switch(tirada){
                case 'w': {
                    
                }break;
                case 'a': {
                    direccio = 'a';
                    if(pista[mario[0]+1])//Mhe quedat
                }break;
                case 'd': {
                    direccio = 'd';
                }break;
                        
            }
       }while(tirada != 'P');
       
       //situe a Mario
    }
    
}
