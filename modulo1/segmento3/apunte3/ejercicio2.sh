#!/bin/bash

declare -i num=0
read -p "Ingrese un numero del 1 al 7 para devolver dia de semana: " num

if((num == 1))
then
	echo " Lunes "
elif((num == 2))
then
	echo "Martes"
elif((num == 3))
then
	echo "Miercoles"
elif((num == 4))
then
	echo "Jueves"
elif((num == 5))
then
	echo "Viernes"
elif((num == 6))
then
	echo "Sabado"
elif((num == 7))
then
	echo "Domingo"
else
	echo "Opcion invalida"
	exit 1
fi

exit 0
