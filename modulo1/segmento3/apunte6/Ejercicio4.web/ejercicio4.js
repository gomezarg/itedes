function ejercicio4() {
	var num ;
	var sum = 0;
	while(num != 0) {
		num = parseInt(prompt('Ingrese un numero (0 Finalizar): '));
		sum += num;

	}
	alert('La suma de todos los numeros ingresados es : ' + sum);
}