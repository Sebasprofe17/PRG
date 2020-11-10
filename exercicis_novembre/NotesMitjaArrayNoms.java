import java.util.*;

public class NotesMitjaArrayNoms{
    public static void main(String args[]){
        Scanner teclat = new Scanner(System.in);
        
        int numero_notes;
        double acumulador  =0;
        double[] notes;
        String[] noms;
        
        
        do{
            System.out.println("Quantes notes");
            numero_notes = teclat.nextInt();
        }while(numero_notes<=0);
        teclat.nextLine();
        notes = new double[numero_notes];
        noms = new String[numero_notes];
        
        for(int i = 0; i < numero_notes; i++){
            System.out.println("Disme el nom numero: "+(i+1));
            noms[i] = teclat.nextLine();
        }
        
    
                  
        for(int i = 0; i < numero_notes; i++){
            System.out.println("Dis-me la nota de "+noms[i]);
            notes[i] = teclat.nextDouble();
        }
        
        
        
        
        
        for(int i = 0;i < numero_notes; i++){
            System.out.println("La nota de "+noms[i]+" es "+notes[i]);
            acumulador += notes[i];//acumulador = acumulador + notes[i];
        }
        
        System.out.println("La nota mitja d ela classe es : "+(acumulador/numero_notes));
        
    }
}
