function ejercicio4(){
    const letter = prompt('Ingrese una letra que corresponda a un numero romano :');

    if(letter == 'I'){
        alert('Es un : 1 ');
    } else if (letter == 'V'){
        alert('Es un : 5')
    } else if (letter == 'X'){
        alert('Es un : 10')
    } else if (letter == 'L'){
        alert('Es un : 50')
    } else if (letter == 'C'){
        alert('Es un : 100')
    } else if (letter == 'D'){
        alert('Es un : 500')
    } else if (letter == 'M'){
        alert('Es un : 1000')
    } else {
        alert('Error! No ingreso ningun numero romano')
    }
}