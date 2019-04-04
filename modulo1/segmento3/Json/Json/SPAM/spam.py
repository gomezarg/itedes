def cargarCuenta(cuentaOrigen):
	import os.path
	import json

	if os.path.isfile('cuentaOrigen.json'):
		with open('cuentaOrigen.json', 'r') as fileIn:
			cuentaOrigen = json.load(fileIn)
	else:
		print('No se encontraron datos de cuenta de origen ! Por favor ingrese los datos ! ')
		print()
		cuentaOrigen['gmail_sender'] = input('Ingrese direccion de email: ')
		cuentaOrigen['gmail_passwd'] = input('Ingrese password: ')
		cuentaOrigen['server'] = 587

		print('___________________________________')

		guardarCuenta(cuentaOrigen)

	return cuentaOrigen

def verOrigen(cuentaOrigen):
	print(cuentaOrigen)

def menuOrigen(cuentaOrigen):
	opcion = -1

	while opcion != 0:
		print('MENU CUENTA ORIGEN :')
		print()
		print('1 - Editar cuenta de origen ')
		print('2 - Visualizar cuenta de origen ')
		print('0 - Volver al menu anterior ')
		print()
		opcion = int(input('Ingrese una opcion: '))

		if opcion == 1:
			cuentaOrigen = editarOrigen(cuentaOrigen)
		elif opcion == 2:
			cuentaOrigen = verOrigen(cuentaOrigen)
		
		print('___________________________________')

	return cuentaOrigen


def guardarCuenta(cuentaOrigen):
	import json

	with open('cuentaOrigen.json' , 'w') as fileOut:
		json.dump(cuentaOrigen, fileOut)


def editarOrigen(cuentaOrigen):
	cuentaOrigen['gmail_sender'] = input('Ingrese direccion de email: ')
	cuentaOrigen['gmail_passwd'] = input('Ingrese password: ')
	cuentaOrigen['server'] = 587

	guardarCuenta(cuentaOrigen)

	return cuentaOrigen



def cargarDatos(correos):
    import os.path
    import json

    if os.path.isfile('correos.json'):
        with open('correos.json', 'r') as fileIn:
            correos = json.load(fileIn)
    
    return correos

def guardarDatos(correos):
    import json

    with open('correos.json', 'w') as fileOut:
        json.dump(correos, fileOut)


def menuCorreos(correos):
	opcion = -1

	while opcion != 0:
		print('MENU DESTINATARIOS :')
		print()
		print('1 - Agregar una direccion de correo')
		print('2 - Visualizar lista de correos')
		print('0 - Volver al menu principal')
		print()
		opcion = int(input('Ingrese una opcion: '))

		if opcion == 1:
			correos = agregarCorreo(correos)
		elif opcion == 2:
			correos = mostrarCorreos(correos)
		
		print('___________________________________')

	return correos


def mostrarCorreos(correos):
	print()
	print('Lista de destinatarios : ')
	print()
	for correo in correos:
		print(correo)


def agregarCorreo(correos):
	
	otro = "si"

	while otro == "si":
		correo = input('Ingrese el correo: ')

		correos.append(correo)

		otro = input("Agregar otro correo? (si/no) : ")

	guardarDatos(correos)

	return correos


#main
correos = []
cuentaOrigen = {}

cuentaOrigen = cargarCuenta(cuentaOrigen)
correos = cargarDatos(correos)

opcion = -1

while opcion != 0:
	print('MENU PRINCIPAL :')
	print()
	print("1 - Administrar lista de destinatarios: ")
	print("2 - Gestionar cuenta de origen")
	print("0 - Salir del programa")
	print()

	opcion = int(input('Seleccione una opcion: '))

	print('___________________________________')

	if opcion == 1:
		correos = menuCorreos(correos)
	elif opcion == 2:
		cuentaOrigen = menuOrigen(cuentaOrigen)
