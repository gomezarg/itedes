function multiplos(){
	if (( $1%$2==0 ))
	then
		respuesta="$1 es multiplo de  $2"
	elif(( $2%$1==0 ))
	then
		respuesta="$2 es multiplo de  $1"
	else
		respuesta="No son multiplos"
	fi
	echo $respuesta
}

declare -i num1=0
declare -i num2=0

read -p "Ingrese un numero: " num1
read -p "Ingrese un numero: " num2

respuesta=$(multiplos $num1 $num2)

echo ${respuesta}

exit 0