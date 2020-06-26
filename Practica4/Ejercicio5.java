import java.util.Scanner;

public class Ejercicio5{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i;
        int num;
        int contador=0;
        double promedio;
        int numei;

        System.out.print("Cunatos numeros va a poner: ");
        numei= sc.nextInt();

        for (i=1; i <=numei;i++){
            num = sc.nextInt();
            contador = contador+num;
            
        }
        promedio = contador/numei;
        System.out.print("El promedio es: "+promedio);
    }
}