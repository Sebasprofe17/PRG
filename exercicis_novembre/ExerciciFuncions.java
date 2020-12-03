import java.util.*;
public class ExerciciFuncions{
    public static Scanner teclat = new Scanner(System.in);
    
    public static void main(String[] arguments){
        int numero = demanarNumero("Donam el numero que voldries");
        numero = multiplica(numero);
        numero = comparaNumeroAmbAleatori(numero);
        tornaResultat(numero+"");
        
    }
    
    
    public static int comparaNumeroAmbAleatori(int numero){
        int numero_minim = demanarNumero("Donam el minim");
        int numero_maxim = demanarNumero("Donam el maxim");
        int aleatori = getNumeroAletori(numero_minim,numero_maxim);
        if(aleatori == numero)
            return numero + 10;
        return numero;
    }
    
    
    
    
    
    
    
    
    
    
    public static int getNumeroAletori(int minim, int maxim){
        int x = (int)(Math.random()*(maxim-minim+1)+minim);
        return x;
    }
    
    public static int demanarNumero(String missatge){
        System.out.println(missatge);
        int x = teclat.nextInt();
        return x;
    }
    
    public static int multiplica(int numero){
        return numero * numero;
    }
    
    
    
    public static void tornaResultat(String missatge){
        System.out.println("Hola este es el resultat: "+missatge);
    }
    
}
