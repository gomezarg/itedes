using System;

namespace Ejercicio1.net
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Ingrese un numero del 1 al 7 y se devolvera un dia de semana: ");
	    int num = Int32.Parse(Console.ReadLine());

	    switch(num)
	    {
		    case 1:
			    Console.WriteLine("Lunes");
			    break;

		    case 2:
			    Console.WriteLine("Martes");
			    break;
		    case 3:
			    Console.WriteLine("Miercoles");
			    break;
		    case 4:
			    Console.WriteLine("Jueves");
			    break;
		    case 5:
			    Console.WriteLine("Viernes");
			    break;
		    case 6:
			    Console.WriteLine("Sabado");
			    break;
		    case 7:
			    Console.WriteLine("Domingo");
			    break;
		    default:
			    Console.WriteLine("ERROR: Number invalido");
			    break;
	    }

        }
    }
}
