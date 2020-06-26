import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
   
        int op;
        double a, b, r;
   
        do{
   
       System.out.println("\n1.-suma");
       System.out.println("2.-Resta");
       System.out.println("3.-Multiplicacion");
       System.out.println("4.-Divisio");
       System.out.println("5.-Factorial");
       System.out.println("6.-Combinacion de elmentos");
       System.out.println("7.-Aproximacion a exponencial");
       System.out.println("8.-Salir");
       System.out.println("Selecciona una opcion");
   
       op = sc.nextInt();
   
       switch(op){
           case 1: //suma
              a = solicitarOperando();
              b = solicitarOperando();
              r= sumar(a,b);
               imprimeResultado(r);
           break;
           case 2: //resta
              a = solicitarOperando();
              b = solicitarOperando();
              r=restar(a,b);
              imprimeResultado(r);
           break;
           case 3: //multiplicacion
              a = solicitarOperando();
              b = solicitarOperando();
              r=multiplicar(a,b);
              imprimeResultado(r);
           break;
           case 4: //division
              a = solicitarOperando();
              b = solicitarOperando();
              r=dividir(a,b);
              imprimeResultado(r);
           break;
           case 5: //Factorial
              a = solicitarOperando();
              r = factorial(a);
              imprimeResultado(r);
           break;
           case 6: //Combinacion de elemntos
              a = solicitarOperando();
              b = solicitarOperando();
              r = combinacionDeElemntos(a,b);
              imprimeResultado(r);
           break;
           case 7: //Aproximacion
              a = solicitarOperando();
              b = solicitarOperando();
              r = aproximacion(a,b);
              imprimeResultado(r);
           break;
           case 8: System.out.println("Apagando calculadora");
           break;
           default :System.out.println("opcion no valida"); 
       }
   
        }while(op !=8);
    } 
    public static double imprimeResultado(double res){
       System.out.println("El resultado es: "+res);
       return res;
    }
    public static double solicitarOperando(){
        double x;
   
        Scanner sc = new Scanner(System.in);
        System.out.print("Operando = ");
        x = sc.nextDouble();
        
        return x;
    }
    public static double sumar(double x, double y){
        double  r;
        r = x+y;
        
        System.out.println("Resultado = "+r);
        return r;
    }
    public static double restar(double x, double y){
        double r;
        r = x-y;

        System.out.println("Resultado = "+r);
        return r;
    }
    public static double multiplicar(double x, double y){
        double r;
        r = x*y;

        System.out.println("Resultado = "+r);
        return r;
    }
    public static double dividir(double x, double y){
        double r;
        r = x/y;

        System.out.println("Resultado = "+r);
        return r;
    }
    public static double factorial(double x){
        double r = 1;

        for (int i=1; i<=x; i++){
            r= r*i;
        }
        return r;
    }
    public static double combinacionDeElemntos(double x, double y){
        double r;

        return r;
    }
    public static double aproximacion(double x,double y){
        double r;

        return r;
    }
}