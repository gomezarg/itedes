using System;

namespace Ejercicio4.net
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Ingrese numero romano: ");
	    string letter = Console.ReadLine();

	    if(letter == "I" || letter == "i") {
		    Console.WriteLine("1");
	    } else if(letter == "V" || letter == "v") {
		    Console.WriteLine("5");
	    } else if(letter == "X" || letter == "x") {
		    Console.WriteLine("10");
	    } else if(letter == "L" || letter == "l") {
		    Console.WriteLine("50");
	    } else if(letter == "C" || letter == "c") {
		    Console.WriteLine("100");
	    } else if(letter == "D" || letter == "d") {
		    Console.WriteLine("500");
	    } else if(letter == "M" || letter == "m") {
		    Console.WriteLine("1000");
	    } else {
		    Console.WriteLine("Error! Lo ingresado no es un numero romano!"); 
	    }

        }
    }
}
