package Øvelse4;

public class Cykel
{
    private String brand;
    private String color;
    private int price;

    public Cykel(String brand, String color, int price)
    {
        this.brand = brand;
        this.color = color;
        this.price = price;
    }

    public int getPrice()
    {
        return price;
    }

    @Override
    public String toString()
    {
        return  "\n" +
                "Brand: " + brand + "\n" +
                "Color: " + color + "\n" +
                "Price: " + price + "\n\n";
    }
}
