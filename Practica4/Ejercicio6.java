import java.util.Scanner;

public class Ejercicio6{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double r;
        double area;

        System.out.print("Coloque su radio: ");
        r = sc.nextDouble();

        area= Math.PI * Math.pow(r ,2);

        System.out.println("El area es: "+area);
    }
}