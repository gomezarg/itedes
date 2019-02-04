using System;

namespace Ejercicio4.net
{
    class Program
    {
        static void Main(string[] args)
        {
			int num , max = 0;
			do
			{
				Console.Write("Ingrese un numero entero positivo (0 Finalizar): ");
				num = int.Parse(Console.ReadLine());
				if (num >= max){
					max = num; 
				}
			}
			while(num != 0);
			Console.WriteLine("El mayor de todos los numeros ingresados es : {0}" , max);
        }
    }
}
