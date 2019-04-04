using System;

namespace Ejercicio4.net
{
    class Program
    {
        static void Main(string[] args)
        {
        Console.WriteLine("introduce el alto del rectangulo");
		int alto = int.Parse(Console.ReadLine());
		Console.WriteLine("introduce el ancho del rectangulo");
		int ancho = int.Parse(Console.ReadLine());
		int i, j;
		if ( alto > 0 && ancho > 0 ){
		for (i = 1; i <= alto; i++) //  alto 
		{
			for (j = 1; j <= ancho; j++) // ancho
				Console.Write("X", j);
			Console.WriteLine(" ");
		}
		} else {
			Console.WriteLine("Error! Tenes que ingresar valores mayores a  0 ");
		}
		Console.ReadKey();
        }
    }
}
