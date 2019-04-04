using System;

namespace Ejercicio5.net
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Hola!Ingrese su genero (Masculino/Femenino): ");
	    		string sex = Console.ReadLine();
	    Console.WriteLine("Ingrese su edad: ");
	    		int age = Int32.Parse(Console.ReadLine());

			if(age>=18 && sex=="masculino"){
				Console.WriteLine("Usted es masculino mayor de edad");
	}
			
			else {
				Console.WriteLine("Usted no es masculino o no es mayor de edad!");
	
			}
        }
    }
}
