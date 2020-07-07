public class Ordenar {
    public static void main(String[] args) {
        
        int[] arr, arrOrd;
        int n = 50;   //tamaño del arreglo
        int r = 100; //rango de aleatorios

        arr = generaArreglo(n,r);

        imprimirArreglo(n,arr);

        arrOrd = ordenaArreglo(n,arr);

        imprimirArreglo(n,arrOrd);
        
    }

    public static int[] generaArreglo( int n, int r  ){
        int ind;
        int []  arr = new int[n];

        for ( ind=0; ind <n ; ind++){
            arr[ind] = (int)(Math.random()*r);
        }
        return arr;
    }

    public static void imprimirArreglo( int n, int[] arr ){
        int ind;
        for (ind=0; ind<n; ind++){
            System.out.println(arr[ind]+" ");
        }
        
        System.out.println("****************");
        System.out.println("****************");
    }

    public static int[] ordenaArreglo(int n, int[] arr){
        int [] arrOrd = new int [arr.length]; 

        for (int i=0; i<arr.length; i++){
            int posmenor=0;
            for (int j=0; j<arr.length; j++){
                if (arr[j] > arr[posmenor]){
                    posmenor=j;
                }
            }
            arrOrd[i] = arr[posmenor];
            arr[posmenor] = Integer.MIN_VALUE;
        }
        return arrOrd;
    }
}