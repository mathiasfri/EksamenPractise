package Øvelse16;

public class Main
{
    public static void main(String[] args)
    {
        ExamQuestion list[] = new ExamQuestion[14];

        ExamQuestion examQuestion1 = new ExamQuestion(1);
        ExamQuestion examQuestion2 = new ExamQuestion(2);
        ExamQuestion examQuestion3 = new ExamQuestion(3);
        ExamQuestion examQuestion4 = new ExamQuestion(4);
        ExamQuestion examQuestion5 = new ExamQuestion(5);
        ExamQuestion examQuestion6 = new ExamQuestion(6);
        ExamQuestion examQuestion7 = new ExamQuestion(7);
        ExamQuestion examQuestion8 = new ExamQuestion(8);
        ExamQuestion examQuestion9 = new ExamQuestion(9);
        ExamQuestion examQuestion10 = new ExamQuestion(10);
        ExamQuestion examQuestion11 = new ExamQuestion(11);
        ExamQuestion examQuestion12 = new ExamQuestion(12);
        ExamQuestion examQuestion13 = new ExamQuestion(13);
        ExamQuestion examQuestion14 = new ExamQuestion(14);

        list[0] = examQuestion1;
        list[1] = examQuestion2;
        list[2] = examQuestion3;
        list[3] = examQuestion4;
        list[4] = examQuestion5;
        list[5] = examQuestion6;
        list[6] = examQuestion7;
        list[7] = examQuestion8;
        list[8] = examQuestion9;
        list[9] = examQuestion10;
        list[10] = examQuestion11;
        list[11] = examQuestion12;
        list[12] = examQuestion13;
        list[13] = examQuestion14;

        for (ExamQuestion eq : list)
        {
            eq.setRandomGrade();
            System.out.println(eq);
        }
    }
}
