def multiplos():
	print()
	if number1%number2 == 0 and number2%number1 == 0:
		multiplos = print('Ambos numeros son multiplos!')
	elif number2%number1 == 0:
		multiplos = print('El segundo numero (', number2 , ') es multiplo del primer numero (', number1 , ')!')
	elif number1%number2 == 0:
		multiplos = print('El primer numero (', number1 , ') es multiplo del segundo numero (', number2 , ')!')
		
	else:
		multiplos = print('No son multiplos !')
	return multiplos
#MAIN
print('Programa para verificar si 2 numeros son multiplos entre si ')
print('____________________________________________________')
number1=int(input('Ingrese primer numero : '))
number2=int(input('Ingrese segundo numero : '))

multiplos()
