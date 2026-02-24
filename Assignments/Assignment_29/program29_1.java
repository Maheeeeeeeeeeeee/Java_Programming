import java.util.*;

//////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//      Method Name:    Pattern
//      Description:    Displays a pattern of numbers from 1 to 9 repeatedly, filling iRow rows and iCol columns
//      Input:          int, int
//      Output:         void
//      Author:         Mahesh Dhanyakumar Boke
//      Date:           01-12-2025
//
/////////////////////////////////////////////////////////////////////////////////////////////////////////////

public class Display
{
    public void Pattern(int iRow, int iCol)
    {
        int iP1 = 0, iP2 = 0, iP3 = 0;
        iP3 = 1;

        for(iP1 = 1; iP1 <= iRow; iP1++)
        {   
            for(iP2 = 1; iP2 <= iCol; iP2++)
            {
                System.out.print(iP3+"\t");
                iP3++;

                if(iP3 > 9)
                {
                    iP3 = 1;
                }
            }
            System.out.print("\n");
        }   
    }
}

class program29_1
{
    public static void main(String A[])
    {
        int iValue1 = 0, iValue2 = 0;

        Scanner eobj = new Scanner(System.in);
        System.out.print("Enter number of rows and columns : ");
        iValue1 = eobj.nextInt();
        iValue2 = eobj.nextInt();
    
        Display dobj = new Display();
        dobj.Pattern(iValue1, iValue2);
    
    }
}