function ejercicio2() {
	let otro = 'si';

	while(otro == 'si') {
		alert("Ingrese 2 numeros para sumar");
        num1 = parseInt(prompt('Ingrese un numero: '));
        num2 = parseInt(prompt('Ingrese otro numero: '));
        let suma = num1 + num2 ;
        alert (suma);
		otro = prompt('Desea realizar otra suma ( si/no ): ');
	}
}