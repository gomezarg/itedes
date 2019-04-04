function ejercicio3() {
    const letter = prompt('Ingrese un numero romano:');
    switch(letter) {
    case 'I':
    alert('Es : 1 ');
    break;
    case 'V':
    alert('Es : 5');
    break;
    case 'X':
    alert('Es : 10');
    break;
    case 'L':
    alert('Es : 50 ');
    break;
    case 'C':
    alert('Es : 100');
    break;
    case 'D':
    alert('Es : 500');
    break;
    case 'M':
    alert('Es : 1000')
    default:
    alert('ERROR: No es un numero romano!!!! ');
    break;
    }
    }