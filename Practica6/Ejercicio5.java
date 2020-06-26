import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double N;
        double CN;
        int A=0;
        int B=0;
        int C=0;
        double V;
        double T1;
        double T2;
        double T3;
        double TT=0;
        double TD=0;

        System.out.println("\n¿Cunatas ventas se realizaron?");
        N = sc.nextInt();
        System.out.println("Digite el precio por la venta hecha: ");

        do{
            V = sc.nextDouble();

            if (V > 1000){
                A++;
            }

            if (V > 500 && V < 1000){
                B++;
            }

            if (V <= 500){
                C++;
            }

            N -=1; 
            TD = V + TD;
        }while( N > 0);

        T1 = A;
        T2 = B;
        T3 = C;
        TT = T1 + T2 + T3;

        System.out.println("\nTotal de ventas de mas de mil: "+T1);
        System.out.println("\nTotal de ventas de mas de quinientos pero menos de mil: "+T2);
        System.out.println("\nTotal de ventas de menos o igual a quinientos: "+T3);
        System.out.println("\nTotal de ventas: "+TT);
        System.out.println("\nTotal de dinero recaudado: "+TD);
        
    }
}