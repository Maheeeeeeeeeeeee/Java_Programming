import java.util.*;

//////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
// Function Name: countFactors
// Description: Counts and prints the number of factors of the given number (excluding the number itself)
// Input: int num
// Output: void
// Author: Mahesh Dhanyakumar Boke
// Date: 29/11/2025
//
/////////////////////////////////////////////////////////////////////////////////////////////////////////////

class Logic 
{
    void countFactors(int num)
    {
        int iCnt = 0, iFac = 0;

        for(iCnt = 1; iCnt <= num/2; iCnt++)
        {
            if(num % iCnt == 0)
            {
                iFac = iFac + 1;
            }
        }   
        System.out.println(iCnt);
    }
}

class program21_4
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.countFactors(20);
    }
}