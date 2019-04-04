function ejercicio5(){
	const base = parseInt(prompt('Ingrese un numero para la base y altura de la piramide: '));
		for (i=1; i<=base; i++){
			for (j=0; j<i; j++){
				  document.write("X");
			}
			document.write("<br />");
	}
}