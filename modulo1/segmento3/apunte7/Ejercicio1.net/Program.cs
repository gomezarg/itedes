using System;

namespace Ejercicio1.net
{
    class Program
    {
        static int divisores(int number)
        {
            int cant = 0;
			for(int i = 1; i<=number; i++ ){
				if (number%i == 0){
				cant += 1;
				}
			}
			return cant;
        }
		static void Main(String [] args)
		{
			Console.Write("Ingrese un numero: ");
			int number = Int32.Parse(Console.ReadLine());

			int cant;

			cant = divisores(number);

			Console.WriteLine("La cantidad de divisores es " + divisores(number).ToString());
		}
    }
}
