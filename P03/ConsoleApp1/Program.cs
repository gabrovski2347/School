using System;

namespace ConsoleApp1
{
    class Program
    {
        static void Main(string[] args)
        {
            int rows = int.Parse(Console.ReadLine());
            int cols = int.Parse(Console.ReadLine());
            var mins = new int[cols]; 
            var matrix = new int[rows, cols];
            for (int i = 0; i < rows; i++)
            {
                for (int j = 0; j < cols; j++)
                {
                    int num = int.Parse(Console.ReadLine());
                    matrix[i, j] = num;
                }
            }

            for (int i = 0; i < cols; i++)
            {
                int min = int.MaxValue;
                for (int j = 0; j < rows; j++)
                {
                    if (matrix[i, j] < min)
                    {
                        min = matrix[i, j];
                    }
                    Console.Write(matrix[i, j] + " ");
                }
                Console.WriteLine();
                mins[i] = min;
            }

            for (int i = 0; i < mins.Length; i++)
            {
                Console.Write(mins[i] + " ") ;
            }
        }
    }
}
