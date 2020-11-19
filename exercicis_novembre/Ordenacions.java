/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordenacions;

/**
 *
 * @author sebas
 */
public class Ordenacions {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] vector = {4,2,3,8,1,5};
        int[] v = vector.clone();//PEr a copiar el contingut d'un array
        int aux;
        String canvi = "";
        int contador_pasos = 0;
        
        
        //bambolla
        System.out.println("Bambolla de major a menor");
        //Mostre loriginal
        for(int k = 0; k< v.length;k++)
            System.out.print(v[k]+" ");
        System.out.println(canvi+"\n");
        //Algoritme de bambolla de major a menor
        for(int i = 0; i <v.length;i++){
            for(int j = v.length-1;j>i;j--){
                contador_pasos++;//Per conter en cuants pasos fa lordenacio
                if(v[j] > v[j-1]){
                    canvi = " s'ha fet el canvi "+v[j]+" per "+v[j-1];
                    aux = v[j];
                    v[j] = v[j-1];
                    v[j-1] = aux;
                }else{
                    canvi = "";
                }
                //mostre el array com va
                for(int k = 0; k< v.length;k++)
                        System.out.print(v[k]+(k==j? ".":"")+" ");//OJO ací, gaste un condicional que no haveu vist (variable==variable ? si:no)
                    System.out.println(canvi+"\n");
            }
        }
        System.out.println("Shan fet: "+contador_pasos+" pasos");
        
        //Bambolla de menor a major
        contador_pasos = 0;
        v = vector.clone();//Per a copiar el contingur de un array
        System.out.println("Bambolla de menor a major");
        //Mostre loriginal
        for(int k = 0; k< v.length;k++)
            System.out.print(v[k]+" ");
        System.out.println("\n");
        //Algoritme de bambolla de menor a major
        for(int i = 0; i <v.length;i++){
            for(int j = v.length-1;j>i;j--){
                contador_pasos++;//Per contar en cuants pasos fa lordenacio
                if(v[j] < v[j-1]){//Aci esta lunic canvi
                    canvi = " s'ha fet el canvi "+v[j]+" per "+v[j-1];
                    aux = v[j];
                    v[j] = v[j-1];
                    v[j-1] = aux;
                }else{
                    canvi = "";
                }
                for(int k = 0; k< v.length;k++)
                    System.out.print(v[k]+(k==j? ".":"")+" ");//OJO ací, gaste un condicional que no haveu vist (variable==variable ? si:no)
                System.out.println(canvi+"\n");
            }
        }
        System.out.println("Shan fet: "+contador_pasos+" pasos");
        
        /********************************************************************/
        /********************************************************************/
        /********************************************************************/
        //Algorisme de selecció
        contador_pasos = 0;
        v = vector.clone();//Per a copiar el contingur de un array
        System.out.println("selecció de menor a major");
        //Mostre loriginal
        for(int k = 0; k< v.length;k++)
            System.out.print(v[k]+" ");
        System.out.println("\n");
        //Algoritme de selecció de menor a major
        aux = 0;
        int pos_min = 0;
        
        for(int i = 0; i < v.length-1; i++){
            pos_min = i;
            for(int j= i+1; j< v.length; j++){
                contador_pasos++;//Per conter en cuants pasos fa lordenacio
                if(v[j] < v[pos_min]){
                    pos_min = j;
                }
            }
            canvi = " s'ha fet el canvi "+v[pos_min]+" per "+v[i];
            aux = v[pos_min];
            v[pos_min] = v[i];
            v[i] = aux;
            for(int k = 0; k< v.length;k++)
                System.out.print(v[k]+(k==i? ".":"")+" ");//OJO ací, gaste un condicional que no haveu vist (variable==variable ? si:no)
            System.out.println(canvi+"\n");
        }
        System.out.println("Shan fet: "+contador_pasos+" pasos");
        
        //Algoritme de selecció de major a menor
        contador_pasos = 0;
        v = vector.clone();//Per a copiar el contingur de un array
        System.out.println("selecció de major a menor");
        //Mostre loriginal
        for(int k = 0; k< v.length;k++)
            System.out.print(v[k]+" ");
        System.out.println("\n");
        //Algoritme de selecció de Major a menor
        aux = 0;
        int pos_max = 0;
        
        for(int i = 0; i < v.length-1; i++){
            pos_max = i;
            for(int j= i+1; j< v.length; j++){
                contador_pasos++;//Per conter en cuants pasos fa lordenacio
                if(v[j] > v[pos_max]){
                    pos_max = j;
                }
            }
            canvi = " s'ha fet el canvi "+v[pos_max]+" per "+v[i];
            aux = v[pos_max];
            v[pos_max] = v[i];
            v[i] = aux;
            for(int k = 0; k< v.length;k++)
                System.out.print(v[k]+(k==i? ".":"")+" ");//OJO ací, gaste un condicional que no haveu vist (variable==variable ? si:no)
            System.out.println(canvi+"\n");
        }
        System.out.println("Shan fet: "+contador_pasos+" pasos");
                
        
        /********************************************************************/
        /********************************************************************/
        /********************************************************************/
        //Algorisme de insercio directa
        contador_pasos = 0;
        v = vector.clone();//Per a copiar el contingur de un array
        System.out.println("Insercio directa de menor a major");
        //Mostre loriginal
        for(int k = 0; k< v.length;k++)
            System.out.print(v[k]+" ");
        System.out.println("\n");
        //Algoritme d'insercio directa de menor a major
        aux = 0;
        int j;
        for(int i = 1; i < v.length; i++){
            aux = v[i];
            j = i-1;
            while(j >= 0 && aux < v[j]){
                contador_pasos++;//Per conter en cuants pasos fa lordenacio
                v[j+1] = v[j];
                j--;
            }
            canvi = " s'ha fet el canvi "+v[j+1]+" per "+aux;
            v[j+1] = aux;
            for(int k = 0; k< v.length;k++)
                System.out.print(v[k]+(k==i? ".":"")+" ");//OJO ací, gaste un condicional que no haveu vist (variable==variable ? si:no)
            System.out.println(canvi+"\n");
        }
        System.out.println("Shan fet: "+contador_pasos+" pasos");
        
        contador_pasos = 0;
        v = vector.clone();//Per a copiar el contingur de un array
        System.out.println("Insercio directa de major a menor");
        //Mostre loriginal
        for(int k = 0; k< v.length;k++)
            System.out.print(v[k]+" ");
        System.out.println("\n");
        //Algoritme d'insercio directa de major a menor
        aux = 0;
        for(int i = 1; i < v.length; i++){
            aux = v[i];
            j = i-1;
            while(j >= 0 && aux > v[j]){
                contador_pasos++;//Per conter en cuants pasos fa lordenacio
                v[j+1] = v[j];
                j--;
            }
            canvi = " s'ha fet el canvi "+v[j+1]+" per "+aux;
            v[j+1] = aux;
            for(int k = 0; k< v.length;k++)
                System.out.print(v[k]+(k==i? ".":"")+" ");//OJO ací, gaste un condicional que no haveu vist (variable==variable ? si:no)
            System.out.println(canvi+"\n");
        }
        System.out.println("Shan fet: "+contador_pasos+" pasos");
    }
    
}



