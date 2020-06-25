import java.util.Scanner;

public class Suma_de_digitos{   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1;
        int n2;
        int n3;
        int mayor=0; 
        int medio=0; 
        int menor=0;
        double resultado;
        
        System.out.println("Coloque sus tres numeros");
        n1 = sc.nextInt();
        n2 = sc.nextInt();
        n3 = sc.nextInt();

        if (n1 > n2 && n1 > n3){
             mayor = n1;
            if (n2 > n3){
                medio = n2 ;
                menor = n3;
            }else{
                menor = n2;
                medio = n3;
            }
        }
        if (n2 > n1 && n2 > n3){
            mayor = n2;
            if (n1 > n3){
                medio = n1;
                menor = n3;
            }else{
                menor = n1;
                medio = n3;
            }
        }
        if (n3 > n1 && n3 > n2){
            mayor = n3;
            if (n1 > n2 ){
                medio = n1;
                menor = n2;
            }else {
                menor = n1;
                medio = n2;
            }
        }
        resultado = (mayor * medio) + menor;
        System.out.println("El resultado de la multiplicacion de los mayores mas el menor es: " + resultado);
    }
}