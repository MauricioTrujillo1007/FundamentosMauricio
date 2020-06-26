Proceso Ejercicio1
	Definir a,b,c,areaR,areaTri Como Real;
	Definir areaT,precio,valorT Como Real;
	Escribir 'Ingrese el valor del lado a: ';
	Leer a;
	Escribir 'Ingrese el valor del lado b: ';
	Leer b;
	Escribir 'Ingrese el valor del lado c: ';
	Leer c;
	Escribir 'Ingrese el valor por metro cuadrado: ';
	Leer precio;
	areaTri <- ((a-c)*b)/2;
	areaR <- b*c;
	areaT <- areaTri+areaR;
	valorT <- precio*areaT;
	Escribir 'El valor total del terreno es de: ',valorT;
FinProceso
