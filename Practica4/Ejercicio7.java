import java.util.Scanner;

public class Ejercicio7{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        int contpar=0;
        int contimp=0;

        System.out.println("Coloque su sereie de numero: ");
        System.out.println("NOTA: para terminar la serie coloque un negativo");
        n = sc.nextInt();

        while(n>0){
            if ( n % 2 == 0){
                contpar++;
                n = sc.nextInt();
            }else{
                contimp++;
                n = sc.nextInt();
            }
        }
        System.out.println("El numero de paraes es: "+contpar);
        System.out.println("El numero de impares es: "+contimp);
    }
}