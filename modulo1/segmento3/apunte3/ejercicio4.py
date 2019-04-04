letter = input("Ingrese numero romano: ")

if letter == "I" or letter == "i":
    print("1")
elif letter == "V" or letter == "v":
    print("5")
elif letter == "X" or letter == "x":
    print("10")
elif letter == "L" or letter == "l":
    print("50")
elif letter == "C" or letter == "c":
    print("100")
elif letter == "D" or letter == "d":
    print("500")
elif letter == "M" or letter == "m":
    print("1000")
else:
    print("Error! Numero romano incorrecto!")
