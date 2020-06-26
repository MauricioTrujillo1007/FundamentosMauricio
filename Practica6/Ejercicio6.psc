SubProceso Real <- sumar ( x , z )
	Definir r Como Real;
	r=x + z ;
Fin SubProceso
SubProceso Real <- resta ( x , z )
	Definir r Como Real;
	r=x - z ;
Fin SubProceso
SubProceso Real <- multiplicar ( x , z )
	Definir r Como Real;
	r=x * z ;
Fin SubProceso
SubProceso Real <- dividir ( x , z )
	Definir r Como Real;
	r=x / z ;
Fin SubProceso
SubProceso Real <- factorial ( x , z )
	Definir r Como Real;
	Definir i Como Entero;
	Para i <- 1 Hasta x Con Paso 1 Hacer
		r <- r*i;
	Fin Para
Fin SubProceso
SubProceso Real <- solicitaOperando ( )
	Definir x Como Real;
	Escribir 'Operando =';
	Leer x;
Fin SubProceso

SubProceso Real <- imprimeResultado ( r )
	Escribir 'El resultado es: ',r;
Fin SubProceso

Proceso Ejercicio6
	Definir op Como Entero;
	Definir a,b,r Como Real;
	Repetir
		Escribir '1.-suma';
		Escribir '2.-resta';
		Escribir '3.-multiplicacion';
		Escribir '4.-division';
		Escribir '5.-factorial';
		Escribir '6.-combinacion de elemento';
		Escribir '7.-aproximacion';
		Escribir '8.-salir';
		Escribir 'Seleccione una opcion';
		Leer op;
		Segun op Hacer
			opcion_1:
				a = solicitaOperando();
				b = solicitaOperando();
				r = sumar(a,b);
				
			opcion_2:
				a = solicitaOperando();
				b = solicitaOperando();
				r = resta(a,b);
				
			opcion_3:
				a = solicitaOperando();
				b = solicitaOperando();
				r = multiplicar(a,b);
				
			opcion_4:
				a = solicitaOperando();
				b = solicitaOperando();
				r = dividir(a,b);
				
			opcion_5:
				a = solicitaOperando();
				b = solicitaOperando();
				r = factorial(a,b);
				
			opcion_6:
				Escribir 'Apagando calculadora';
			De Otro Modo:
				Escribir 'Opcion no valida';
		Fin Segun
	Hasta Que op <> 6
FinProceso
