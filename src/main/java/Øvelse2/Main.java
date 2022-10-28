package Øvelse2;

public class Main
{
    public static void main(String[] args)
    {
        // Movies producer
        Film film1 = new Film(2018, "Ready Player One");
        System.out.println(film1);

        // Producer
        System.out.println("------------------------ \n");
        Producer producer1 = new Producer("Ernest Cline");

        film1.setProducer(producer1);
        System.out.println(film1);
    }
}
