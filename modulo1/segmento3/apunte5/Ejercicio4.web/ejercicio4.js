function ejercicio4(){
	const base = parseInt(prompt('Ingrese base: '));
	const altura = parseInt(prompt('Ingrese altura: '));
		for (i=1; i<=base; i++){
			for (j=0; j<altura; j++){
				  document.write("X ");
			}
			document.write("<br>");
	}
}