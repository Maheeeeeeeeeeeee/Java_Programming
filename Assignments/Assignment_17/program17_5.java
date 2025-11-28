import java.util.*;

//////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
// Function Name: printTable
// Description: Prints the multiplication table of the given integer from 1 to 10
// Input: int
// Output: void
// Author: Mahesh Dhanyakumar Boke
// Date: 27/11/2025
//
//////////////////////////////////////////////////////////////////////////////////////////////////////////////

class Logic
{
    void printTable(int num)
    {
        int iCnt = 0;

        for(iCnt = 1; iCnt <= 10; iCnt++)
        {
            System.out.println(iCnt * num);
        }
    }
}

class program17_5
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.printTable(5);
    }
}

