#!/bin/bash

read -p "Ingrese su nombre: " name

declare -i password=0
read -p "Ingrese la contraseña: " password

if [[ "$name" == "juan" && "$password" == "1234" || "$name" == "pedro" && "$password" == "5678" ]]
then
	echo "Hola $name ! "
else 
	echo "Usuario invalido!"
fi

exit 0
