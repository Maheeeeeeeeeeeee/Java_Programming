import java.util.*;

//////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
// Function Name: sumOfDigits
// Description: Calculates the sum of all digits present in the given integer and prints the result
// Input: int
// Output: void
// Author: Mahesh Dhanyakumar Boke
// Date: 27/11/2025
//
//////////////////////////////////////////////////////////////////////////////////////////////////////////////

class Logic
{
    void sumOfDigits(int num)
    {
        int iCnt = 0, iSum = 0;

        while(num > 0)
        {
            iCnt = num % 10;

            iSum = iSum + iCnt;

            num = num / 10;
        }
        System.out.println(iSum);
    }
}

class program17_1
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.sumOfDigits(1234);
    }
}