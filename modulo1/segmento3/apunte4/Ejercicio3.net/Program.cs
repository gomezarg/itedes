using System;

namespace Ejercicio3.net
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Ingrese un numero romano: ");
	    	string letter = Console.ReadLine();

		switch(letter)
		{
			case "I":
				Console.WriteLine("1");
				break;
			case "V":
				Console.WriteLine("5");
				break;
			case "X":
				Console.WriteLine("10");
				break;
			case "L":
				Console.WriteLine("50");
				break;
			case "C":
				Console.WriteLine("100");
				break;
			case "D":
				Console.WriteLine("500");
				break;
			case "M":
				Console.WriteLine("1000");
				break;
			default:
				Console.WriteLine("Error");
				break;
		}

        }
    }
}
