using System;

namespace Ejercicio3.net
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Escriba su genero (Masculino/Femenino) : ");
			string sex = Console.ReadLine();

			if(sex=="femenino")
				Console.WriteLine("Usted es de genero femenino");
        }
    }
}
