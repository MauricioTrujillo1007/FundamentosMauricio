import java.util.Scanner;

public class Ejercicios{
    public static void main(String[] args){

        
        Scanner sc = new Scanner(System.in);

        //Ejercicio 1
        double d;
        double t;
        double v;
        
        System.out.println("Por favor coloque la distancia:");

        d = sc.nextDouble();
        System.out.println("Por favor coloque el tiempo:");

        t = sc.nextDouble();
        

        v = d/t;
        System.out.println("La velocidad es: " + v);
        

        //Ejercicio 2
     
        double r;
        double D;
        double r2;
        double potencia=3;

        System.out.println("Por favor coloque el radio: ");
        r = sc.nextDouble();

        r2 =Math.pow(r , potencia);

        D = Math.PI*r2;
        System.out.println("El diametro es " + D);
        

        //Ejercicio 3

        int i;
        int f;
        int multiplicacion;
        int suma;

        System.out.println("Coloque el ultimo numero de su serie de numeros: ");
        f = sc.nextInt();
        i = f+1; 
        multiplicacion= i*f;
        suma = multiplicacion/2;
        System.out.println("La suma es: "+ suma);
       

        //Ejercicio 4

        double x1;
        double x2;
        double y1;
        double y2;
        double distancia;
        double resta1;
        double resta2;
        double potencia1;
        double potencia2;
        byte pot=2;
        double suma1;
        
        System.out.println("Coloque su puntos en orden x1, x2, y1, y2");
        x1 = sc.nextDouble();
        x2 = sc.nextDouble();
        y1 = sc.nextDouble();
        y2 = sc.nextDouble();

        resta1= x2-x1;
        resta2 =y2-y1;
        potencia1= Math.pow(resta1 , pot);
        potencia2= Math.pow(resta2 , pot);
        suma1= potencia1 + potencia2;
        distancia =Math.sqrt(suma1);

        System.out.println("La distancia es: " + distancia);
        

        //Ejercicio 5
        int n1;
        int n2;
        int n3;
        

        System.out.println("Coloque el primer numero");
        n1 = sc.nextInt();
        System.out.println("Coloque el segundo numero");
        n2 = sc.nextInt();
        System.out.println("Coloque el tercer numero");
        n3 = sc.nextInt();

        if (n1 > n2) {
          if (n1 > n3) {
              System.out.println("El mayor es: " + n1);                                             
          } else {
              System.out.println("el mayor es: " + n3);     
          }
      } else if (n2 > n3) {
          System.out.println("el mayor es: " + n2);
      } else {
          System.out.println("el mayor es: " + n3);
      }
      
      //Ejercicio 6
      int a;
      int b;
      double b2;
      int c;
      double multiplicacion1;
      int pot2=2;
      double restaE;
      double raiz;
      double multiplicacion2;
      double x3;
      double x4;

      System.out.println("Coloque los numeros en el orden a, b, c");
      a = sc.nextInt();
      b = sc.nextInt();
      c = sc.nextInt();

      multiplicacion1 = 4*a*c;
      b2=  Math.pow ( b, pot2);
      multiplicacion2 =2*a;
      restaE= b2 - multiplicacion1;
      raiz= Math.sqrt(restaE);
      x3=(-b+raiz)/multiplicacion2;
      x4=(-b-raiz)/multiplicacion2;

      System.out.println("la primera x es: " + x3);
      System.out.println("La segunda x es: " + x4);

      
    
  
  }
}