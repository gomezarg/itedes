sex = input("Ingrese su genero (Masculino/Femenino) : ")
age = int(input("Ingrese su edad: "))

if age>=18 and sex=="masculino":
    print("Usted es un masculino mayor de edad")
else:
    print("Usted no es masculino o no es mayor de edad")
