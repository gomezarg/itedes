function ejercicio1(){
	const num1 = parseInt(prompt('Ingrese un numero: '));
	const num2 = parseInt(prompt('Ingrese segundo numero: '));
	const num3 = parseInt(prompt('Ingrese tercer numero: '));

	if(num1 < num2 && num2 < num3) {
		alert(`${num1} ${num2} ${num3}`);
	} else if(num1 < num3 && num3 < num2){
		alert(`${num1} ${num3} ${num2}`);
	} else if(num2 < num1 && num1 < num3){
		alert(`${num2} ${num1} ${num3}`);
	} else if(num3 < num2 && num2 < num1){
		alert(`${num3} ${num2} ${num1}`);
	} else if(num3 < num1 && num1 < num2){
		alert(`${num3} ${num1} ${num2}`);
	} else if(num2 < num3 && num3 < num1){
		alert(`${num2} ${num3} ${num1}`);
	}

}

