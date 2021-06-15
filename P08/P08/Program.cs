using System;
using System.Linq;

namespace P08
{
    class Program
    {
        static void Main(string[] args)
        {
            int n = int.Parse(Console.ReadLine());
            for (int i = 0; i < n; i++)
            {
                var info = Console.ReadLine()
                        .Split(" ", StringSplitOptions.RemoveEmptyEntries)
                        .Select(int.Parse)
                        .ToArray();
                int cols = info[0];
                int rows = info[1];
                int[,] matrix = new int[rows, cols];
                int min = int.MaxValue;
                int max = int.MinValue;
                double avg = 0;
                for (int j = 0; j < rows; j++)
                {
                    var input = Console.ReadLine()
                        .Split(" ", StringSplitOptions.RemoveEmptyEntries)
                        .Select(int.Parse)
                        .ToArray();
                    for (int a = 0; a < input.Length; a++)
                    {
                        matrix[j, a] = input[a];
                        if (max < input[a])
                        {
                            max = input[a];
                        }
                        if (min > input[a])
                        {
                            min = input[a];
                        }
                        avg += input[a];
                    }
                }
                avg /= rows + cols;
                Console.WriteLine($"{min} {max} {avg}");
            }
        }
    }
}
