import java.util.*;

//////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
// Function Name: printDivisibiltyBy2and3
// Description: Prints all numbers from 1 to n that are divisible by both 2 and 3
// Input: int n
// Output: void
// Author: Mahesh Dhanyakumar Boke
// Date: 29/11/2025
//
/////////////////////////////////////////////////////////////////////////////////////////////////////////////

class Logic 
{
    void printDivisibiltyBy2and3(int n)
    {
        int iDiv = 0;

        for(iDiv = 1; iDiv <= n; iDiv++)
        {
            if(iDiv % 2 == 0 && iDiv % 3 == 0)
            {
                System.out.println(iDiv);
            }
        } 
    }
}

class program21_5
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.printDivisibiltyBy2and3(30);
    }
}