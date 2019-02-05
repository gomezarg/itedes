function multiplos(){
	var number1 = parseInt(prompt('Ingrese un numero : '));
	var number2 = parseInt(prompt('Ingrese otro numero : '));
	var result = "";

	if(number1%number2 == 0 && number2%number1 == 0){
		result = 'Ambos numeros son  multiplos !';
	} else if (number1%number2 == 0) {
		result = " El primer numero (" + number1 + ") es multiplo del segundo numero (" + number2 + ") !";
	} else if (number2%number1 == 0){
		result = "El segundo numero (" + number2 + ") es multiplo del primer numero (" + number1 + ") !";
	} else {
		result = "Los numeros ingresados no son multiplos ! "
	}
	
	return result;
	
	}


	//MAIN 
	function ejercicio2(){
	alert("Programa que determina si 2 numeros son multiplos");
	result = multiplos();
	alert(result);
}