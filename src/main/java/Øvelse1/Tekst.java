package Øvelse1;

import java.util.ArrayList;

public class Tekst
{
    public static ArrayList<String> tekstLinjer = new ArrayList<>();

    public static void main(String[] args)
    {
        add();

        System.out.println("Antal unikke elementer i array er: " + findNumberUnique());
    }

    public static void add()
    {
        tekstLinjer.add("hej");
        tekstLinjer.add("hej");
        tekstLinjer.add("hej2");
        tekstLinjer.add("hej3");
    }

    public static int findNumberUnique()
    {
        ArrayList<String> duplicates = new ArrayList<>();

        for (String s : tekstLinjer)
        {
            if (!duplicates.contains(s))
            {
                duplicates.add(s);
            }
        }
        return duplicates.size();
    }
}
