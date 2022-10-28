package Øvelse17;

import java.util.ArrayList;

public class Main
{
    public static void main(String[] args)
    {
        ArrayList<Candidate> candidates = new ArrayList<>();
        Election election = new Election(candidates);

        Candidate candidate1 = new Candidate("Lars Løkke", "Moderaterne", 2000);
        election.getCandidates().add(candidate1);

        Candidate candidate2 = new Candidate("Mette Frederiksen", "Socialdemokratiet", 5000);
        election.getCandidates().add(candidate2);

        System.out.println("Total number of votes on all candidates: " + election.getTotalVotes());

        for (Candidate c : candidates)
        {
            System.out.println(c);
        }
    }
}
