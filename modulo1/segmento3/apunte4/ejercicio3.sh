#!/bin/bash

declare letter=""
read -p "Ingrese numero romano: " letter

case $letter in
	I)
		echo "1"
		;;
	V)
		echo "5"
		;;
	X)
		echo "10"
		;;
	L)
		echo "50"
		;;
	C)
		echo "100"
		;;
	D)
		echo "500"
		;;
	M)
		echo "1000"
		;;
	*)
		echo "Error"
		;;
esac

exit 0
