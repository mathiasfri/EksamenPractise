package Øvelse17;

import java.util.ArrayList;

public class Election
{
    ArrayList<Candidate> candidates;

    public Election(ArrayList<Candidate> candidates)
    {
        this.candidates = candidates;
    }

    public ArrayList<Candidate> getCandidates()
    {
        return candidates;
    }
    public int getTotalVotes()
    {
        int sum = 0;
        for (Candidate c : candidates)
        {
            sum += c.getNumberOfVotes();
        }
        return sum;
    }
}
