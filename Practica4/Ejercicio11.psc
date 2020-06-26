Proceso Ejercicio11
	Definir i, n, suma Como Entero;
	suma <- 0;
	Escribir 'Introduce un numero: ';
	Leer n;
	Para i<-1 Hasta i < n Con Paso 2 Hacer
		Si n % i=0 Entonces
			suma <- suma+i;
		FinSi
	FinPara
	Si suma = n Entonces
		Escribir n, 'es un numero perfecto';
	SiNo
		Escribir n, 'no es un numero perfecto';
	FinSi
FinProceso
