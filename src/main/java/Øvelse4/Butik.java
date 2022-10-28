package Øvelse4;

import java.util.ArrayList;

public class Butik
{
    private ArrayList<Cykel> bicycles = new ArrayList<>();

    public void add(Cykel cykel)
    {
        bicycles.add(cykel);
    }

    public ArrayList<Cykel> getBicycles()
    {
        return bicycles;
    }

    public Integer sumOfStock()
    {
        int overallPrice = 0;
        for (Cykel c : bicycles)
        {
            overallPrice += c.getPrice();
        }
        return overallPrice;
    }
}
