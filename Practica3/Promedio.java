import java.util.Scanner;

public class Promedio{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int contador=0;
        int numero;
        int cantidad=1000;
        float promedio;
        float suma=0;
     

        System.out.println("Ingresar su serie de numeros: ");
        numero = sc.nextInt();

        for (int i=1; i<=cantidad; i++){
            numero = sc.nextInt();
            if (numero > 0){
                suma = suma + numero;
                contador++;
            }else {
                System.out.println("Coloco un numero negativo, pruebe otra vez");
                return;
            }
        }
        promedio = suma / contador;
        System.out.print("El promedio es: "+promedio);
    }
}