#!/bin/bash

declare -i num1=0
read -p "Ingrese numero a multiplicar : " num1

declare -i num2=0
read -p "Ingrese otro numero : " num2

declare -i result=$((num1 * num2))

echo " El resultado de la multiplicacion es: $result"

exit 0
