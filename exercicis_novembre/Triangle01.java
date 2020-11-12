import java.util.*;

public class Triangle01{
    public static void main(String args[]){
    //Declaracio
        Scanner teclat = new Scanner(System.in);
        int numero = 0;
        char lletra = ' ';
        //Inici
        //System.out.println("Donam la lletra ");
        //lletra = teclat.nextLine().charAt(0);
        System.out.println("Donam el costat ");
        numero = teclat.nextInt();
        
        //Resol
        /*for(int i = 0; i < numero;i++){
            int j = 0;
            for(; j < numero -i;j++){
                System.out.print("0 ");
            }//del 1er for
            for(int k = j; k < numero ;k++){
                System.out.print("1 ");
            }//del 1er for
            System.out.println();
        }*/
        
        //Resol
        for(int i = 0; i < numero;i++){
            for(int j = 0; j < numero -i;j++){
                System.out.print("0 ");
            }//del 1er for
            for(int j=0; j < i ;j++){
                System.out.print("1 ");
            }//del 1er for
            System.out.println();
        }
    }
}
