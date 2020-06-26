import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double AH;
        int M;
        double CA; 
        int deposito;
        double ahorro;

        M =12;
        CA=0;
        do{
        System.out.println("¿Cuanto va a depositar?");
        deposito = sc.nextInt();
        ahorro = 0.2; 
        AH = deposito * ahorro;
        CA = CA + AH;

        M -=1;
        }while(M !=0);

        System.out.println("Cantidad ahorrada: "+CA);
    }
}