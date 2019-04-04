num = int(input("Ingrese un numero se mostrara su tabla de multiplicar: "))

for i in range (11):
    mult = num * i
    print("| " + str(num) + "X" + str(i) + "=" + str(mult))
