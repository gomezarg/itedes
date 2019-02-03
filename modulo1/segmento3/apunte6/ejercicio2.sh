#!/bin/bash

declare continue="n"
while :
do
declare -i number1=0
read -p "Ingrese primer numero a sumar : " number1

declare -i number2=0
read -p "Ingrese segundo numero a sumar : " number2

declare -i suma=$((number1 + number2))

echo "El resultado de la suma es : $suma"

read -p "Desea realizar otra suma? (s/n) " continue
[[ "$continue" == "s" ]] || break
done

exit 0