import java.util.*;

//////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//      Function Name:  printOddNumber
//      Description:    Prints all odd numbers from 1 up to the given number
//      Input:          int
//      Output:         void
//      Author:         Mahesh Dhanyakumar Boke
//      Date:           27/11/2025
//
/////////////////////////////////////////////////////////////////////////////////////////////////////////////

class Logic
{
    void printOddNumber(int n)
    {
        int iCnt = 0;

        for(iCnt = 1; iCnt <= n; iCnt++)
        {
            if(iCnt % 2 != 0)
            {
               System.out.println(iCnt);
            }
        }
    }
}

class program18_3
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.printOddNumber(20);
    }
}