using System;
namespace Ejercicio5.net
{
    class Program
    {
        static void Main(string[] args)
        {
		String cad="";
      	int altura,w,y;
        Console.WriteLine("Ingresa altura del triangulo : ");
        altura = Convert.ToInt32(Console.ReadLine());
     		for(y=1;y<altura+1;y++){
         		for(w=1;w<y+1;w++){
             		cad=cad+"X";
					
         	}
         	cad=cad+"\n";
     	}
     	Console.WriteLine(cad);                                
        Console.ReadLine();
        }
    }
}
