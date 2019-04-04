using System;

namespace Ejercicio2.net
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Hola , ingrese un numero entero");
	    int number = Int32.Parse(Console.ReadLine());

	    if(number!=10)
		    Console.WriteLine("El numero ingresado es distinto de 10");
        }
    }
}
