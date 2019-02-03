#!/bin/bash

declare -i num=0
read -p "Ingrese un numero para saber si es multiplo de 2 : " num

declare -i resto=num%2
if((resto == 0))
then
	echo "El numero ingresado es multiplo de 2 !"
else
	echo "El numero ingresado NO es multiplo de 2"
fi

exit 0
