//Program_1
/*Design a class Factorial to compute the factorial of a number.

    Class Name: Factorial

    Data Members:

        int n - integer whose factorial is to be calculated
        double f - stores factorial

    Member Functions:

        Factorial() - to initialise data members
        void read() - to accept values
        void fact() - to calculate factorial recursively
        void display() - to display number and its factorial*/
import java.util.*;
class Factorial
{
    int n;  // Creating instance variable to store number whose factorial is to be calculated
    double f;   // Stores factorial of the number
    Factorial() // Constructor to intialise values of instance variables
    {
        n = 0;  // Assigning 'n' with value 0
        f = 1;  // Assigning 'f' with value 1
    }
    void read() // Method to input data from the user
    {
        Scanner sc = new Scanner(System.in);    // Creating object of the Scanner class to input number from the user
        System.out.println("Enter a number below:");
        n = sc.nextInt();   //Storing number inputted in variable 'n'
    }
    void fact() // Method to calculate the factorial of a number recursively
    {
        if(n == 1)
        {
            f = f;  // Loop breaks if number reaches value one
        }
        else
        {
            f *= (n--); // Assigning value of factorial to f
            fact(); // Recursion takes place as long as n is not 1
        }
    }
    void display()  // Method to display factorial calculated
    {
        System.out.println("Factorial of "+n+": "+f);
    }
    public static void main() // Main method to call all member methods
    {
        Factorial obj = new Factorial();    // Creating object of class Factorial to call member methods
        obj.read(); // Calling void read() to input data
        obj.fact(); // Calling void fact() to compute factorial
        obj.display();  // Calling void display() to display the factorial calculated
    }
}
