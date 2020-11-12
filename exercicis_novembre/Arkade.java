import java.util.*;

public class Arkade{
    public static void main(String args[]){
    //Declaracio
        Scanner teclat = new Scanner(System.in);
        int numero_jugadors = 0;
        String[] noms;
        int[] puntuacio;
        int maxim, minim;
        int posicio_maxim=0, posicio_minim = 0;
        
        
        //Iniciali
        do{
            System.out.println("Disme quants jugadors ");
            numero_jugadors = teclat.nextInt();
        }while(numero_jugadors < 1 || numero_jugadors > 5);
        teclat.nextLine();
        
        noms = new String[numero_jugadors];
        puntuacio = new int[numero_jugadors];
        
        for(int i=0; i < numero_jugadors ; i++){
            System.out.println("Disme el nom del jugador "+(i+1));
            noms[i]  = teclat.nextLine();
        }
        
        for(int i=0; i < numero_jugadors ; i++){
            System.out.println("Disme la puntuacio de "+noms[i]);
            puntuacio[i]  = teclat.nextInt();
        }
        
        maxim = puntuacio[posicio_maxim];
        minim = puntuacio[posicio_minim];
        
        for(int i = 1; i < numero_jugadors; i++){
        
            if(maxim < puntuacio[i]){
                maxim = puntuacio[i];
                posicio_maxim = i;
            }
            
            if(minim > puntuacio[i]){
                minim = puntuacio[i];
                posicio_minim = i;
            }
            
        }//del for
        
        System.out.println("Ha guanyat "+noms[posicio_maxim]+" amb una puntuacio de: "+puntuacio[posicio_maxim]);
        System.out.println("Ha perdut "+noms[posicio_minim]+" amb una puntuacio de: "+puntuacio[posicio_minim]);
        

        
    }
}
