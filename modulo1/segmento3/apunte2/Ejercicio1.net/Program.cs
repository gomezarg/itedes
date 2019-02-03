using System;

namespace Ejercicio1.net
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Hola! Ingrese un numero entero para saber si es multiplo de 2 : ");
	    int num = Int32.Parse(Console.ReadLine());
	    int resto = num % 2;

	    if(resto == 0)
	    {
		    Console.WriteLine("El numero ingresado es multiplo de 2 ");
	    }
	    else
	    {
		    Console.WriteLine("El numero ingresado No es multiplo de 2");
	    }
        }
    }
}
