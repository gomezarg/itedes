using System;

namespace Ejercicio1.net
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Ingrese un numero y se mostrara su tabla de mutiplicar");
	    int num = Int32.Parse(Console.ReadLine());

	    for(int i = 1; i < 11; i++)
	    	Console.WriteLine(num + "X" + i + " = " + num * i);

        }
    }
}
