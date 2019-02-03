using System;

namespace Ejercicio4.net
{
    class Program
    {
        static void Main(string[] args)
        {
			double num , sum = 0.0;
			do
			{
				Console.Write("Ingrese un numero (0 Finalizar): ");
				num = double.Parse(Console.ReadLine());
				sum += num;
			}
			while(num != 0);
			Console.WriteLine("La suma de todos los numeros ingresados es : {0}" , sum);
        }
    }
}
