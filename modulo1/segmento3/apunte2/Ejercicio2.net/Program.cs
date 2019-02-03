using System;

namespace Ejercicio2.net
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Hola! Ingrese su nombre: ");
	    string name = Console.ReadLine();

	    Console.WriteLine("Ingrese contraseña: ");
	    int password = Int32.Parse(Console.ReadLine());

	    if(name == "juan" && password == 1234 || name == "pedro" && password == 5678) {
		    Console.WriteLine("Hola " + name + "!" );
	    }else{
		    Console.WriteLine("usuario invalido!");
	    }
		
        }
    }
}
