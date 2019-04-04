function ejercicio2(){
	const name = prompt('Ingrese su nombre');
	const password = prompt('Ingrese password: ');

	if(name == 'juan' && password == '1234' || name == 'pedro' && password == '5678'){
		alert(`Hola ${name}`);
	} else {
		alert('Error! USUARIO INVALIDO');
	}
}

