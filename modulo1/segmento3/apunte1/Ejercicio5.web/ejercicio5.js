function ejercicio5(){
	var sex = prompt('Ingrese su genero (masculino/femenino): ');
	var age = parseInt(prompt('Ingrese su edad: '));
	
	if(sex == "masculino" && age <= 18)
		alert(`Usted es masculino y mayor de edad! `);
}