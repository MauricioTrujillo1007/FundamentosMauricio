import java.util.Scanner;

public class Numeros_Padovan{
    public static int sucesionPadovan(int n)
    {
        if(n == 0 || n == 1 || n == 2){
            return 1;
        }else{
            return sucesionPadovan(n-2) + sucesionPadovan(n-3);
    }
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        int i;

        System.out.print("Escriba los primeros numeros que quiere de Padovan: ");
        n = sc.nextInt();

        for ( i=0 ; i <= n ; i++){
            System.out.println(sucesionPadovan(i));
        }
    }
}