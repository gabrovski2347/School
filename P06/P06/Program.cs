using System;

namespace P06
{
    class Program
    {
        static void Main(string[] args)
        {
            int rows = 3;
            int cols = 3;

            var matrix = new char[rows, cols];
            for (int i = 0; i < rows; i++)
            {
                for (int j = 0; j < cols; j++)
                {
                    char symbol = char.Parse(Console.ReadLine());
                    matrix[i, j] = symbol;
                }
            }

            int winner = 0; // 0 - no winner, //1 -x , 2 - O
            for (int i = 0; i < rows; i++)
            {
                for (int j = 0; j < cols-1; j++)
                {
                    if (matrix[i, j] != matrix[i, j+1])
                    {
                        break;
                    }
                    else
                    {
                        if (matrix[i, j] == 'X')
                        {
                            winner = 1;
                        }
                        else
                            winner = 2;
                    }
                }               
            }

            for (int i = 0; i < rows - 1; i++)
            {
                for (int j = 0; j < cols; j++)
                {
                    if (matrix[i, j] != matrix[i + 1, j])
                    {
                        break;
                    }
                    else
                    {
                        if (matrix[i, j] == 'X')
                        {
                            winner = 1;
                        }
                        else
                            winner = 2;
                    }
                }
            }

            if (winner == 0)
            {
                Console.WriteLine("There is no winner");
            }
            else if (winner == 1)
            {
                Console.WriteLine("The winner is: X");
            }
            else
            {
                Console.WriteLine("The winner is: O");
            }
        }
    }
}
