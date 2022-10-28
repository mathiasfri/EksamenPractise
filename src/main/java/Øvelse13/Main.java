package Øvelse13;

public class Main
{
    public static void main(String[] args)
    {
        JuleGave juleGave = new JuleGave();

        while (!juleGave.couldBeLego())
        {
            juleGave.trueFalse();

            if (juleGave.couldBeLego())
            {
                System.out.println("It's lego!");
            } else
                System.out.println("Not lego :-(");
        }
    }
}