#!/bin/bash

declare dni=""
read -p "Ingrese sus datos personales. DNI : " dni

declare nombre=""
read -p "Por favor ingrese nombre y apellido : " nombre

declare direccion=""
read -p "Ahora ingrese direccion: " direccion

declare telefono=""
read -p "Por ultimo ingrese su telefono: " telefono
echo "DNI: $dni . Nombre: $nombre . Direccion: $direccion . Telefono: $telefono . "

exit 0
