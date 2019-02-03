#!/bin/bash

declare -i number=0
read -p "Ingrese un numero entero: " number

if ((number!=10))
then
	echo "El numero ingresado es distinto de 10"
fi

exit 0
