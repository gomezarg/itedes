function ejercicio1() {
    const number = parseInt(prompt('Ingrese un numero del 1 al 7 se devolvera un dia de semana:'));
    switch(number) {
    case 1:
    alert('Lunes');
    break;
    case 2:
    alert('Martes');
    break;
    case 3:
    alert('Miercoles');
    break;
    case 4:
    alert('Jueves');
    break;
    case 5:
    alert('Viernes');
    break;
    case 6:
    alert('Sabado');
    break;
    case 7:
    alert('Domingo');
    break;
    default:
    alert('ERROR: no es un dia de semana');
    break;
    }
    }
    
    