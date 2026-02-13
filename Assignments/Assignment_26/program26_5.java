import java.util.*;

//////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//      Method Name:    Pattern
//      Description:    Displays first iNo even numbers starting from 2
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
        int iCnt = 0, iTwo = 0;

        for(iCnt = 1; iCnt <= iNo; iCnt++)
        {
            iTwo = iTwo + 2;
            System.out.print("\t"+iTwo);
        }
    }
}

class program26_5
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