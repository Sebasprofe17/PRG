import java.util.*;

public class Cuadrat{
    public static void main(String args[]){
    //Declaracio
        Scanner teclat = new Scanner(System.in);
        int numero = 0;
        char lletra = ' ';
        //Inici
        System.out.println("Donam la lletra ");
        lletra = teclat.nextLine().charAt(0);
        System.out.println("Donam el costat ");
        numero = teclat.nextInt();
        
        //Resol
        for(int i = 0; i < numero;i++){
            for(int j = 0; j < numero;j++){
                System.out.print(lletra);
            }//del 1er for
            System.out.println();
        
    }
}
