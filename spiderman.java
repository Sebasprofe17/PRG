import java.util.*;
public class Spiderman {

    public static void main(String[] args) {
        Scanner teclat = new Scanner(System.in);
        int primera, segona;
        int spiderman;
        
        do{
            System.out.println("Donam la primera bomba");
            primera = teclat.nextInt();
        }while(primera<0);
        
        do{
            System.out.println("Donam la segona bomba");
            segona = teclat.nextInt();
        }while(segona<0);
        
        do{
            System.out.println("Donam la posicio de spiderman");
            spiderman = teclat.nextInt();
        }while(spiderman<0);
        
        
        
        
        
        if(spiderman <= primera && spiderman <= segona){
            if(primera <= segona)
                System.out.println(segona - spiderman);
            else
                System.out.println(primera - spiderman);
        }
        
        
        
        
        else if(spiderman >= primera && spiderman >= segona){
            if(primera <= segona)
                System.out.println(spiderman - primera);
            else
                System.out.println(spiderman - segona);
        }
        
        
        
        else{
            if((spiderman - primera) < (segona - spiderman))
                System.out.println((spiderman - primera) + (segona - primera));
            else
                System.out.println((segona -spiderman) + (segona - primera));
        }
    }
    
}
