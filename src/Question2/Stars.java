/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question2;


// Name: Kagisho Mogapi
// Student Number: 219001867

// Purpose :A java program that reproduces a given printout of stars
//          based on user input

import java.util.*;

public class Stars
{
    public static void main(String[] args) {
        Scanner KB = new Scanner(System.in);
        int userInput;

        String stars = ""; // To store stars

        System.out.println("Enter number of loops: ");
        userInput = KB.nextInt();

        // A subtraction since the last row does not appear
        userInput -= 1;

        while (userInput > 0)
        {
            for(int i = userInput ; 0 < i ; i--)
            {
                stars += "*";
            } // end for loop

            System.out.print(stars);
            System.out.println();
            stars = ""; // Empty the stars String

            userInput--;
        } // end while loop

        KB.close();
    }
}

