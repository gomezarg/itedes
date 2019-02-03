function ejercicio2(){
	const num = parseInt(prompt('Ingrese un  umero del 1 al 7 y se devolvera un dia de semana: '));

	if(num == 1){
		alert('Lunes');
	} else if (num == 2){
		alert('Martes');
	} else if (num == 3){
		alert('Miercoles');
	} else if (num == 4){
		alert('Jueves');
	} else if (num == 5){
		alert('Viernes');
	} else if (num == 6){
		alert('Sabado');
	} else if (num == 7){
		alert('Domingo');
	} else {
		alert('Opcion invalida');
	}
}

