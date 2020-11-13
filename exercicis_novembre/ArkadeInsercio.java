import java.util.*;

public class ArkadeInsercio{
    public static void main(String args[]){
    //Declaracio
        Scanner teclat = new Scanner(System.in);
        String[] bateria_noms = {"Juan", "Pepito","Andres","Lola", "Ana","Luisa"};
        
        String[] noms = new String[1000];
        int[] puntuacio = new int[1000];
        
        int posicio = 2;
        String nom_posar = "Sebas";
        int puntuacio_posar = 120;
        
        //inicialitze els noms
        for(int i=0;i<noms.length;i++){
            puntuacio[i] = -1;
            noms[i] = null;
        }
        
        
        
        //Pose els noms i les puntuacions
        for(int i=0; i<bateria_noms.length;i++){    
            noms[i] = "Luis"+i;
            puntuacio[i] = i*10;
        }
        
        int numero_elements =0;
        while(puntuacio[numero_elements] > -1){
            numero_elements++;
        }
        
        if(numero_elements<(puntuacio.length-1)){
            for(int i = numero_elements; i >= posicio; i--){
                puntuacio[i+1] = puntuacio[i];
                noms[i+1] = noms[i];
            }
            puntuacio[posicio] = puntuacio_posar;
            noms[posicio] = nom_posar;
            
            //Mostre el resultat
            for(int i = 0; i < puntuacio.length && puntuacio[i] > -1;i++)
                System.out.println("El jugador "+noms[i]+" amb puntuacio "+puntuacio[i]);
        }else{
            System.out.println("No cap");
        }
        
    }
}
