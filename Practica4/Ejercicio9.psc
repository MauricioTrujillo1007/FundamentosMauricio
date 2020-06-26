Proceso Ejercicio9
	Definir n,num Como Entero;
	Definir ma,me Como Entero;
	ma <- 0;
	me <- 100000000;
	Escribir 'De cuantos numeros se conforma su serie';
	Leer num;
	Escribir 'Digite su serie';
	Mientras  NO num=0 Hacer
		Leer n;
		Si n>ma Entonces
			ma <- n;
		FinSi
		Si n<me Entonces
			me <- n;
		FinSi
		num <- num-1;
	FinMientras
	Escribir 'El mayor fue: ',ma;
	Escribir 'El menor fue: ',me;
FinProceso
