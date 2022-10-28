package Øvelse13;

import java.util.Random;

public class JuleGave
{
    private boolean isSoft;
    private boolean isRectangular;
    private boolean doesRattle;
    Random r = new Random();

    public void trueFalse()
    {
        isSoft = r.nextBoolean();
        isRectangular = r.nextBoolean();
        doesRattle = r.nextBoolean();
    }

    public boolean couldBeLego()
    {
        if (!isSoft && isRectangular && doesRattle)
        {
            return true;
        }

        else
            return false;
    }
}
