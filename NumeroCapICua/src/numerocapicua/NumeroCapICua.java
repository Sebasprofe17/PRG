/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numerocapicua;

/**
 *Classe que donat un numero per crida i torna si es capicua
 * @author sebbre
 */
public class NumeroCapICua {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        if(args.length>0){
            int n = Integer.parseInt(args[0]); 
            System.out.println("El numero "+n+" es capicua? "+esCapicua(n));
        }
    }
    
    public static boolean esCapicua(int n){
        //cas base
        if(n<10)
            return true;
        int minim = tornaMinim(n);
        int maxim = tornaMaxim(n);
        if(minim != maxim)
            return false;
        int divisor = tornaDivisor(tornaNumeroDigits(n));
        //n = n - (maxim * divisor);
        //n = n/10;
        //return esCapicua(n);
        return esCapicua((n-(maxim * divisor))/10);
    }
    
    public static int tornaNumeroDigits(int n){
        if(n<10)
            return 1;
        return 1+tornaNumeroDigits(n/10);
    }
    /**
     * Torna el numero amb tants zeros com numero  menys 1
     */
    public static int tornaDivisor(int n){
        if(n<=1)
            return 1;
        return 10 * tornaDivisor(n-1);
    }
    
    public static int tornaMaxim(int n){//445
        return n / tornaDivisor(tornaNumeroDigits(n));
    }
    
    public static int tornaMinim(int n){
        return n%10;
    }
    
    
}
