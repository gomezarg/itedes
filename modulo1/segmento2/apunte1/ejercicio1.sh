#!/bin/bash

declare barrio=""
read -p "Hola,ingrese nombre de su barrio : " barrio

declare calle=""
read -p "Ingrese direccion de la comisaria mas cercana : " calle

declare entrecalle=""
read -p "Ingrese las entrecalles de la comisaria : " entrecalle

echo "La comisaria de  $barrio , se encuentra en la calle  $calle , entre $entrecalle . Saludos ."

exit 0

