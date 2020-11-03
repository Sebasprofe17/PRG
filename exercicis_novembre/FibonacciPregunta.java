import java.util.*;

public class FibonacciPregunta{
    public static void main(String[] args){
        Scanner teclat = new Scanner(System.in);
        int num1=0;
        int num2=1;
        int numero_voltes;
        
        System.out.println("Quants numeros");
        numero_voltes = teclat.nextInt();
        
        int suma = 0;
        int contador=0;
        
        while(contador < numero_voltes){
            contador++;
            System.out.println("El numero "+contador+" es el: "+num2);
            suma = num2 + num1;
            num1 = num2;
            num2 = suma;
            
        }
    }
}
