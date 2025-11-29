import java.util.*;

//////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
// Function Name: sumEvenNumbers
// Description: Calculates and prints the sum of all even numbers from 0 up to the given number
// Input: int n
// Output: void
// Author: Mahesh Dhanyakumar Boke
// Date: 29/11/2025
//
/////////////////////////////////////////////////////////////////////////////////////////////////////////////

class Logic
{
    void sumEvenNumbers(int n)
    {
        int iNum = 0, iSum = 0;

        for(iNum = 0; iNum <= n; iNum++)
        {
            if(iNum % 2 == 0)
            {
                iSum = iSum + iNum;
            }
        }

        System.out.println("Sum of even numbers is " + iSum);
    }
}

class program20_1
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.sumEvenNumbers(10);
    }
}