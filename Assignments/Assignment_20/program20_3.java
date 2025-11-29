import java.util.*;

//////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
// Function Name: checkPerfect
// Description: Checks whether the given number is a perfect number and prints the result
// Input: int n
// Output: void
// Author: Mahesh Dhanyakumar Boke
// Date: 29/11/2025
//
/////////////////////////////////////////////////////////////////////////////////////////////////////////////

class Logic
{
    void checkPerfect(int n)
    {   
        int iCnt = 0, iPft1 = 0;
        
        for(iCnt = 1; iCnt <= n/2; iCnt++)
        {
            if(n % iCnt == 0)
            {
                iPft1 = iPft1 + iCnt;
            }
        }

        if(iPft1 == n)
        {
            System.out.println(n + " is a perfect number");
        }
        else
        {
            System.out.println(n + " is not a perfect number");
        }
    }
}

class program20_3
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.checkPerfect(6);
    }
}