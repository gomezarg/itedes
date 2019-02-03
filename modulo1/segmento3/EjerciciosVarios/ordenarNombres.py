nombre = input("Ingrese un nombre: ")
Lista = []
while nombre != "no":
    Lista.append(nombre)
    nombre = input("Ingrese otro nombre: ")

vector = Lista

for i in range(len(vector) - 1):
	for k in range(i + 1, len(vector)):
		if vector[i] > vector[k]:
				auxiliar = vector[k]
				vector[k] = vector[i]
				vector[i] = auxiliar
print('Lista de personas ordenados alfabeticamente  : ' + str(vector))

print(Lista)

for i in range(len(vector) - 1):
	for k in range(i + 1, len(vector)):
		if vector[i] < vector[k]:
				auxiliar = vector[k]
				vector[k] = vector[i]
				vector[i] = auxiliar
print('Lista de personas ordenados a la inversa : ' + str(vector))

print(Lista)