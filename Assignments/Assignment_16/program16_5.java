import java.util.*;

////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//      Function Name:  countDigits
//      Description:    Counts and prints the number of digits in a number
//      Input:          int
//      Output:         void
//      Author:         Mahesh Dhanyakumar Boke
//      Date:           27/11/2025
//
////////////////////////////////////////////////////////////////////////////////////////////////////////////

class Logic
{
    void countDigis(int num)
    {
        int iDigit = 0, iCnt = 0, iStr;
        for(iCnt = num; iCnt > 0; iCnt = iCnt / 10)
        {
           iDigit++;
        }
        
        System.out.println(iDigit);
    }
}

class program16_5
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.countDigis(7865);
    }
}