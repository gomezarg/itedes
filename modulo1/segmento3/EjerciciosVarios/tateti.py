def imprimirTablero(tablero):
    import os

    os.system('clear')
    
    print(tablero[0] + ' ' + tablero[1] + ' ' + tablero[2])
    print(tablero[3] + ' ' + tablero[4] + ' ' + tablero[5])
    print(tablero[6] + ' ' + tablero[7] + ' ' + tablero[8])

def juega2(tablero):
    import random
    
    eleccionOk = False

    posicion = -1

    while not eleccionOk:
        posicion = random.randrange(9)
        
        if tablero[posicion] in ['0', '1', '2', '3', '4', '5', '6', '7', '8']:
            eleccionOk = True    

    return posicion

def verificarVictoria(jugadas):
    if set([0, 1, 2]).issubset(jugadas) \
        or set([3, 4, 5]).issubset(jugadas) \
        or set([6, 7, 8]).issubset(jugadas) \
        or set([0, 3, 6]).issubset(jugadas) \
        or set([1, 4, 7]).issubset(jugadas) \
        or set([2, 5, 8]).issubset(jugadas) \
        or set([0, 4, 8]).issubset(jugadas) \
        or set([2, 4, 6]).issubset(jugadas):
        return True
    else:
        return False


# MAIN
jugadas = 0
jugadas1 = []
jugadas2 = []
tablero = ['0', '1', '2', '3', '4', '5', '6', '7', '8']
ganador = 0

while jugadas < 9:
    imprimirTablero(tablero)

    print()

    posicion = -1
    
    while posicion < 0 or posicion > 8:
        posicion = int(input("Elija una posicion vacia: "))

    if tablero[posicion] in ['0', '1', '2', '3', '4', '5', '6', '7', '8']:
        tablero[posicion] = "X"
        
        jugadas1.append(posicion)

        jugadas = jugadas + 1

        if verificarVictoria(jugadas1):
            ganador = 1
            break

        if jugadas == 9:
            break

        posicion = juega2(tablero)

        tablero[posicion] = 'O'

        jugadas2.append(posicion)

        jugadas = jugadas + 1

        if verificarVictoria(jugadas2):
            ganador = 2
            break

imprimirTablero(tablero)

if ganador == 1:
    print("Ganaste!")
elif ganador == 2:
    print("Gane!")
else:
    print("Empate")

print()
print("Tu historial de jugadas:")
print(jugadas1)
print()
print("Mi historial de jugadas:")
print(jugadas2)