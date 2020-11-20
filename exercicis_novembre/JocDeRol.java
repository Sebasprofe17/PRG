import java.util.*;

public class JocDeRol{
    public static Scanner teclat = new Scanner(System.in);
    
    public static void main(String[] args){
        //variables
        int MINIM_JUGADORS = 1;
        int MAXIM_JUGADORS = 4;
        int cantitat_jugadors;
        String[] usuaris;
        char[] jugadors;
        int[] vida;
        int dimensio;//les dimension son cuadrades
        char[][] tauler;
        int dado;
        
        //DEmanar cantitat valida de usuaris
        System.out.println("Quants jugadors van a jugar.");
        cantitat_jugadors = demanarCantitat(MINIM_JUGADORS, MAXIM_JUGADORS);
        usuaris = new String[cantitat_jugadors];
        jugadors = new char[cantitat_jugadors];
        vida = new int[cantitat_jugadors];

        inicialitza(vida, 30);
    
        /*
        //Provar
        System.out.println("Has introuit el "+cantitat_jugadors);
        //Demanar la tirada i comprovar que es correcta
        System.out.println("Quina tirada fas.");
        dado = demanarCantitat(1,6);
        //Provar
        System.out.println("Has introuit el "+dado);
        */
    }
    
    public static void inicialitza(int[] v, int valor){
        for(int i = 0; i<v.length; i++)
            v[i] = valor;
    }
    
    /**
    demanarNoms
    input, el array de usuaris
    ouput res
    ha de demanar i posar en cada posicio el nom de lusuari
    */
    
    
    /**
    Este metode torna un numero valid, entre un minim i maxim
    */
    public static int demanarCantitat(int minim, int maxim){
        int numero;
        boolean es_ok;
        do{
            System.out.println("Introduix el numero entre: "+minim+" i "+maxim+" ambdos inclosos");
            numero = teclat.nextInt();
            es_ok = comprovarCantitat(minim, maxim, numero);
        }while(!es_ok);
        return numero;
        
    }
    
    public static boolean comprovarCantitat(int minim, int maxim, int numero){
        if(numero < minim || numero > maxim){
            return false;
        }
        return true;
    }
    
    /**
    Pintar vida
    Input,el array en , el array amb la vida dels jugadors
    */

}
