import java.util.*;

public class DivideYVenceras{
    public static void main(String args[]){
        Scanner teclat = new Scanner(System.in);
        
        int minim , maxim;
        int pregunta;
        int numero;
        char lletra = 'a';
        
        System.out.println("Donam el primer: ");
        minim = teclat.nextInt();
        System.out.println("Donam el segon: ");
        maxim = teclat.nextInt();
        System.out.println("Donam el numero pensat");
        numero = teclat.nextInt();
        pregunta = ((maxim-minim)/2)+minim;
        //while(lletra != '='){
        while(pregunta != numero){
           /* do{
                System.out.println("Es el numero :"+pregunta+" ?");
                lletra = teclat.next().charAt(0);
            }while(!(lletra == '-' || lletra == '+' || lletra == '='));
            */
            //He de vore si es menor o major o ha encertat
            if(pregunta == numero){
                System.out.println("He encertat");
            }else if(pregunta < numero){
                minim  = pregunta;
                pregunta = ((maxim-minim)/2)+minim;
            }else{
                maxim = pregunta;
                pregunta = ((maxim-minim)/2)+minim;
            }
            System.out.println("Es el numero :"+pregunta+" ? "+numero);
            /*
            if(lletra == '='){
                System.out.println("He encertat");
            }else if(lletra == '+'){
                minim  = pregunta;
                pregunta = ((maxim-minim)/2)+minim;
            }else{
                maxim = pregunta;
                pregunta = ((maxim-minim)/2)+minim;
            }*/
        }
        
    }
}
