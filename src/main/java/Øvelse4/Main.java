package Øvelse4;

public class Main
{

    public static void main(String[] args)
    {
        Butik butik = new Butik();

        Cykel cykel1 = new Cykel("Mate", "Black", 9999);
        butik.add(cykel1);

        Cykel cykel2 = new Cykel("Serious", "Yellow", 1899);
        butik.add(cykel2);

        System.out.println(butik.getBicycles());

        System.out.println("Price of all stock: " + butik.sumOfStock());
    }
}
