#!/bin/bash

declare -i num1=0
read -p "Ingrese numero para restar : " num1

declare -i num2=0
read -p "Ingrese otro numero : " num2

declare -i resta=$((num1 - num2))

echo "El resultado de la resta es: $resta"

exit 0
