package Question4;

// Name: Kagisho Mogapi
// Student Number: 219001867

// Purpose :A java program that accepts a filename from user, creates two text files for
//          Cars and Bikes, and checks if a line from the filename that it starts with either
//          C or B making those with C get written to Cars while those with B to Bikes

import java.io.*;
import java.util.Scanner;


public class CarsAndBikes
{
    public static void main(String [] args) throws IOException
    {
        Scanner KB = new Scanner(System.in);
        String filename;
        System.out.println("Enter Filename");
        // File name is CarsAndBikes.txt
        filename = KB.nextLine();
        // display the contents of the main file
        displayFileContents(filename);
        // Now that we have seen the contents of the file.
        // we want to separate cars from the bikes
        // we make use of method separateCarsAndBikes

        separateCarsAndBikes(filename);

        //confirm the separation
        displayFileContents("cars.txt");
        displayFileContents("bikes.txt");
        KB.close();
    }

    //method displayFileContents

    public static void displayFileContents(String filename) throws FileNotFoundException
    {
        File fr = new File(filename);
        Scanner scanFile = new Scanner(fr);
        String line; // holds one line from filename
        System.out.println("Contents of file : "+filename);
        System.out.println();

        while(scanFile.hasNext())
        {
            line = scanFile.nextLine();
            System.out.println(line);
        }
        System.out.println();
        //close the file
        scanFile.close();
    }

    public static void separateCarsAndBikes(String filename) throws IOException
    {
        //complete the body of this method to create two text files
        //cars.txt will contain only cars
        //bikes.txt will contain only bikes


        String line; // holds one line from filename

        PrintWriter cars = new PrintWriter("cars.txt"); // Open's the cars text file
        PrintWriter bikes = new PrintWriter("bikes.txt"); // Open's the bikes text file

        File carsAndBikes = new File(filename);  // Open's the filename text file
        Scanner scanner = new Scanner(carsAndBikes); // Stores carsAndBikes to scanner object


        while (scanner.hasNext())
        {
            line = scanner.nextLine(); // One line is stored from filename

            if(line.charAt(0) == 'C') // Checks if line starts with C
            {
                cars.println(line);
            } // end if

            else if(line.charAt(0) == 'B') // Checks if line starts with B
            {
                bikes.println(line);
            } // end else if

        } // end while loop

        // Closing all files
        scanner.close();
        cars.close();
        bikes.close();

    }

}

