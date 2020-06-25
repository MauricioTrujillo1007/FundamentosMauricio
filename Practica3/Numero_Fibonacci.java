import java.util.Scanner;

public class Numero_Fibonacci{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero;
        int num1;
        int num2;
        int i;
        
        do{
            System.out.print("Introduce numero mayor que 1: ");
            numero = sc.nextInt();
        }while(numero<=1);
        
        System.out.println("Los " + numero + " primeros términos de la serie de Fibonacci son:");                 
        
        num1=1;
        num2=1;
        
        System.out.print(num1 + " ");
        for(i=2;i<=numero;i++){
            System.out.print(num2 + " ");
            num2 = num1 + num2;
            num1 = num2 - num1;
        }
        System.out.println();
        
    }
}
