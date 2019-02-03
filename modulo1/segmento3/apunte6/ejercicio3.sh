#!/bin/bash

declare -i number1=0
declare  -i number2=0
while :
do

read -p "Ingrese base : " number1


read -p "Ingrese altura : " number2

declare -i result=$((number1 * number2))

echo "El area del rectangulo es : $result"


[[ "$result" -le 0 ]] || break
done

exit 0