import java.util.*;

//////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
// Function Name: caculatePower
// Description: Calculates and prints the result of raising base to the given exponent
// Input: int base, int exp
// Output: void
// Author: Mahesh Dhanyakumar Boke
// Date: 29/11/2025
//
/////////////////////////////////////////////////////////////////////////////////////////////////////////////

class Logic
{
    void caculatePower(int base, int exp)
    {
        int iCnt = 0, iPwr = 1;

        for(iCnt = 1; iCnt <= exp; iCnt++)
        {
            iPwr = iPwr * base;
        } 

        System.out.println(iPwr);
    }
}

class program19_5
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.caculatePower(2, 5);
    }
}