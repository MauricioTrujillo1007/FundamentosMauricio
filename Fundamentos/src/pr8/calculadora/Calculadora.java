package pr8.calculadora;

public class Calculadora {
	Pantalla p;
	Teclado t;
	Procesador proc;
	
	public Calculadora() {
		this.p = new Pantalla();
		this.t = new Teclado();
		this.proc = new Procesador();
	}
	
	public void on() {
		Complejo c1,c2,cr;
		String op;
		System.out.println("Prendiendo calculadora..");
		
		do {
		System.out.println("(+)Sumar");
		System.out.println("(-)Restar");
		System.out.println("(*)Multiplicar");
		System.out.println("(/)Dividir");
		System.out.println("(off)Apagar");
		
		c1 = t.capturaComplejo();
		op = t.capturaOper();
		c2 = t.capturaComplejo();
		
		switch(op) {
		case "+":   cr = proc.sumar(c1, c2);
					p.imprimirComplejo(cr);
					break;
					
		case "-": cr = proc.restar(c1, c2);
					p.imprimirComplejo(cr);
					break;

		case "*": cr = proc.multiplicar(c1, c2);
					p.imprimirComplejo(cr);
					break;
					
		case "/": cr = proc.dividir(c1, c2);
					p.imprimirComplejo(cr);
					break;
					
		case "off": System.out.println("Apagando calculadora");
					break;
					
		default: System.out.println("Op no válido");
		}
		
		}while(!op.equals("off"));
	}
}