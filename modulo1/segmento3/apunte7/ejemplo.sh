#!/bin/bash

function pow() {
		declare -i powBase=$1
		declare -i powExponent=$2
		declare -i result=powBase
for ((i = 1; i < powExponent; i++)) {
					result=$((result * powBase))
		}
		echo $result
}
declare -i base=0
read -p “Base: “ base

declare -i exponent=0
read -p "Exponente: " exponent

declare -i powResult=$( pow $base $exponent )
echo "Potencia: $powResult"

exit 0