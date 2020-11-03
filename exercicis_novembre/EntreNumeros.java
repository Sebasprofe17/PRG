import java.util.*;

public class EntreNumeros{
    public static void main(String[] args){
        Scanner teclat = new Scanner(System.in);
        int primer, segon;
        int suma = 0;
        
        //Inici
        do{
            System.out.println("Donam el primer: ");
            primer = teclat.nextInt();
            System.out.println("Donam el segon: ");
            segon = teclat.nextInt();
        }while(primer > segon);
        
        for(int i = primer + 1; i < segon; i++){
            suma = suma + i;// suma += i;
        }
        System.out.println(suma);
    }
}
