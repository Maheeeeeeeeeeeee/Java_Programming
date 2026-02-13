import java.util.*;

//////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//      Method Name:    Pattern
//      Description:    Description:    Displays numbers from 1 to iNo-1 with '#' before and '*' after each number
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

        for(iCnt = 1; iCnt < iNo; iCnt++)
        {
            System.out.print("#\t"+iCnt+"\t*\t");
        }
    }
}

class program26_4
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