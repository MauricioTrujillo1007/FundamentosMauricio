import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int TT;
        double LA;
        double AC;
        double NC;
        int numTarjeta;
        
        System.out.println("¿Cuantas tarjetas tiene?");
        numTarjeta = sc.nextInt();

        if (numTarjeta ==1){
            System.out.println("¿Que tipo de tarjeta pose?");
            TT = sc.nextInt();
            if (TT == 1){
                System.out.println("¿De cuanto era su credito anterior?");
                LA = sc.nextInt();
                AC = 25;
                NC = AC + LA;
                System.out.println("Su nuevo credito seria de: "+NC+"%");
            }
            if (TT == 2){
                System.out.println("¿De cuanto era su credito anterior?");
                LA = sc.nextInt();
                AC = 35;
                NC = AC + LA;
                System.out.println("Su nuevo credito seria de: "+NC+"%");
            }
            if (TT == 3){
                System.out.println("¿De cuanto era su credito anterior?");
                LA = sc.nextInt();
                AC = 40;
                NC = AC + LA;
                System.out.println("Su nuevo credito seria de: "+NC+"%");
            }
            if (TT > 3){
                System.out.println("¿De cuanto era su credito anterior?");
                LA = sc.nextInt();
                AC = 50;
                NC = AC + LA;
                System.out.println("Su nuevo credito seria de: "+NC+"%");
            }
        }
        if(numTarjeta > 1){
            System.out.println("¿Que tarjeta quiere utilizar?");
            TT = sc.nextInt();
            if (TT == 1){
                System.out.println("¿De cuanto era su credito anterior?");
                LA = sc.nextInt();
                AC = 25;
                NC = AC + LA;
                System.out.println("Su nuevo credito seria de: "+NC+"%");
            }
            if (TT == 2){
                System.out.println("¿De cuanto era su credito anterior?");
                LA = sc.nextInt();
                AC = 35;
                NC = AC + LA;
                System.out.println("Su nuevo credito seria de: "+NC+"%");
            }
            if (TT == 3){
                System.out.println("¿De cuanto era su credito anterior?");
                LA = sc.nextInt();
                AC = 40;
                NC = AC + LA;
                System.out.println("Su nuevo credito seria de: "+NC+"%");
            }
            if (TT > 3){
                System.out.println("¿De cuanto era su credito anterior?");
                LA = sc.nextInt();
                AC = 50;
                NC = AC + LA;
                System.out.println("Su nuevo credito seria de: "+NC+"%");
            }
        }
    }
}