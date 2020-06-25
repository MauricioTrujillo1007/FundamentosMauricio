import java.util.Scanner;

public class Escala_de_calificaciones {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        double calificacion;
        double NA=5.9;
        double B=7.4;
        double MB=10;

        System.out.println("Dijite su calificacion");
        calificacion = sc.nextDouble();
        if (calificacion <= NA){
            System.out.println("Su calificacion es: NA");
        }
        if (calificacion > NA && B >= calificacion){
            System.out.println("Su calificacion es: B");
        }
        if (calificacion > B && MB >= calificacion){
            System.out.println("Su calificacion es: MB");
        }
        if (calificacion > MB){
            System.out.println("Esa calificacion no existe");
        }
    }
}
