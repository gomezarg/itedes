def divisores(number):
	quantity = 0
	for i in range(1,number+1):
		if number%i==0 :
			quantity += 1
	return quantity

number=int(input('Ingrese un numero : '))
quantity = divisores(number)

print("La cantidad de divisores de " , number , " es : " , quantity)