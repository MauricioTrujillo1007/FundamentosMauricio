import java.util.Scanner;

public class Ejercicio8{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int multi;
        int suma;
        int div;

        System.out.print("Coloque el ultimo numero de su serie: ");
        n = sc.nextInt();

        suma = n+1;
        multi= n*suma;
        div = multi/2;

        System.out.print("La suma de los primeros numeros es: "+div);
    }
}