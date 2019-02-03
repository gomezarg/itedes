function ejercicio3() {
	

		alert("Area de un rectangulo");
        base = parseInt(prompt('Ingrese base del rectangulo: '));
		altura = parseInt(prompt('Ingrese altura del triangulo: '));
		if (base > 0 && altura > 0) {
        let area = base * altura;
		alert ('El area del rectangulo es :' + area);
		
		}
		else {
			alert ('Error! Los numeros ingresados deben ser mayores a  0 ')
			let otro = false;

		while(otro == false) {
		alert("Area de un rectangulo");
        base = parseInt(prompt('Ingrese base del rectangulo: '));
		altura = parseInt(prompt('Ingrese altura del triangulo: '));
		
		}
	}
}