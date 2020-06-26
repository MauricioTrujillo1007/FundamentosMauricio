import java.util.Scanner;

public class Ejercicio10{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n1;
        int n2;
        int m; 

        do{
        System.out.println("Ingrese el primer número");
        n1 = sc.nextInt();
        System.out.println("Ingrese el segundo número");
        n2 = sc.nextInt();
        }while(n1 == 0 && n2 == 0);

        m = n1 % n2;

        while (m !=0){
            n1 = n2;
            n2 = m;
            m = n1 % n2; 
        }
        System.out.println("El MCD es: "+n2);
    }
}