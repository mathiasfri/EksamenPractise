package Øvelse6;

public class Tal
{
    private int[] numbers = {5, 66, 12, 87, 66, 56, 89, 66};

    public int countNumbers(int numberInput)
    {
        int occurrences = 0;

        for (int i : numbers)
        {
            if (numberInput == i)
            {
                occurrences++;
            }
        }
        return occurrences;
    }

    public int average()
    {
        int sum = 0;
        int average = 0;

        for (int i : numbers)
        {
            sum += i;

            average = sum / numbers.length;
        }
        return average;
    }
}
