#!/bin/bash

declare -i num1=0
read -p "Escriba primer numero para ordenar de menor a mayor: " num1

declare -i num2=0
read -p "Escriba segundo numero: " num2

declare -i num3=0
read -p "Escriba tercer numero: " num3

if((num1 < num2 && num2 < num3))
then
	echo "$num1 $num2 $num3"
elif((num2 < num1 && num1 < num3))
then
	echo " $num2 $num1 $num3"
elif((num3 < num2 && num2 < num1))
then
	echo "$num3 $num2 $num1"
elif((num3 < num1 && num1 < num2))
then
	echo "$num3 $num1 $num2"
elif((num1 < num3 && num3 < num2))
then
	echo "$num1 $num3 $num2"

	exit 1
fi

exit 0

