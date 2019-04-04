name = input("Ingrese su nombre: ")
password = int(input("Ingrese contraseña: "))

if name == "juan" and password == 1234 or name == "pedro" and password == 5678:
    print("Hola " + name)
else:
    print("Usuario invalido!")
