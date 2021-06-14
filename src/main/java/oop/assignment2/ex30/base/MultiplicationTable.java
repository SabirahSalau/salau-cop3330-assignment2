package oop.assignment2.ex30.base;

public class MultiplicationTable
{
    public void generateTable(int tableSize)
    {
        for(int i = 1; i <= tableSize; i++)
        {
            for(int j = 1; j <= tableSize; j++)
            {
                System.out.printf("%4d", i * j);
            }

            System.out.println();
        }

    }
}
