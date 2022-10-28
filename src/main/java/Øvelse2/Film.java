package Øvelse2;

import java.time.LocalDate;

public class Film
{
    private int releaseYear;
    private String movieTitle;
    private Producer producer;

    public Film(int releaseYear, String movieTitle)
    {
        this.releaseYear = releaseYear;
        this.movieTitle = movieTitle;
    }

    public Film(String movieTitle, Producer producer)
    {
        this.movieTitle = movieTitle;
        this.releaseYear = LocalDate.now().getYear();
        this.producer = producer;
    }

    public void setProducer(Producer producer)
    {
        this.producer = producer;
    }

    @Override
    public String toString()
    {
        return "Film" + "\n" +
                "Release year: " + releaseYear + "\n" +
                "Movie title: " + movieTitle + "\n" +
                "Producer: " + producer;
    }
}
