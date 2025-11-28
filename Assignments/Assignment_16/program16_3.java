import java.util.*;

////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//      Function Name:  findFactorial
//      Description:    Calculates and prints factorial of the number
//      Input:          int
//      Output:         void
//      Author:         Mahesh Dhanyakumar Boke
//      Date:           27/11/2025
//
////////////////////////////////////////////////////////////////////////////////////////////////////////////

class Logic
{
    void findFactorial(int num)
    {
        int iCnt = 0, iFact = 1;

        for(iCnt = num; iCnt > 0;iCnt--)
        {
            iFact = iFact * iCnt;
        }
        System.out.println(iFact);
    }
}

class program16_3
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.findFactorial(5);
    }
}