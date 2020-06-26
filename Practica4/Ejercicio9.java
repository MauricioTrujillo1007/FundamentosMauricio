import java.util.Scanner;

public class Ejercicio9{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        int mayor=0;
        int menor=100000000;
        
        int num;

        System.out.print("De cuantos numeros se conforma tu serie: ");
        num = sc.nextInt();
        System.out.println("Digite su serie: ");
        
        do { 
            n = sc.nextInt();

            if (n > mayor ){
                mayor = n;
                
            }
            if (n < menor){
                menor = n;
                
            }
            num --;
        }while(num != 0);
        System.out.println("El mayor fue: "+mayor);
        System.out.println("El menor fue: "+menor);
    }
}