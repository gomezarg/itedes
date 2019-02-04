function divisores(number){

	var cantDivisores = 0;

	for (i=1; i <= number; i++){
		if(number%i == 0){
			cantDivisores += 1;
		}
	}
	return cantDivisores;
	}


	//MAIN 
	function ejercicio1(){
	
	var number = parseInt(prompt('Ingrese un numero : '));
	
	cantDivisores = divisores(number);

	alert('El numero ' + number + ' tiene : '+ cantDivisores + ' divisores');
}