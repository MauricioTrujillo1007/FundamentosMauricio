import java.util.Scanner;

public class Triangulo{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1;
        int n2;
        int n3;

        System.out.print("Escriba su primer longitud: ");
        n1 = sc.nextInt();
        System.out.print("Escriba su segunda longitud: ");
        n2 = sc.nextInt();
        System.out.print("Escriba su tercer longirud: ");
        n3 = sc.nextInt();

        if (n1 > n2+n3){
            System.out.println("Se puede hacer el triangulo");
        }else{
        if (n2 > n1+n3){
            System.out.println("Se puede hacer el triangulo");
        }else{
    }
        if (n3 > n1+n2){
            System.out.println("Se puede hacer el triangulo");
        }else{
            System.out.println("No se puede hacer el triangulo");
        }
      }
    }
}