using System;

namespace Ejercicio3.net
{
    class Program
    {
        static void Main(string[] args)
        {
            double num1, num2 ,result;
			do
			{
				Console.Write("Ingrese base del rectangulo: ");
				num1 = double.Parse(Console.ReadLine());

				Console.Write("Ingrese altura del rectangulo: ");
				num2 = double.Parse(Console.ReadLine());

				if(num1 > 0 && num2 > 0) {
				result = num1 * num2;

				Console.WriteLine("El area del rectangulo es : " + result);
				} else {
					Console.WriteLine("Error ! Area y altura deben ser mayores a cero ! Vuelve a ingresar  ");
				}

				Console.WriteLine("=====================================");

			} while(num1 <= 0 || num2 <= 0);
        }
    }
}