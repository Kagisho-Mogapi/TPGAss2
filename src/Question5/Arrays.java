package Question5;

// Name: Kagisho Mogapi
// Student Number: 219001867

// Purpose :A java program containing three parallel array with 10 elements each. those arrays hold
//          4-digit student ID Numbers, first names and student’s matric AP score (0 – 42).
//          The program will accept the student ID from user and display its related content, and if the
//          student ID is not found it will display an error message and allow the user to search, on both
//          cases.


import java.util.Scanner;

public class Arrays
{
    public static void main(String[] args)
    {
        int [] idNums = {1111,2222,3333,4444,5555,6666,7777, 8888,9999,1010};
        String [] firstNames = {"John","Mary", "Peter", "Joe", "Phillip", "Mark", "Paul", "Julius", "Jane","Mathew"};
        int [] APScore = {23,26,40,32,36,16,27,23,34,30};

        Scanner KB = new Scanner(System.in);
        char answer; // Answer for another search
        int studNum; // The searched student ID
        boolean found = false; // Flag for if the student ID is found or not

        do // start do while loop
        {
            System.out.println("Enter the Student ID Numuber :");
            studNum = KB.nextInt(); // Store's the student ID a user is searching for

            for(int i = 0;i < idNums.length && !found; i++)
            {
                if(idNums[i] == studNum)
                {
                    found = true;

                    // Displays all related data of the found student ID
                    System.out.println();
                    System.out.println("Student Info:" +
                                        "\nIDNum : "+ idNums[i] +
                                        "\nFirst names : "+ firstNames[i] +
                                        "\nAP Score : "+APScore[i]);

                    System.out.println();
                } // end if
            } // end for loop

            if(!found)
            {
                // displays an error message for the not found student ID
                System.out.println("Sorry. The Student with ID Number "+studNum+" is not found in the array");
                System.out.println();
            } // end if

            System.out.println("Would You Like to Search another Num?(Y/N)");
            answer = KB.next().charAt(0);

            if(answer == 'N' || answer == 'n')
            {
                System.out.println("Program Terminated");
            } // end if

            System.out.println();

            // found flag must be set to default in case the student ID was found so that a new student ID can be searched
            found = false;

        }while (answer == 'Y' || answer == 'y'); // end do while loop
        KB.close();
    }
}
