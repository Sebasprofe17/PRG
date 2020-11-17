/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pistamario;
import java.util.*;
/**
 *
 * @author sebas
 */
public class PistaMario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner teclat = new Scanner(System.in);
       char mario = 'M';
       String rejola = "##";
       int maxim = 0;
       int[] pista = {1,1,3,0,3,5,0,3,2,1,1,3,5,5,0,3,2,1,1,2,5,0,7,0,5,3,1,1,1};
       
       for(int i =0; i< pista.length; i++)
           if(maxim < pista[i])
               maxim = pista[i];
       
       for(int i = maxim;i >0;i--){
            for(int j = 0; j < pista.length;j++){
                if(pista[j]>= i)
                    System.out.print(rejola+" ");
                else
                    System.out.print("   ");
            }
            System.out.print("\n");
       }//del for
    }
    
}
