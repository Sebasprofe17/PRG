import java.util.*;

public class TaulerScacs{
    public static void main(String args[]){
    //Declaracio
        Scanner teclat = new Scanner(System.in);
        int numero = 0;
        int[][] matriu ;
        
        System.out.println("Donam el costat ");
        numero = teclat.nextInt();
        
        matriu = new int[numero][numero];
        
        //Inicialitze
        for(int i = 0; i < numero;i++){
        
            for(int j = 0; j < numero;j++){
            
                matriu[i][j] = 1;
                
            }//del 1er for
        }//del segon for
        

        
        //MOstre
        for(int i = 0; i < numero;i++){
        
            for(int j = 0; j < numero;j++){
            
                System.out.print(matriu[i][j]+" ");
            }//del 1er for
            
            System.out.print("\n");
        }
    }
}
