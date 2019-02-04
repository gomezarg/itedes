function divisores(){
	declare -i cantidad=0
	for ((i=1; i<=$1; i++)){
		if (( $1%i==0 ))
		then
			cantidad+=1
		fi
	}
	echo $cantidad
}

declare -i number=0
declare -i cantidad=0

read -p "Ingrese un numero: " number
cantidad=$(divisores $number)

echo "Cantidad de divisores de $number es: $cantidad "

exit 0