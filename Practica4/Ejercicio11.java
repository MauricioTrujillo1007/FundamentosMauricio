import java.util.Scanner;

public class Ejercicio11{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int i; 
        int suma = 0;
        int  n;
       
        System.out.print("Introduce un número: ");
        n = sc.nextInt();
        for (i = 1; i < n; i++) {                              
            if (n % i == 0) {
                suma = suma + i;   
            }
        }
        if (suma == n) {                         
            System.out.println(n+ " es un numero perfecto");
        } else {
            System.out.println(n+" no es un numero perfecto");

        }
    }
}