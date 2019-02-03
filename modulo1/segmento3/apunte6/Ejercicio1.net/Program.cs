using System;

namespace Ejercicio1.net
{
    class Program
    {
        static void Main(string[] args)
        {
			int number = 0;
			
			while(number <= 100)
			{
            Console.WriteLine("Ingrese un numero : ");
			number = Int32.Parse(Console.ReadLine());
			}
        }
    }
}
