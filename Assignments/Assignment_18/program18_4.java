import java.util.*;

//////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//      Function Name:  sumEvenOddDigits
//      Description:    Calculates and prints the sum of even digits and the sum of odd digits of a number
//      Input:          int
//      Output:         void
//      Author:         Mahesh Dhanyakumar Boke
//      Date:           27/11/2025
//
/////////////////////////////////////////////////////////////////////////////////////////////////////////////

class Logic
{
    void sumEvenOddDigits(int n)
    {
        int iCnt = 0, iSum = 0, iEven = 0, iOdd = 0;

        for(iCnt = n; iCnt > 0; iCnt = iCnt / 10)
        {
            iSum = iCnt % 10;

            if(iSum % 2 == 0)
            {
                iEven = iEven + iSum;
            }
            else
            {
                iOdd = iOdd + iSum;
            }
        }
        System.out.println(iEven);
        System.out.println(iOdd);
    }
}

class program18_4
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.sumEvenOddDigits(12345);
    }
}