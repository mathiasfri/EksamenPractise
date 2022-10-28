package Øvelse5;

import java.util.ArrayList;
import java.util.Random;

public class Tal
{
    Random r = new Random();
    private int[] numbers = new int[10];

    public int returnRandom()
    {
        int number = r.nextInt(1, 7);

        return number;
    }

    public void makeLotsOfNumbers()
    {
        numbers[0] = r.nextInt(1,6);
        numbers[1] = r.nextInt(1,6);
        numbers[2] = r.nextInt(1,6);
        numbers[3] = r.nextInt(1,6);
        numbers[4] = r.nextInt(1,6);
        numbers[5] = r.nextInt(1,6);
        numbers[6] = r.nextInt(1,6);
        numbers[7] = r.nextInt(1,6);
        numbers[8] = r.nextInt(1,6);
        numbers[9] = r.nextInt(1,6);
    }

    public int[] getNumbers()
    {
        return numbers;
    }
}
