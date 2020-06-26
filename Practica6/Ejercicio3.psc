Proceso Ejercicio2
	Definir TT,numTarjeta Como Entero;
	Definir LA,AC,NC Como Real;
	Escribir '¿Cuantas tarjetas tiene?';
	Leer numTarjeta;
	Si numTarjeta=1 Entonces
		Escribir '¿Que tipo de tarjeta pose?';
		Leer TT;
		Si TT=1 Entonces
			Escribir '¿De cuanto credito disponia anteriormente?';
			Leer LA;
			AC <- 25;
			NC <- AC+LA;
			Escribir 'Su nuevo credito es de ',NC,'%';
		FinSi
		Si TT=2 Entonces
			Escribir '¿De cuanto credito disponia anteriormente?';
			Leer LA;
			AC <- 35;
			NC <- AC+LA;
			Escribir 'Su nuevo credito es de ',NC,'%';
		FinSi
		Si TT=3 Entonces
			Escribir '¿De cuanto credito disponia anteriormente?';
			Leer LA;
			AC <- 40;
			NC <- AC+LA;
			Escribir 'Su nuevo credito es de ',NC,'%';
		FinSi
		Si TT>3 Entonces
			Escribir '¿De cuanto credito disponia anteriormente?';
			Leer LA;
			AC <- 50;
			NC <- AC+LA;
			Escribir 'Su nuevo credito es de ',NC,'%';
		FinSi
	FinSi
	Si numTarjeta>1 Entonces
		Escribir '¿Que tarjeta quiere utilizar?';
		Leer TT;
		Si TT=1 Entonces
			Escribir '¿De cuanto credito disponia anteriormente?';
			Leer LA;
			AC <- 25;
			NC <- AC+LA;
			Escribir 'Su nuevo credito es de ',NC,'%';
		FinSi
		Si TT=2 Entonces
			Escribir '¿De cuanto credito disponia anteriormente?';
			Leer LA;
			AC <- 35;
			NC <- AC+LA;
			Escribir 'Su nuevo credito es de ',NC,'%';
		FinSi
		Si TT=3 Entonces
			Escribir '¿De cuanto credito disponia anteriormente?';
			Leer LA;
			AC <- 40;
			NC <- AC+LA;
			Escribir 'Su nuevo credito es de ',NC,'%';
		FinSi
		Si TT>3 Entonces
			Escribir '¿De cuanto credito disponia anteriormente?';
			Leer LA;
			AC <- 50;
			NC <- AC+LA;
			Escribir 'Su nuevo credito es de ',NC,'%';
		FinSi
	FinSi
FinProceso
