/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numeroenlletra;

/**
 *
 * @author sebbre
 */
public class NumeroEnLletra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(digitCentenes(935));
    }
    
    static int digitUnitats(int q){ return q%10;}
    static int digitDesenes(int q){ return (q%100)/10;}
    static int digitCentenes(int q){ return (q%1000)/100;}
    static String digitEnLletres(int dig){
        String[] lletres = {"zero", "u", "dos", "tres", "quatre", "cinc", "sis", "set","vuit", "nou"};
        return lletres[dig];
    }
    static String desenaEnLletres(int des) {
        String[] lletres = {"deu", "vint", "trenta", "quaranta", "cinquanta", "seixanta", "setanta", "vuitanta","noranta", "nou"};
        return lletres[des];
    }
    static String desena1EnLletres(int uni){
        String[] lletres = {"deu", "onze", "dotze", "tretze", "catorze", "quinze", "setze", "deset","divuit", "dinou"};
        return lletres[uni];
    }
    
    static String tresDigitsEnLletres(int q3){
        String cadena = "";
        int centenes = digitCentenes(q3);
        int desenes = digitDesenes(q3);
        int unitats = digitUnitats(q3);
        if(centenes == 1)
            cadena += "cent";
        else if(centenes > 1)
            cadena += digitEnLletres(centenes+1)+"-"+"cents";
        if(desenes > 1)
            cadena += " "+desenaEnLletres(desenes+1)+"-";
        else if(desenes == 1)
            cadena += " "+desena1EnLletres(desenes+1)+"-";
        return cadena;
    }
}
