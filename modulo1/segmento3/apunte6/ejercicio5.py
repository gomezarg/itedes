number = 1
max = 0
while number != 0:
	number = int(input("Ingrese un numero (0 Finalizar ): "))
	if number >= max:
		max = number
	
print('El mayor de todos los numeros ingresados es : ' , max)