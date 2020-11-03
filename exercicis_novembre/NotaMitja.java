import java.util.*;

public class NotaMitja{
    public static void main(String[] args){
        Scanner teclat = new Scanner(System.in);
        
        int numero_notes;
        double acumulador  =0;
        
        System.out.println("Quantes notes");
        numero_notes = teclat.nextInt();
        
        for(int i = 1; i <= numero_notes; i++){
            System.out.println("Dis-me la nota "+i);
            acumulador += teclat.nextDouble();
            
        }
        System.out.println("La nota mitja es "+(acumulador/numero_notes));
    }
}
