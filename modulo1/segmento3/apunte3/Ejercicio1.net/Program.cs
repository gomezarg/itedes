using System;

namespace Ejercicio1.net
{
    class Program
    {
        static void Main(string[] args)
        {
           Console.WriteLine("Hola! Ingrese primer numero: ");
	   int num1 = Int32.Parse(Console.ReadLine());

	   Console.WriteLine("Ingrese segundo numero: ");
	   int num2 = Int32.Parse(Console.ReadLine());

	   Console.WriteLine("Ingrese tercer numero: ");
	   int num3 = Int32.Parse(Console.ReadLine());

	   if(num1 < num2 && num2 < num3){
		   Console.WriteLine("{0} {1} {2}",num1,num2,num3);
		 }else if (num2 < num1 && num1 < num3){
			 Console.WriteLine("{0} {1} {2}",num2,num1,num3);
		 }else if(num3 < num2 && num2 < num1){
			 Console.WriteLine("{0} {1} {2}",num3,num2,num1);
		 }else if(num3 < num1 && num1 < num2){
			 Console.WriteLine("{0} {1} {2}",num3,num1,num2);
		 }else if(num1 < num3 && num3 < num2){
			 Console.WriteLine("{0} {1} {2}",num1,num3,num2);
		 }else if(num2 < num3 && num3 <num1){
			 Console.WriteLine("{0} {1} {2}",num2,num3,num1);
		 } 
        }
    }
}
