import java.util.*;

//////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//      Function Name:  calculateSum
//      Description:    Calculates and prints the sum from 0 to n
//      Input:          int
//      Output:         void
//      Author:         Mahesh Dhanyakumar Boke
//      Date:           26/11/2025
//
//////////////////////////////////////////////////////////////////////////////////////////////////////////////

class Logic
{
    void calculateSum(int n)
    {
        int iCnt = 0, iSum = 0;

        for(iCnt = 0; iCnt <= n; iCnt++)
        {
            iSum = iSum + iCnt;
        }

        System.out.println(iSum);
    }
}

class program16_1
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.calculateSum(10);
    }
}