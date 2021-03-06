/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursivitat1;

/**
 *
 * @author sebas
 */
public class Recursivitat1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n = 5;
        System.out.println("La suma dels primers "+n+" numeros: "+sumaRecursiva(n));
        System.out.println("Factorial dels primers "+n+" numeros: "+factorialRecursiu(n));
        System.out.println("Fibonacci dels primers "+n+" numeros: "+fibonacciRecursiu(n));
        System.out.println("Potencia de 3 elevat a 4: "+Math.pow(3, 4)+" calculat amb recursiu "+potenciaRecursiu(3,4));
        int[] v = {4,4,5,6,2,3,4,5,6};
        //mostrarArrayRecursiu(v,0);
        mostrarArrayRecursiuDelReves(v, v.length-1);
        String cadena = "Sebas";
        System.out.println(reversaCadena(cadena, cadena.length()-1));
    }
    
    public static int sumaRecursiva(int n){
        //cas base
        if(n <= 0)
            return 0;
        //cas general
        return n + sumaRecursiva(n-1);
    }
    
    public static int factorialRecursiu(int n){
        //cas base
        if(n <= 0)
            return 1;
        return n * factorialRecursiu(n-1);
    }
    
    public static int fibonacciRecursiu(int n){
        //cas base
        if(n<=1)
            return 1;
        //cas general
        return fibonacciRecursiu(n-1) + fibonacciRecursiu(n-2);
    }
    
    public static boolean estaOrdenat(int[] n, int indice){
        //cas base
        if(indice == n.length-1)
            return true;
        //cas general
        if(n[indice]<n[indice+1])
            return estaOrdenat(n,indice+1);
        return false;
    }
    
    public static boolean estaOrdenatLanzadera(int[] n){
        return estaOrdenat(n,0);
    }
    
    public static int potenciaRecursiu(int n, int pot){
        //cas base
        if(pot <= 0)
            return 1;
        //cas general
        return n * potenciaRecursiu(n,pot-1);
    }
    
    public static void mostrarArrayRecursiu(int[] v, int index){
        if(index < v.length){
            System.out.println(v[index]);
            mostrarArrayRecursiu(v, index+1);
        }
        //cas base, res que fer
    }
    
    public static void mostrarArrayRecursiuDelReves(int[] v, int index){
        if(index >= 0){
            System.out.println(v[index]);
            mostrarArrayRecursiuDelReves(v, index-1);
        }
        //cas base, res que fer
    }
    
    public static String reversaCadena(String cadena, int index){
        if(index <= 0)
            return cadena.charAt(index)+"";
        return cadena.charAt(index) + reversaCadena(cadena, index-1);
    }
    
}