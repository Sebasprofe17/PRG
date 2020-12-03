import java.util.*;
public class Funcions{
    static Scanner teclat = new Scanner(System.in);
    
    public static int demanaNumero(){
        System.out.print("Donam el numero : ");
        int x = teclat.nextInt();
        return x;
    }
    
    public static int factorial(int x){
        int y = 1;
        for(int i=1; i<=x;i++){
            y *= i;
        }
        return y;
    }
    
    public static void main(String[] args){
        int n = demanaNumero();
        int factorial = factorial(n);
        System.out.println("el valor del Fatorial: "+factorial);
    }
    
    
}
