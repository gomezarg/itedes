function ejercicio2(){
	const number = prompt('Ingrese un numero del 1 al 7 : ');

	if(number == 1){
		alert('Lunes');
	} else if (number == 2){
		alert('Martes');
	} else if (number == 3){
		alert('Miercoles');
	} else if (number == 4){
		alert('Jueves');
	} else if (number == 5){
		alert('Viernes');
	} else if (number == 6){
		alert('Sabado');
	} else if (number == 7){
		alert('Domingo')
	} else {
		alert('Numero ingresado incorrecto!');
	}
}
