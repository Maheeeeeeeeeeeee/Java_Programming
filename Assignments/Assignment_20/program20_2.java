import java.util.*;

//////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
// Function Name: printReverse
// Description: Prints numbers from the given number down to 1 in reverse order
// Input: int n
// Output: void
// Author: Mahesh Dhanyakumar Boke
// Date: 29/11/2025
//
/////////////////////////////////////////////////////////////////////////////////////////////////////////////

class Logic
{
    void printReverse(int n)
    {
        int iNum = 0;

        for(iNum = n; iNum > 0; iNum--)
        {
            System.out.println(iNum);
        }
    }
}

class program20_2
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.printReverse(10);
    }
}