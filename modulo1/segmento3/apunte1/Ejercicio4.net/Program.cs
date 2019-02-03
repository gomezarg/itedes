using System;

namespace Ejercicio4.net
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Hola!Ingrese primer numero: ");
	    int num1 = Int32.Parse(Console.ReadLine());

	    Console.WriteLine("Ingrese segundo numero: ");
	    int num2 = Int32.Parse(Console.ReadLine());

	    Console.WriteLine("Ingrese tercer numero: ");
	    int num3 = Int32.Parse(Console.ReadLine());

	    Console.WriteLine("Ingrese cuarto numero: ");
	    int num4 = Int32.Parse(Console.ReadLine());

	    if(num1 == num2 || num3 == num4)
	    {
		    Console.WriteLine("Los numeros son iguales ");
	    }
	    else 
		   {
			   Console.WriteLine("Los numeros son distintos");
		   }

	    
        }
    }
}
