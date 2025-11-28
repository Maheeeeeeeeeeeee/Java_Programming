import java.util.*;

////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//      Function Name:  reverseNumber
//      Description:    Prints the digits of the number in reverse order
//      Input:          int
//      Output:         void
//      Author:         Mahesh Dhanyakumar Boke
//      Date:           27/11/2025
//
////////////////////////////////////////////////////////////////////////////////////////////////////////////

class Logic
{
    void reverseNumber(int num)
    {
        int iRev = 0, iCnt = 0;
        for(iCnt = num; iCnt > 0; iCnt = iCnt / 10)
        {
            iRev = iCnt % 10;

            System.out.println(iRev);
        }
    }
}

class program16_4
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.reverseNumber(1234);
    }
}