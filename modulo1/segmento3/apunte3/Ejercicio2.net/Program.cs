using System;

namespace Ejercicio2.net
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Ingrese un numero del 1 al 7 y se devolvera un dia de semana: ");
	    int num = Int32.Parse(Console.ReadLine());

	    if(num == 1){
		    Console.WriteLine("Lunes");
	    }else if(num == 2){
		    Console.WriteLine("Martes");
	    }else if(num == 3){
		    Console.WriteLine("Miercoles");
	    }else if(num == 4){
		    Console.WriteLine("Jueves");
	    }else if(num == 5){
		    Console.WriteLine("Viernes");
	    }else if(num == 6){
		    Console.WriteLine("Sabado");
	    }else if(num == 7){
		    Console.WriteLine("Domingo");
	    }else{
		    Console.WriteLine("Opcion INVALIDA");
	    }
        }
    }
}
