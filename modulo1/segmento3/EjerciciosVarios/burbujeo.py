import random
def listaAleatorios(n):
		lista = [0] * n
		for i in range(n):
			lista[i] = random.random()
		return lista
n = 100

vector=listaAleatorios(n)

for i in range(len(vector) - 1):
	for k in range(i + 1, len(vector)):
		if vector[i] > vector[k]:
				auxiliar = vector[k]
				vector[k] = vector[i]
				vector[i] = auxiliar
print('De menor a mayor : ' + str(vector))

for i in range(len(vector) - 1):
		for k in range(i + 1,len(vector)):
				if vector[i] < vector[k]:
						auxiliar = vector[k]
						vector[k] = vector[i]
						vector[i] = auxiliar

print('De mayor a menor: ' + str(vector))