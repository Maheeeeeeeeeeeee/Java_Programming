import java.util.*;

//////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//      Method Name:    Pattern
//      Description:    Displays a pattern where each row contains the same number, starting from iRow down to 1, repeated iCol times
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
        int iP1 = 0, iP2 = 0;

        for(iP1 = iRow; iP1 > 0; iP1--)
        {   
            for(iP2 = 1; iP2 <= iCol; iP2++)
            {
                System.out.print(iP1+"\t");
            }
            System.out.print("\n");
        }   
    }
}

class program28_4
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