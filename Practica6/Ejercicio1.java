import java.util.Scanner;

public class Ejercicio1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a;
        double b;
        double c;
        double areaT;
        double precio;
        double areaR;
        double areaTri;
        double valorT;

        System.out.print("Ingrese el valor del lado a: ");
        a = sc.nextDouble();
        System.out.print("Ingrese el valor del lado b: ");
        b = sc.nextDouble();
        System.out.print("Ingrese el valor del lado c: ");
        c = sc.nextDouble();
        System.out.print("Ingrese el valor por metro cuadrado: ");
        precio = sc.nextDouble();

        areaTri = ((a-c)*b)/2;
        areaR = b*c;
        areaT = areaTri + areaR;
        valorT= precio * areaT;

        System.out.println("El valor total del terreno es: "+valorT);
        } 
}