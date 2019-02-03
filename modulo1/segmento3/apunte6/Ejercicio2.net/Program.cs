using System;

namespace Ejercicio2.net
{
    class Program
    {
        static void Main(string[] args)
        {
            string otro = "n";

			do
			{
				int num1 , num2 , result;
				Console.Write("Ingrese 1er numero a sumar : ");
				num1 = int.Parse(Console.ReadLine());

				Console.Write("Ingrese otro numero: ");
				num2 = int.Parse(Console.ReadLine());

				result = num1 + num2;

				Console.WriteLine("El resultado de la suma es : " + result);

				Console.WriteLine("=====================================");

				Console.Write("Desea hacer otra suma ? (s/n) : ");
				otro = Console.ReadLine();

			} while(otro == "s");
        }
    }
}