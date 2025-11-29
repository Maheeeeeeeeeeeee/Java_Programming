import java.util.*;

//////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
// Function Name: countEvenOddRange
// Description: Counts and prints the number of even and odd numbers from 1 up to the given number
// Input: int n
// Output: void
// Author: Mahesh Dhanyakumar Boke
// Date: 29/11/2025
//
/////////////////////////////////////////////////////////////////////////////////////////////////////////////

class Logic
{
    void countEvenOddRange(int n)
    {
        int iCnt = 0, iEvn = 0, iOdd = 0;

        for(iCnt = 1; iCnt <= n; iCnt++)
        {
            if(iCnt % 2 == 0)
            {
                iEvn = iEvn + 1;
            }

            if(iCnt % 2 != 0)
            {
                iOdd = iOdd + 1;
            }
        }
        System.out.println(iEvn);
        System.out.println(iOdd);
    }
}

class program21_2
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.countEvenOddRange(50);
    }
}