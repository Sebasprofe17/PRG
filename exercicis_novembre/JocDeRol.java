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
        teclat.nextLine();//Per a buidar el buffer
        
        usuaris = new String[cantitat_jugadors];
        jugadors = new char[cantitat_jugadors];
        vida = new int[cantitat_jugadors];

        inicialitza(vida, 30);
        demanaUsuaris(usuaris);
        
        demanarLletra(jugadors);
        pintaEstatsDeVida(jugadors, vida);
        
    
        
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
    public static void demanaUsuaris(String[] noms){
        for(int i= 0; i< noms.length; i++){
            System.out.println("Dis-me el nom del jugador : "+(i+1));
            noms[i] = teclat.nextLine();
        }
        
    }
    
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
    demanarLletra
    input: char[] lletres
    ouput: void
    */
    public static void demanarLletra(char[] lletres){
        for(int i = 0; i < lletres.length; i++){
            System.out.print("Donam la lletra del jugador "+(i+1));
            lletres[i] = teclat.nextLine().charAt(0);
        }
    }
    
    /**
    pintaVida
    pinta la vida de un jugador en concret
    input: char lletra, int vida
    output
    */
    public static void pintaVida(char lletra, int vida){
        System.out.print(lletra+" ");
        for(int i=0; i< vida; i++)
            System.out.print("#");
        System.out.print("\n");
    }
    
    /**
    pintaEstatsDeVida
    input; char[] lletres, int[] vida
    ouput;
    */
   public static void pintaEstatsDeVida(char[] lletres, int[] vida){
        for(int i=0; i< lletres.length; i++){
            pintaVida(lletres[i], vida[i]);
        }
   }

}
