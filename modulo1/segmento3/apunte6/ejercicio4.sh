#!/bin/bash

declare -i num=1
declare -i sum=0

while :
do
read -p "Ingrese un numero ( 0 para finalizar) : " num
sum+=num

[[ $num != 0 ]] || break
done
echo "La suma de todos los numeros ingresados es $sum "
exit 0