package Øvelse16;

import java.util.Random;

public class ExamQuestion
{
    int number;
    char grade;
    Random r = new Random();

    public ExamQuestion(int number)
    {
        this.number = number;
    }

    public void setRandomGrade()
    {
        int number = r.nextInt(1, 7);

        switch (number)
        {
            case 1:
                grade = 'A';
                break;

            case 2:
                grade = 'B';
                break;

            case 3:
                grade = 'C';
                break;

            case 4:
                grade = 'D';
                break;

            case 5:
                grade = 'E';
                break;

            case 6:
                grade = 'F';
                break;
        }
    }

    @Override
    public String toString()
    {
        return  "\nNumber: " + number + "\n" +
                "Grade: " + grade;
    }
}
