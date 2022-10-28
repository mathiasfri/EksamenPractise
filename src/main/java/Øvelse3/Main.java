package Øvelse3;

public class Main
{
    public static void main(String[] args)
    {
        Raflebæger raflebæger = new Raflebæger(2);
        int sumAfTerninger = raflebæger.Ryst();
        String seTerninger = raflebæger.Se();

        System.out.println(sumAfTerninger);
        System.out.println(seTerninger);
    }
}
