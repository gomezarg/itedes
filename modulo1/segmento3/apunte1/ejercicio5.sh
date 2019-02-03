#!/bin/bash

declare -i age=0
read -p "Hola! Ingrese su edad: " age

read -p "Ingrese su genero (Masculino/Femenino) : " sex

if(("$sex" == "masculino" && age >=18))
then
	echo "Usted es un masculino mayor de edad!"
else 
	echo "Usted NO es masculino o no es mayor de edad!"
fi

exit 0

