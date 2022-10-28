package Øvelse5;

import java.util.Arrays;

public class Main
{
    public static void main(String[] args)
    {
        Tal tal = new Tal();

        System.out.println(tal.returnRandom());

        tal.makeLotsOfNumbers();
        System.out.println(Arrays.toString(tal.getNumbers()));
    }
}
