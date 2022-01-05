/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question1;

// Name: Kagisho Mogapi
// Student Number: 219001867

// Purpose: A java program that accepts the age and driving experience of a driver
//          and prints out a message for the correct risk profile.

import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        Scanner KB = new Scanner(System.in);
        System.out.println("Enter Age:");
        double age = KB.nextDouble();
        System.out.println("Enter Driving Experience(Months):");
        double experience = KB.nextDouble();

        String riskProfile; //To store risk profiles

        if(age <= 21 ) // For anyone who's age is less than 22
        {
            if(experience <= 18) // For anyone who's driving experience is less than 19 months
            {
                riskProfile = "Very High Risk";
            } //end if

            else // For anyone who's driving experience is greater than 18 months
            {
                riskProfile = "High Risk";
            } // end else
        } //end if

        else // For anyone who's age is greater than 21
        {
            if(experience <= 18) // For anyone who's driving experience is less than 19 months
            {
                riskProfile = "Moderate Risk";
            } //end if

            else // For anyone who's driving experience is greater than 18 months
            {
                riskProfile = "Low Risk";
            } // end else
        } //end else

        System.out.println("Risk Profile: "+riskProfile); // Displays the risk profile
        KB.close();
    }
}
