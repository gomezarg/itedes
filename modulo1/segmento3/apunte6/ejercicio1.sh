#!/bin/bash

declare -i num=0
while :
do
read -p "Ingrese un numero: " num
(( $num  < 100 )) || break
done

exit 0
