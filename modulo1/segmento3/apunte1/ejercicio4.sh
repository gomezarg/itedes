#!/bin/bash

read -p "Ingrese primer numero : " n1
read -p "Ingrese segundo numero : " n2
read -p "Ingrese tercer numero : " n3
read -p "Ingrese cuarto numero : " n4

if [[ "$n1" == "$n2" || "$n3" == "$n4" ]]
then
	echo "Los numeros son iguales"
else
	echo "Los numero NO son iguales"
fi

exit 0
