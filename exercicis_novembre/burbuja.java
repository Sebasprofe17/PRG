

class burbuja{
    public static void main(String[] args){
        int[] x = {7,4,3,6,5,1};
        int aux;
        
        for (int i= x.length-1; i>= 0; i-- ){
            for (int k= 0; k< x.length; k++ )
                System.out.print(x[k]);
            System.out.print('\n');
            for(int j= 0; j<i ; j++){
                if(x[j] > x[j+1]){
                    aux = x[j+1];
                    x[j+1] = x[j];
                    x[j] = aux;
                }
            }
            
            ///Solo para ver cambios
           
        }
    }
}
