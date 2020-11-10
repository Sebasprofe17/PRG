import java.util.*;

public class ArrayStrings{
    public static void main(String args[]){
        Scanner teclat = new Scanner(System.in);
        String[] nombres = new String[4];
        
        for(int i = 0; i < 4; i++){
            System.out.println("Dame el nombre "+i);
            nombres[i] = teclat.nextLine();
        }
        
        for(int i = (4); i >= 0; i--){
            System.out.println(nombres[i]);
        }
        
    }
}
