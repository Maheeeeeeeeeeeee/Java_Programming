import java.util.*;

//////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//      Method Name:  Pattern
//      Description:    Displays first iNo uppercase letters starting from 'A'
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

        char ch = 'A';
        int iCnt = 0;

        for(iCnt = 1; iCnt <= iNo; iCnt++)
        {
            System.out.print(ch);
            ch++;
        }
    }
}

class program26_1
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