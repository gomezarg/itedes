function max(){
	declare -i number1=0
	declare -i number2=0
	declare -i number3=0

	read -p "Ingrese un numero: " number1
	read -p "Ingrese un numero: " number2
	read -p "Ingrese un numero: " number3

	if (( $number1 >= $number2 ))
	then
		max=$1
	else
		max=$2
	fi
	
	if (( $number3 > $max ))
	then
		max=$number3
	else
		max=$max
	fi
	echo $max
}

result=$(max $number1 $number2 $number3)

echo ${result}

exit 0