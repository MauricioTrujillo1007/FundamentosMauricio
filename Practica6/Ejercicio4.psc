Proceso Ejercicio4
	Definir AH,CA,ahorro Como Real;
	Definir M,deposito Como Entero;
	M <- 12;
	CA <- 0;
	Repetir
		Escribir '¿Cuanto va a depositar?';
		Leer deposito;
		ahorro <- 0.2;
		AH <- deposito*ahorro;
		CA <- CA+AH;
		M <- M-1;
	Hasta Que M=0
	Escribir 'Cantidad ahorada: ',CA;
FinProceso
