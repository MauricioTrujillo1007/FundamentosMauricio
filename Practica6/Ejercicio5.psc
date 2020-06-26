Proceso Ejercicio5
	Definir N,CN,V,TD Como Real;
	Definir T1,T2,T3,TT Como Real;
	Definir A,B,C Como Entero;
	A <- 0;
	B <- 0;
	C <- 0;
	TT <- 0;
	TD <- 0;
	Escribir '¿Cunatas ventas se realizaron';
	Leer N;
	Escribir 'Digite el precio por la venta hecha: ';
	Repetir
		Leer V;
		Si V>1000 Entonces
			A <- A+1;
		FinSi
		Si V>500 Y V<1000 Entonces
			B <- B+1;
		FinSi
		Si V<=500 Entonces
			C <- C+1;
		FinSi
		N <- N-1;
		TD <- V+TD;
	Hasta Que N=0
	T1 <- A;
	T2 <- B;
	T3 <- C;
	TT <- T1+T2+T3;
	Escribir 'Total de ventas de mas de mil: ',T1;
	Escribir 'Total de ventas de mas de quinientos pero menos de mil: ',T2;
	Escribir 'Total de ventas de menos o igual a quinientos: ',T3;
	Escribir 'Total de ventas: ',TT;
	Escribir 'Total de dinero recaudado: ',TD;
FinProceso
