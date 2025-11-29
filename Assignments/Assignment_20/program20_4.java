import java.util.*;

//////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
// Function Name: findLargestDigit
// Description: Finds and prints the largest digit in the given number
// Input: int num
// Output: void
// Author: Mahesh Dhanyakumar Boke
// Date: 29/11/2025
//
/////////////////////////////////////////////////////////////////////////////////////////////////////////////

class Logic
{
    void findLargestDigit(int num)
    {   
        int iDigit = 0, iLrg = 0;

        if(num < 0)
        {
            num = -num;
        }

        while(num > 0)
        {
            iDigit = num % 10;

            if(iDigit > iLrg)
            {
                iLrg = iDigit;
            }

            num = num / 10;
        }

        System.out.println("Largest num is " + iLrg);

    }
}

class program20_4
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.findLargestDigit(83429);
    }
}