package Question3;

// Name: Kagisho Mogapi
// Student Number: 219001867

// Purpose :A java program that generates a random number from 0 to 1,
//          displays ON for 1 and OFF for 0, and displays how many
//          times either of them were displayed.

import java.util.Random;

public class OnOffSwitch
{
    public static void main(String [ ] args)
    {
        Random random = new Random(); // Random object
        int randomNumber; // Stores the random number
        int offTimes = 0; // Stores how many times OFF was displayed
        int onTimes = 0; // Stores how many times ON was displayed

        for(int i = 0; i < 10; i++)
        {
            randomNumber = random.nextInt(2); // Generates random number(0 - 1)

            if(randomNumber == 0)
            {
                System.out.println("OFF"); // Display's OFF for 0
                offTimes++; // Counter for displays of OFF
            } // end if

            else if(randomNumber == 1)
            {
                System.out.println("ON"); // Display's ON for 1
                onTimes++; // Counter for displays of ON
            } // end else if

        } // end for loop

        System.out.println();

        // Displays how many times On/OFF were displayed
        System.out.println("ON: "+onTimes+ "\nOFF: "+offTimes);
    }
}

