using System;
namespace Application
{
    public class Rectangle_csharp
    {
        public static void Main(String[] args)
        {
            int costat_curt;
            char caracter;
            //Inicialitzar variables
            Console.WriteLine("Donam el costat curt");
            costat_curt = int.Parse(Console.ReadLine());
            Console.WriteLine("Donam el caracter");
            caracter = char.Parse(Console.ReadLine());

            for(int i=0; i< costat_curt; i++) { 
                for(int j = 0; j< costat_curt*2; j++) {
                    if (i == 0 || i == costat_curt - 1 || j == 0 || j == (costat_curt * 2) - 1)
                        Console.Write(caracter);
                    else
                        Console.Write(" ");
                }
                Console.WriteLine();
            }
        }
    }
}
