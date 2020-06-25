import java.util.Scanner;

public class Numeros_primos{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int numero;
        int contador=0;
        int n;

        System.out.print("Escriba su numero: ");
        numero = sc.nextInt();

        for (n=1 ; n<=numero ;n++){
            if ((numero%n)==0){
                contador++;
            }
        }
        if (contador <= 2){
            System.out.print("Es primo el numero: " + numero);
        }else{
            System.out.print("No es primo el numero: " + numero);
        }
    }
}