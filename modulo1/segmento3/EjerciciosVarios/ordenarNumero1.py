vector = [0,3,5,5,2,1,99,88,12,16]

for i in range(len(vector) - 1):
	for k in range(i + 1, len(vector)):
		if vector[i] > vector[k]:
			auxiliar = vector[k]
			vector[k] = vector[i]
			vector[i] = auxiliar


print(vector)
