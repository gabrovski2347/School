using System;

namespace P02
{
    class Program
    {
        static void Main(string[] args)
        {
            int rows = int.Parse(Console.ReadLine());
            int cols = int.Parse(Console.ReadLine());

            var matrix = new int[rows, cols];
            for (int i = 0; i < rows; i++)
            {
                for (int j = 0; j < cols; j++)
                {
                    int num = int.Parse(Console.ReadLine());
                    matrix[i, j] = num;
                }
            }

            for (int i = 0; i < rows; i++)
            {
                double avr = 0;
                for (int j = 0; j < cols; j++)
                {
                    avr += matrix[i, j];
                    Console.Write(matrix[i, j] + " ");
                }
                avr /= cols;
                Console.Write(avr);
                Console.WriteLine();
            }
        }
    }
}
