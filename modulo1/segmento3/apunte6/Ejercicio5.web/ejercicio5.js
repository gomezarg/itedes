function ejercicio5 (){
	var num ;
	var max = 0;
	while(num != 0) {
		num = parseInt(prompt('Ingrese un numero (0 Finalizar): '));
		if (num >= max)
			max = num

	}
	alert('El mayor  de todos los numeros ingresados es : ' + max);
}