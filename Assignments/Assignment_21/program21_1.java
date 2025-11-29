import java.util.*;

//////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
// Function Name: productOfDigits
// Description: Calculates and prints the product of all digits in the given number
// Input: int n
// Output: void
// Author: Mahesh Dhanyakumar Boke
// Date: 29/11/2025
//
/////////////////////////////////////////////////////////////////////////////////////////////////////////////

class Logic
{
    void productOfDigits(int n)
    {
        int iNum = 0, iPrd = 1, iMod = 0;

        for(iNum = n; iNum > 0; iNum = iNum / 10)
        {
            iMod = iNum % 10;
            iPrd = iPrd * iMod;
        }

        System.out.println("Product of Digits is " + iPrd);
    }
}

class program21_1
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.productOfDigits(234);
    }
}