import java.util.*;

//////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//      Method Name:    Pattern
//      Description:    Displays numbers from iNo down to 1 with '#' after each number
//      Input:          int
//      Output:         void
//      Author:         Mahesh Dhanyakumar Boke
//      Date:           01-12-2025
//
/////////////////////////////////////////////////////////////////////////////////////////////////////////////

public class Display
{
    static void Pattern(int iNo)
    {
        int iCnt = 0;

        for(iCnt = iNo; iCnt > 0; iCnt--)
        {
            System.out.print(iCnt+"   #   ");
        }
    }
}

class program26_2
{
    public static void main(String A[])
    {
        int iValue = 0;

        Scanner eobj = new Scanner(System.in);
        System.out.print("Enter number of elements: ");

        iValue = eobj.nextInt();

        Display.Pattern(iValue);
    }
}