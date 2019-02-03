#!/bin/bash
declare genero=""
read -p "Ingrese su genero : ( masculino/femenino): " genero 

if [[ "$genero" == "femenino" ]]
then
	echo "Usted es femenino!"
fi
exit 0
