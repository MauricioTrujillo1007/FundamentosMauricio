import java.util.Scanner;

public class Ejercicio2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1;
        int n2;

        System.out.println("Escriba sus numeros: ");
        System.out.print("Primer numero:  ");
        n1 = sc.nextInt();
        System.out.print("Segundo numero:  ");
        n2 = sc.nextInt();

        if (n1 > n2){
            System.out.print("el mayor es: "+ n1);
        }else{
            System.out.print("El mayor es: "+ n2);
        }
    }
}