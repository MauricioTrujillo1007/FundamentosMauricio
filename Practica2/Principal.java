import java.util.Scanner;
public class Principal{

    public static int despliegaMenu(){
        int r = 0;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("1.- C-F");
        System.out.println("2.- F-C");
        System.out.println("3.- K-C");
        System.out.println("4.- K-F");
        System.out.println("5.- F-K");
        System.out.println("6.- C-K");
        System.out.println("Opcion: ");
        r = sc.nextInt();
        return r;
    }

    public static void obtenCF(){
        double C;
        double F;
        Scanner sc = new Scanner(System.in);
        System.out.println("Coloque C");
        C = sc.nextDouble();
        F =(C * 9/5) + 32;
        System.out.println("El resultado de la conversion es: " + F);
    }
    public static void obtenFC(){
        double C;
        double F;
        Scanner sc = new Scanner(System.in);
        System.out.println("Coloque F");
        F = sc.nextDouble();
        C =(F - 32)* 5/9;
        System.out.println("El resultado de la conversion es: " + C);
    }
    public static void obtenKC(){
        double C;
        double K;
        Scanner sc = new Scanner(System.in);
        System.out.println("Coloque K");
        K = sc.nextDouble();
        C =K - 273.15;
        System.out.println("El resultado de la conversion es: " + C);
    }
    public static void obtenKF(){
        double K;
        double F;
        Scanner sc = new Scanner(System.in);
        System.out.println("Coloque K");
        K = sc.nextDouble();
        F =(K -273.15)* 9/5+32;
        System.out.println("El resultado de la conversion es: " + F);
    }
    public static void obtenFK(){
        double K;
        double F;
        Scanner sc = new Scanner(System.in);
        System.out.println("Coloque F");
        F = sc.nextDouble();
        K =(F -32) * 5/9+273.15;
        System.out.println("El resultado de la conversion es: " + K);
    }
    public static void obtenCK(){
        double C;
        double K;
        Scanner sc = new Scanner(System.in);
        System.out.println("Coloque C");
        C = sc.nextDouble();
        K = C+273.15;
        System.out.println("El resultado de la conversion es: " + K);
    }
    public static void main(String[] args) {
        int respuesta;
        
        respuesta= despliegaMenu();
        System.out.println("La respuesta: "+ respuesta);
         
        if (respuesta == 1){
            obtenCF();    
        }
        if (respuesta == 2){
            obtenFC();
        }
        if (respuesta == 3){
            obtenKC();
        }
        if (respuesta == 4){
            obtenKF();
        }
        if (respuesta == 5){
            obtenFK();
        }
        if (respuesta == 6){
            obtenCK();
        } 
    }
}