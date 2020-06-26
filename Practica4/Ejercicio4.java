import java.util.Scanner;

public class Ejercicio4{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n1;
        int n2;
        int n3;
        double suma;
        double promedio;

        System.out.println("Escriba sus numeros: ");
        System.out.print("Primer numero: ");
        n1 = sc.nextInt();
        System.out.print("Segundo numero: ");
        n2 = sc.nextInt();
        System.out.print("Tercer numero: ");
        n3 = sc.nextInt();

        suma = n1+n2+n3;
        promedio = suma/3;
        System.out.print("El promedio es: "+ promedio);
    }
}