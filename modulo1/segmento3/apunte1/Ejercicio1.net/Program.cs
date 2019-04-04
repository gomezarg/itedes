using System;

namespace Ejercicio1.net
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Hola! Ingrese un numero entero");
	    int number = Int32.Parse(Console.ReadLine());

	    if(number==10)
		    Console.WriteLine("El numero ingresado es 10");
        }
    }
}
