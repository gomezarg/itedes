using System;

namespace Ejercicio2.net
{
    class Program
    {
        static string multiplos()
        {
			Console.Write("Ingrese un numero: ");
			int number1 = Int32.Parse(Console.ReadLine());

			Console.Write("Ingrese un numero: ");
			int number2 = Int32.Parse(Console.ReadLine());

			string result = "";
			if(number1%number2 == 0 && number2%number1 == 0){
				result = "Ambos numeros son multiplos";
			} else if(number2%number1 == 0){
				result = "El segundo numero (" + number2 + ") es multiplo del primer numero (" + number1 + ").";
			} else if (number1%number2 == 0){
				result = "El primer numero (" + number1 + ") es multiplo del segundo numero (" + number2 + ").";
			} else {
				result= "No son multiplos";
			}
			return result;
        }
		static void Main(String [] args)
		{
			//MAIN
			result = multiplos();
			Console.WriteLine(result);
		}
    }
}