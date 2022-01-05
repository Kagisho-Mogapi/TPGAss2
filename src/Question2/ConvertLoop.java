/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question2;

// Name: Kagisho Mogapi
// Student Number: 219001867

// Purpose :A for loop java program that produces the exact
//          same output as produced by the given while…loop.

public class ConvertLoop
{
    public static void main(String[] args)
    {
        int k = 5; // int k is initialized with 5

        for (int i = 0 ; i < 5 && k < 20; i++)
        {
            System.out.println(i + ":"+k);
            k += 5;
        } // end for loop
    }
}

