package Øvelse17;

public class Candidate
{
    private String name;
    private String party;
    private int numberOfVotes;

    public Candidate(String name, String party, int numberOfVotes)
    {
        this.name = name;
        this.party = party;
        this.numberOfVotes = numberOfVotes;
    }

    public int getNumberOfVotes()
    {
        return numberOfVotes;
    }

    @Override
    public String toString()
    {
        return
                "Name: " + name + "\n" +
                        "Party: " + party + "\n" +
                        "Votes: " + numberOfVotes + "\n";
    }
}
