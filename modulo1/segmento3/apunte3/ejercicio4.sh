#!/bin/bash

declare letter=""
read -p "Ingrese numero romano: " letter

if [[ "$letter" == "I" || "$letter" == "i" ]]
then
	echo "1"
elif [[ "$letter" == "V" || "$letter" == "v" ]]
then
	echo "5"
elif [[ "$letter" == "X" || "$letter" == "x" ]]
then
	echo "10"
elif [[ "$letter" == "L" || "$letter" == "l" ]]
then
	echo "50"
elif [[ "$letter" == "C" || "$letter" == "c" ]]
then
	echo "100"
elif [[ "$letter" == "D" || "$letter" == "d" ]]
then
	echo "500"
elif [[ "$letter" == "M" || "$letter" == "m" ]]
then
	echo "1000"
else
	echo "ERROR ! No es un numero romano valido!"
fi

exit 0
