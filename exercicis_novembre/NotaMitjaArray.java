import java.util.*;

public class NotaMitjaArray{
    public static void main(String args[]){
        Scanner teclat = new Scanner(System.in);
        
        int numero_notes;
        double acumulador  =0;
        double[] notes;
        
        do{
            System.out.println("Quantes notes");
            numero_notes = teclat.nextInt();
        }while(numero_notes<=0);
        
        notes = new double[numero_notes];
        
                  
        for(int i = 0; i < numero_notes; i++){
            System.out.println("Dis-me la nota "+i);
            notes[i] = teclat.nextDouble();
        }
        
        for(int i = 0;i < numero_notes; i++){
            System.out.println("La nota en la posicion "+i+" es "+notes[i]);
        }
        
    }
}
