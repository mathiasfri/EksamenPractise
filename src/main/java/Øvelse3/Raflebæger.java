package Øvelse3;

import java.util.ArrayList;
import java.util.Random;

public class Raflebæger
{
    private int antalTerninger;
    private ArrayList<Object> terningerØjne = new ArrayList<>();

    public Raflebæger(int antalTerninger)
    {
        this.antalTerninger = antalTerninger;
    }

    public int Ryst()
    {
        Random r = new Random();

        int sum = 0;
        for (int i = 0; i < antalTerninger; i++)
        {
            int randomEyes = r.nextInt(6) + 1;
            sum += randomEyes;

            terningerØjne.add(randomEyes);
        }
        return sum;
    }

    public String Se()
    {
        return terningerØjne.toString();
    }
}
