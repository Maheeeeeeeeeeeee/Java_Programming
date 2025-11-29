import java.util.*;

//////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
// Function Name: findSmallestDigit
// Description: Finds and prints the smallest digit in the given number
// Input: int num
// Output: void
// Author: Mahesh Dhanyakumar Boke
// Date: 29/11/2025
//
/////////////////////////////////////////////////////////////////////////////////////////////////////////////

class Logic
{
    void findSmallestDigit(int num)
    {   
        int iDigit = 0, iSml = 0;

        if(num < 0)
        {
            num = -num;
        }

        iSml = 10;

        while(num > 0)
        {
            iDigit = num % 10;

            if(iDigit < iSml)
            {
                iSml = iDigit;
            }

            num = num / 10;
        }

        System.out.println("Smallest num is " + iSml);

    }
}

class program20_5
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.findSmallestDigit(45872);
    }
}