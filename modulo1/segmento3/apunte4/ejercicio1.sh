#!/bin/bash

declare -i num=0
read -p "Ingrese un numero del 1 al 7 ! Se devolvera un dia de semana: " num

case $num in
	1)
		echo "Lunes"
		;;
	2)
		echo "Martes"
		;;
	3)
		echo "Miercoles"
		;;
	4)
		echo "Jueves"
		;;
	5)
		echo "Viernes"
		;;
	6)
		echo "Sabado"
		;;
	7)
		echo "Domingo"
		;;
	*)
		echo "Error"
		;;
esac

exit 0

