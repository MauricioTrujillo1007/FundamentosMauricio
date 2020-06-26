Proceso Ejercicio10
	Definir n1,n2,m Como Entero;
	Repetir
		Escribir 'Ingrise su primer numero: ';
		Leer n1;
		Escribir 'Ingrise su segundo numero: ';
		Leer n2;
	Hasta Que n1<>0 Y n2<>0
	m <- n1 MOD n2;
	Mientras m<>0 Hacer
		n1 <- n2;
		n2 <- m;
		m <- n1 MOD n2;
	FinMientras
	Escribir 'El MCD es ',n2;
FinProceso
