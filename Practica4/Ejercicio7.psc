Proceso Ejercicio7
	Definir n,contpar,contimp Como Entero;
	contpar <- 0;
	contimp <- 0;
	Escribir 'Coloque su serie de numeros';
	Escribir 'Nota:para terminar colocar un negativo';
	Leer n;
	Mientras n>0 Hacer
		Si n MOD 2=0 Entonces
			contpar <- contpar+1;
			Leer n;
		SiNo
			contimp <- contimp+1;
			Leer n;
		FinSi
	FinMientras
	Escribir 'El numero de pares fue: ',contpar;
	Escribir 'El numero de contimp fue:',contimp;
FinProceso
