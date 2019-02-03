#!/bin/bash

declare -i num=0
read -p "Ingrese un numero se mostrara su tabla de multiplicar: " num

for((i=1; i < 11; i++)) {
	declare -i result=(num*i)
	echo "$num x $i = $result"
}

exit 0

